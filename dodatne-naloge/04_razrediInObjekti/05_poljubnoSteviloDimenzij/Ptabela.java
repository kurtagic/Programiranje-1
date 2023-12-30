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
		int[] startArray = new int[this.dimensions.length];
		int subLength = this.dimensions.length - indexes.length;
		int[] subDimensions = new int[subLength];
		
		System.arraycopy(indexes, 0, startArray, 0, indexes.length);
		System.arraycopy(this.dimensions, indexes.length, subDimensions, 0, subLength);
		
		int startIndex = getLinearIndex(startArray);		
		Ptabela subArray = new Ptabela(subDimensions);
		
		System.arraycopy(pArray, startIndex, subArray.pArray, 0, subArray.pArray.length);
		
		return subArray;
    }
	
	@Override
	public String toString() {
		if (this.dimensions.length == 1) return Arrays.toString(pArray);
		return arrayToString(pArray, this.dimensions, 0, this.dimensions[1]);
	}

	private String arrayToString(int[] array, int[] dimensions, int startIndex, int length) {
		if (dimensions.length == 1) return Arrays.toString(array);
		int subsCount = dimensions[0];
		int subsLength = dimensions[1];
		
		StringBuilder str = new StringBuilder("[");
		
		for (int i = 0; i < subsCount; i++) {
			int[] subArray = new int[length];
			int[] subDimensions = new int[dimensions.length - 1];
			
			System.arraycopy(dimensions, 1, subDimensions, 0, dimensions.length - 1);
			System.arraycopy(array, startIndex, subArray, 0, length);
			
			// System.out.printf("SUBARRAY: %s\n", Arrays.toString(subArray));
			// System.out.printf("DIMENSIONS: %s\n", Arrays.toString(subDimensions));
			// System.out.printf("START INDEX: %s\n", startIndex);
			// System.out.printf("LENGTH: %s\n", subsLength);
			// System.out.printf("DIMENSIONS LENGTH: %s\n", dimensions.length);
			// System.out.println("-----------------");
			
			str.append(arrayToString(subArray, subDimensions, startIndex, subsLength));
			if (i < subsCount - 1) str.append(", ");
			
			startIndex += 10;
		}
		
		str.append("]");

		return str.toString();
	}
}