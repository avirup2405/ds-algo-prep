package com.striver.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DutchFlagProblem {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter array number with spaces");
		String[] inputStr = br.readLine().split(" ");
		int nums[] = new int[inputStr.length];
		for (int i = 0; i < inputStr.length; i++) {
			nums[i] = Integer.parseInt(inputStr[i]);
		}

		sortColors(nums);
		display(nums);

	}

	private static void sortColors(int[] nums) {

		int low = 0, mid = 0;
		int high = nums.length - 1;

		while (mid <= high) {

			switch (nums[mid]) {

			case 0:
				swap(nums, low, mid);
				low++;
				mid++;
				break;
			case 1:
				mid++;
				break;
			case 2:
				swap(nums, mid, high);
				high--;
				break;

			}

		}
	}

	private static void swap(int[] nums, int index1, int index2) {

		int temp = nums[index1];
		nums[index1] = nums[index2];
		nums[index2] = temp;
	}

	private static void display(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
        }
		System.out.println("");
	}

}