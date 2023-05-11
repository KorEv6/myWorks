package javapack;

public class SelectionSort {
	public static void selectionSort(int[] a) {
		selectionSort(a, a.length);
	}

	public static void selectionSort(int[] a, int size) {
		for (int i = 0; i < size - 1; i++) {
			int min_index = i;// i = 1, j = 2, min_index = 2

			for (int j = i + 1; j < size; j++) {
				if (a[j] < a[min_index]) {
					min_index = j;
				}
			}
			swap(a, min_index, i);

		}

	}

	public static void swap(int[] a, int i, int j) {
		int min = a[i];// 20
		a[i] = a[j];
		a[j] = min;

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 7, 40, 44, 43, 33, 29, 50 };

		selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
