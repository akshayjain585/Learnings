package practicePrograms;

public class ExampleBubbleSort {

	public static void main(String[] args) {

		int[] numbers = { 10, 5, 7, 3, 2 };

		bubbleSort(numbers);
		printArray(numbers);

	}

	public static int[] bubbleSort(int[] A) {

		for (int i = 0; i < A.length - 1; i++) {

			for (int j = 0; j < A.length - 1 - i; j++) {

				if (A[j] > A[j + 1]) {
					int temp = A[j + 1];
					A[j + 1] = A[j];
					A[j] = temp;
				}
			}
		}

		return A;

	}

	public static void printArray(int[] A) {
		for (int i = 0; i < A.length; i++) {
			System.out.println("The sorted array would be :- " + A[i]);
		}
	}
}
