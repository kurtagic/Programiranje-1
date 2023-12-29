import java.util.*;

public class Ptabela {
	private int[] dimensions;
	private int[] pArray;
	
	public Ptabela() {
		this(new int[]{0});
	}
	public Ptabela(int[] dimensions) {
		this.dimensions = dimensions;
		int size = getSize(dimensions);		
		this.pArray = new int[size];
	}
	
	private int getLinearIndex(int[] indexes) {
		int index = 0;
		int decimalShift = (int) Math.pow(10, dimensions.length - 1);
		
		for(int i = 0; i < this.dimensions.length; i++) {
			index += indexes[i] * decimalShift;
			decimalShift /= 10;
		}

		return index;
	}
	
	private int getSize(int[] dimensions) {
		for(int dimension : dimensions) {
			dimension--;
		}
		
		return getLinearIndex(dimensions);
	}
	
	public void nastavi(int[] indexes, int value) {
		int index = getLinearIndex(indexes);
		pArray[index] = value;
	}
	
	public int vrni(int[] indexes) {	
		int index = getLinearIndex(indexes);
		return pArray[index];
	}
	
	public Ptabela podtabela(int[] indexes) {
		int[] subDimensions = getSubArrayDimensions(indexes);
		// if(indexes.length == 0) return createCopy(this);
		Ptabela subArray = new Ptabela(subDimensions);
		
		int startIndex = getSubArrayStartIndex(indexes);
		int endIndex = startIndex + subArray.pArray.length - 1;
		
		// System.out.println("DIMENSIONS: " + Arrays.toString(dimensions));
		// System.out.println("INDEXES: " + Arrays.toString(indexes));
		// System.out.println("NEW DIMENSIONS: " + Arrays.toString(subDimensions));        
		// System.out.println("START INDEX: " + startIndex);
		// System.out.println("END INDEX: " + endIndex);
		
		int k = 0;
		for(int i = startIndex; i <= endIndex; i++) {
			subArray.pArray[k] =  pArray[i];
			System.out.printf("VALUE: i=%d %d\n", i, subArray.pArray[k]);
			k++;
		}
		
		return subArray;
    }
	
	private Ptabela createCopy(Ptabela original) {
		Ptabela copy = new Ptabela(original.dimensions);
		for(int i = 0; i < copy.pArray.length; i++) {
			copy.pArray[i] = original.pArray[i];
		}
		return copy;
	}
	
	private int[] getSubArrayDimensions(int[] indexes) {
		int[] subDimensions = new int[this.dimensions.length - indexes.length];
		
		int k = 0;
		for(int i = 0; i < this.dimensions.length; i++) {
			if(i < indexes.length) continue;
			subDimensions[k] = dimensions[i];
			k++;
		}
		
		return subDimensions;
	}
	
	private int getSubArrayStartIndex(int[] indexes) {
		int start = 0;
		int decimalShift = (int) Math.pow(10, dimensions.length - 1);
		
		for(int i = 0; i < indexes.length; i++) {
			if(indexes.length == i) break;
			start += indexes[i] * decimalShift;
			decimalShift /= 10;
		}

		return start;
	}
	
	// @Override
	// public String toString() {
		// return arrayToString(pArray, dimensions);
	// }

	// private String arrayToString(int[] array, int[] dimensions) {
		// if (dimensions.length == 1) return Arrays.toString(array);
		
		// StringBuilder result = new StringBuilder("[");
		// int subArraySize = dimensions[0] - 1;

		// for (int i = 0; i < subArraySize; i++) {
			// int startIndex = i * subArraySize;
			// int endIndex = startIndex + subArraySize;
			
			// int[] subArray = Arrays.copyOfRange(array, startIndex, endIndex);
			
			// result.append(arrayToString(subArray, Arrays.copyOfRange(dimensions, 1, dimensions.length)));
			// if (i < subArraySize - 1) result.append(", ");
		// }
		
		// result.append("]");

		// return result.toString();
	// }
	
	@Override
	public String toString() {
		return arrayToString(pArray, dimensions);
	}

	private String arrayToString(int[] array, int[] dimensions) {
		if (dimensions.length == 1) return Arrays.toString(array);
		
		StringBuilder result = new StringBuilder("[");
		int subArraySize = dimensions[0];
		int startIndex = 0;
		int endIndex = subArraySize - 1;
		
		for (int i = 0; i < subArraySize; i++) {
			int[] subArray = Arrays.copyOfRange(array, startIndex, endIndex);
			result.append(arrayToString(subArray, Arrays.copyOfRange(dimensions, 1, dimensions.length)));
			if (i < subArraySize - 1) result.append(", ");
			startIndex += subArraySize;
			endIndex += subArraySize;
		}
		
		result.append("]");

		return result.toString();
	}
	
}