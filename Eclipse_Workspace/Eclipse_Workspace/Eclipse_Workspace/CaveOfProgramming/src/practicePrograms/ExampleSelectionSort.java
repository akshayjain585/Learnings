package practicePrograms;

public class ExampleSelectionSort {

	public static void main(String[] args) {

		int[] numbers = { 10, 5, 3, 7, 2 };

		selectionSort(numbers);
		printArray(numbers);
	}

	public static int[] selectionSort(int[] A) {

		for (int i = 0; i < A.length - 1; i++) {
			int minIndexed = i;
			for (int j = i + 1; j < A.length; j++) {
				if (A[j] < A[minIndexed]) {
					minIndexed = j;
				}
			}

			int temp = A[minIndexed];
			A[minIndexed] = A[i];
			A[i] = temp;
		}
		return A;
	}

	public static void printArray(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.println("The Sorted Selection sort array would be :- "
					+ A[i]);
		}
	}

}
