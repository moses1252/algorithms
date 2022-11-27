package algorithms;

import java.util.Random;

public class Bubblesort {
	
	  public static void main(String[] args) {

		    Random rand = new Random();
		    int[] numbers = new int[100];
		    
		    for (int i = 0; i < numbers.length; i++) {
		      numbers[i] = rand.nextInt(1000000);
		    }
		    
		    System.out.println("Before:");
		    Main.printArray(numbers);
		    
		    //Sorting algorithm here
		    boolean swappedSomething = true;
		    
		    while (swappedSomething) {
		      swappedSomething = false;
		      
		      for (int i = 0; i < numbers.length - 1; i++) {
		        if (numbers[i] > numbers[i + 1]) {
		          swappedSomething = true;
		          int temp = numbers[i];
		          numbers[i] = numbers[i + 1];
		          numbers[i + 1] = temp;
		        }
		      }
		    }

		    System.out.println("\nAfter:");
		    Main.printArray(numbers);
		  }
	
	

}
