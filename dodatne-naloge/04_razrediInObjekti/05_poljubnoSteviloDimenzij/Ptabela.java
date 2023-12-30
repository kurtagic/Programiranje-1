import java.util.*;

public class Ptabela {
	private int[] dimensions;
	private int[] pArray;
	
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
		int startIndex = getLinearIndex(Arrays.copyOf(indexes, this.dimensions.length));
		int endIndex = getLinearIndex(getEndIndexArray(indexes));
		int[] subDimensions = Arrays.copyOfRange(this.dimensions, indexes.length, this.dimensions.length);
		
		Ptabela subArray = new Ptabela(subDimensions);
		
		System.arraycopy(pArray, startIndex, subArray.pArray, 0, subArray.pArray.length);
		
		// System.out.println(startIndex);	
		// System.out.println(endIndex);
		// System.out.println(Arrays.toString(subDimensions));
		
		return subArray;
    }
	
	private int[] getEndIndexArray(int[] indexes) {
		int[] end = Arrays.copyOf(indexes, this.dimensions.length);
		for(int i = 0; i < this.dimensions.length; i++) {
			if(i < indexes.length) continue;
			end[i] = dimensions[i] - 1;
		}
		
		return end;
	}
	
	@Override
	public String toString() {
		return arrayToString(pArray, dimensions);
	}

	private String arrayToString(int[] array, int[] dimensions) {
		if (dimensions.length == 1) return Arrays.toString(array);
		
		StringBuilder str = new StringBuilder("[");
		int subArraySize = dimensions[0];
		int startIndex = 0;
		int endIndex = subArraySize - 1;
		
		for (int i = 0; i < subArraySize; i++) {
			int[] subArray = Arrays.copyOfRange(array, startIndex, endIndex);
			int[] subDimensions = Arrays.copyOfRange(dimensions, 1, dimensions.length);
			str.append(arrayToString(subArray, subDimensions));
			if (i + 1 < subArraySize) str.append(", ");
			
			startIndex += subArraySize;
			endIndex += subArraySize;
		}
		
		str.append("]");

		return str.toString();
	}
}