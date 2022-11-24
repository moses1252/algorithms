package algorithms;

import java.util.Random;

public class Mergesort {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[10];
		
		for (int i = 0; i < numbers. length; i++) {
			numbers[i] = rand.nextInt(1000000);
		}
		
		System.out.println("Before:");
		Main.printArray(numbers);
		
		mergeSort(numbers);
		
		System.out.println("\nAfter:");
		Main.printArray(numbers);

	}

	private static void mergeSort(int[] array) {
		//var for length of array
		int len = array.length;
		
		//return if array is empty or has only one value
		if (len < 2) {
			return;
		}
		
		//get the middle index
		int midIndex = len / 2;
		int[] leftHalf = new int[midIndex];
		int[] rightHalf = new int[len - midIndex];
		
		//store left side of array in leftHalf
		for (int i = 0; i < midIndex; i++) {
			leftHalf[i] = array[i];
		}
		//store right side of array in rightHalf
		for (int i = midIndex; i < len; i++) {
			rightHalf[i - midIndex] = array[i];
		}
		
		mergeSort(leftHalf);
		mergeSort(rightHalf);
		
		//Merge
		merge(array, leftHalf, rightHalf);
	}
	
	private static void merge(int[] array, int[]leftHalf, int[] rightHalf) {
		int leftSize = leftHalf.length;
		int rightSize = rightHalf.length;
		
		int i = 0, j = 0, k = 0;
		
		while (i < leftSize && j < rightSize) {
			if (leftHalf[i] <= rightHalf[j]) {
				array[k] = leftHalf[i];
				i++;
			} else {
				array[k] = rightHalf[j];
				j++;
			}
			k++;
		}
		
		while (i < leftSize) {
			array[k] = leftHalf[i];
			i++;
			k++;
		}
		while (j < rightSize) {
			array[k] = rightHalf[j];
			j++;
			k++;
		}
	}
}
