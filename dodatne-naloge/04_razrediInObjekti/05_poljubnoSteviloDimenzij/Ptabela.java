import java.util.*;

//
// TODO: 
// public Ptabela podtabela(int[] indexes)
// public String toString()
//

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
		// for(int dimension : dimensions) {
			// dimension--;
		// }
		
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
		return arrayToString(pArray, this.dimensions);
	}

	private String arrayToString(int[] array, int[] dimensions) {
		if(dimensions.length == 1) return Arrays.toString(array);
		
		String subArrays = "";
		int subArraysCount = dimensions[0];
		int subArraysSize = dimensions[1];
		int subDimensionsSize = dimensions.length;
		
		int startIndex = 0;
		int endIndex = subArraysSize;

		for(int i = 0; i < subArraysCount; i++) {			
			int[] subArray = Arrays.copyOfRange(array, startIndex, endIndex);
			int[] subDimensions = Arrays.copyOfRange(dimensions, 1, subDimensionsSize);
			
			subArrays += arrayToString(subArray, subDimensions);
			
			if(i + 1 < subArraysCount) subArrays += ", ";

			startIndex += subArraysSize;
			endIndex += subArraysSize;
		}
		
		return "[" + subArrays + "]";
	}
}