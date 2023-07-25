package week1.day2;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 3, 2, 6, 7 };
		Arrays.sort(arr);
		// 123467
		int length = arr.length;
		// get the size of the array
		System.out.println(length); // 123467 // count 6

		for (int i = 0; i < length; i++)// 0<6 
			{

			if (arr[i] != i + 1) {
              // 1!=1 false
				
              //2!=2 false
				
				

				System.out.println(i + 1);
				break;

			}

		}
	}
}
