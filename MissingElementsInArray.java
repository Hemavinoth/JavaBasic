package week1.day2;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {

		int[] arr = { 1,3,4,6,7};
		Arrays.sort(arr);
		
		int length = arr.length;

		for (int i = arr[0]; i < length; i++) {
			

			if (i != arr[i]) {

				System.out.println(arr[i]);
				break;

			}
			arr[i]++;

		}
	}
}
