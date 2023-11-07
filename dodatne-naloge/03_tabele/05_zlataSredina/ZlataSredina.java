import java.util.*;

public class ZlataSredina {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		int[] zaporedje = new int[2*k + 1];
		for(int i = 0; i < zaporedje.length; i++) {
			int n = sc.nextInt();
			zaporedje[i] = n;
		}
		
		// Arrays.sort(zaporedje);
		quicksort(zaporedje);
		
		System.out.println(zaporedje[k]);
	}
	
	private static void quicksort(int[] array) {
		quicksort(array, 0, array.length - 1);
	}

	private static void quicksort(int[] array, int lowIndex, int highIndex) {

		if (lowIndex >= highIndex) return;
    

		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = array[pivotIndex];
		swap(array, pivotIndex, highIndex);

		int leftPointer = partition(array, lowIndex, highIndex, pivot);

		quicksort(array, lowIndex, leftPointer - 1);
		quicksort(array, leftPointer + 1, highIndex);
	}

	private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex - 1;

		while (leftPointer < rightPointer) {

			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}

			while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}

			swap(array, leftPointer, rightPointer);
		}
    
		if(array[leftPointer] > array[highIndex]) {
			swap(array, leftPointer, highIndex);
		} else {
			leftPointer = highIndex;
		}
    
		return leftPointer;
	}

	private static void swap(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}
}