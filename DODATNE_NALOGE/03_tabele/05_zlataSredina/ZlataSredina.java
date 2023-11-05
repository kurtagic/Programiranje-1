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
		quickSort(zaporedje, 0, zaporedje.length - 1);
		
		System.out.println(zaporedje[k]);
	}
	
	private static void quickSort(int[] array, int low, int high) {
		if (low < high) {
			int pi = partition(array, low, high);
			quickSort(array, low, pi - 1);
			quickSort(array, pi + 1, high);
		}
	}
	
	private static int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = (low - 1);

		for (int j = low; j < high; j++) {
			if (array[j] < pivot) {
				i++;
				swap(array, i, j);
			}
		}
		
		swap(array, i + 1, high);
		
		return i + 1;
	}
	
	private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}  