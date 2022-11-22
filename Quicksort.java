package algorithms;

import java.util.Random;

public class Quicksort {

	public static void main(String[] args) {
		Random rand = new Random();
		int [] numbers = new int[10000];
		//int [] numbers = new int[10];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(10000);
		}
		
		System.out.println("Before:");
		//printArray(numbers);
		
		quicksort(numbers, 0, numbers.length - 1);
		
		System.out.println("\nAfter:");
		//printArray(numbers);

	}
	
	private static void quicksort(int[] array, int lowIndex, int highIndex) {
		
		//if left pointer is greater then right pointer, return 
		//dealing with subarry of one element, so just return it
		if (lowIndex >= highIndex) {
			return;
		}
		
		//choose a pivot at random
		int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
		int pivot = array[pivotIndex];
		
		//swap pivot to last index in array
		swap(array, pivotIndex, highIndex);
		
		int leftPointer = partition(array, lowIndex, highIndex, pivot);
		
		
		//now we recursively quick sort the partition to the left of the pivot
		//and recursively quick sort the partition to the right of the pivot
		quicksort(array, lowIndex, leftPointer - 1);
		quicksort(array, leftPointer + 1, highIndex);
	}

	private static int partition(int[] array, int lowIndex, int highIndex, int pivot) {
		int leftPointer = lowIndex;
		int rightPointer = highIndex;
		
		while (leftPointer < rightPointer) {
			//increment leftPointer until it finds a value bigger than pivot or until it reaches right Pointer
			while (array[leftPointer] <= pivot && leftPointer < rightPointer) {
				leftPointer++;
			}
			
			//decrement right pointer until it finds a value smaller than the pivot or until it reaches leftPoitner
			while (array[rightPointer] >= pivot && leftPointer < rightPointer) {
				rightPointer--;
			}
			
			//swap
			swap(array, leftPointer, rightPointer);
		}
		
		//once our left and right pointer meet
		//we want to swap our pivot at that index
		//after this the partitioning step is done
		//the numbers that are lower than the pivot are to the left of it
		//the numbers that are hight than the pivot are to the right of it
		swap(array, leftPointer, highIndex);
		return leftPointer;
	}
	
	private static void swap(int[] array, int leftIndex, int rightIndex) {
		int temp = array[leftIndex];
		array[leftIndex] = array[rightIndex];
		array[rightIndex] = temp;
	}
	
	private static void printArray(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
