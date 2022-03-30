/*********************************************************************************
* (Eliminate duplicates) Write a method that returns a new array by eliminating  *
* the duplicate values in the array using the following method header:           *
* public static int[] eliminateDuplicates(int[] list)                            *
* Write a test program that reads in ten integers, invokes the method, and       *
* displays the result.                                                           *
*********************************************************************************/
// import java.util.Scanner;

// public class Exercise_07_15 {
// 	/** Main method */
// 	public static void main(String[] args) {
// 		Scanner input = new Scanner(System.in); // Create a Scanner
// 		int[] numbers = new int[10]; // Create an array of length 10

// 		// Prompt the user to enter ten numbers
// 		System.out.print("Enter ten number: ");
// 		for (int i = 0; i < numbers.length; i++)
// 			numbers[i] = input.nextInt();

// 		// Get distinct numbers
// 		int[] distinctNumbers = eliminateDuplicates(numbers);

// 		// Display the result
// 		System.out.print("The distinct numbers are:");
// 		for (int e: distinctNumbers) {
// 			if (e > 0)
// 				System.out.print(" " + e);
// 		}
// 		System.out.println();
// 	}

// 	/** eleminateDuplicates returns a new array with duplicate values eliminated */
// 	public static int[] eliminateDuplicates(int[] list) {
// 		int[] distinctList = new int[list.length];
// 		int i = 0;	// index distinctList
// 		for (int e: list) {
// 			if (linearSearch(distinctList, e) == -1) {
// 				distinctList[i] = e;
// 				i++;
// 			}
// 		}
// 		return distinctList;
// 	}

// 	/** linearSearch */
// 	public static int linearSearch(int[] array, int key) {
// 		for (int i = 0; i < array.length; i++) {
// 			if (key == array[i])
// 				return i;
// 		}
// 		return -1;
// 	}
// }
import java.util.Arrays;
import java.util.Scanner;
public class A8Q10 {

	public static int[] eliminateDuplicates(int[] list) {
		int arr[] = new int[10];
		
		for( int i = 0; i < list.length; i++ ) {
			int count = 0;
			for( int j = i-1; j >= 0; j-- ) {
				if( list[j] == list[i] ) {
					count++;
					break;
				}
			}
			if( count == 0 )
				arr[i] = list[i];
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n [] = new int[10];
		
		for( int i = 0; i < n.length; i++ ) {
			int element = sc.nextInt();
			n[i] = element;
		}
		int arr[] = eliminateDuplicates(n);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}

}
