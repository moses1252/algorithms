package algorithms;

import java.util.Random;

//time complexity
//best: O(n)
//average: O(n^2) 
//worst: O(n^2)

//space complexity
//worst: (1)



public class Insertionsort {
	public static void main(String[] args) {
		Random rand = new Random();
		int[] numbers = new int[1000];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100000) + 1;
		}

		System.out.println("Before:");
		Main.printArray(numbers);

		insertionSort(numbers);

		System.out.println("\nAfter:");
		Main.printArray(numbers);
	}
	
	private static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			
			int currentValue = arr[i];
			
			//set j to look at value one before arr[i]
			int j = i - 1;
			
			//stop while loop once we hit beginning of our array
			//and keep going until value is arr[j] is greater then arr[i]
			while (j >= 0 && arr[j] > currentValue) {
				//shift value to the right
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = currentValue;
		}
	}
}
