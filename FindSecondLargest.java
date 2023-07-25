package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Here is the input
		int[] data = { 3, 2, 11, 4, 6, 7 };

		Arrays.sort(data);

		int length = data.length;

		int number = 0;
		System.out.println("asending order arrays");

		for (int i = 0; i < length; i++) {

			number = data[i];

			System.out.println(number);

		}

		System.out.println("The secondnd largest number is" + data[length - 2]);

		/*
		 * Pseudo Code: 1) Arrange the array in ascending order 2) Pick the 2nd element
		 * from the last and print it
		 */

	}
}
