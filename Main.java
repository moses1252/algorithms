package algorithms;

public class Main {
	
	public static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	public static void swap(int[] array, int leftIndex, int rightIndex) {
		int temp = array[leftIndex];
		array[leftIndex] = array[rightIndex];
		array[rightIndex] = temp;
	}
	
	public static int middleIndex(int[] array, int start, int end) {
		return start + (end - start) / 2;
	}

}
