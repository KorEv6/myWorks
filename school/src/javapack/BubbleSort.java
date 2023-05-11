package javapack;

public class BubbleSort {
	public static void bubbleSort(int[] a) {
		bubbleSort(a, a.length);
	}

	public static void bubbleSort(int[] a, int size) {
		for (int i = 1; i < size; i++) {
			for (int j = 0; j < size - i; j++) {
				if (a[j] > a[j + 1]) { 
					swap(a, j, j + 1);
				}
			}
		}
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 7, 40, 44, 43, 33, 29, 50 };
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr + " ");
		}

	}

}
