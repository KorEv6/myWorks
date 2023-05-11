package javapack;

public class QuickSort {
	public static void quickSort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}

	public static void quickSort(int[] a, int lo, int hi) {
		if (lo >= hi) {
			return;
		}
		int pivot = partition(a, lo, hi);
		quickSort(a, lo, pivot - 1);
		quickSort(a, pivot + 1, hi);
	}

	public static int partition(int[] a, int left, int right) {
		int lo = left;
		int hi = right;
		int pivot = a[right];
		while (lo < hi) {
			while (a[lo] < pivot && lo < hi) {
				lo++;
			}
			while (a[hi] >= pivot && lo < hi) {
				hi--;
			}

			swap(a, lo, hi);

		}

		swap(a, right, hi);
		return hi;
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = a[i];
	}

	public static void main(String[] args) {
		int[] arr = new int[] { 10, 10, 20, 33, 50, 70 };
		quickSort(arr);
		System.out.println(arr);

	}

}
