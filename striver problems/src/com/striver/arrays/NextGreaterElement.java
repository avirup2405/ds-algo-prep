package com.striver.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NextGreaterElement {

	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		
		while (true) {
			System.out.println("Enter number with spaces");
			 String [] inputStr = br.readLine().split(" ");
			 int nums[] =new int[inputStr.length];
			 for(int i=0;i<inputStr.length;i++){ 
				nums[i] = Integer.parseInt(inputStr[i]);
			}

			nextpermutation(nums);
			display(nums);
			
		}
	}

	private static void display(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");

		}
	}

	private static void nextpermutation(int[] nums) {

		int peak = -1;

		if (nums.length == 1) {
			return;
		}

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1])
				peak = i;
		}

		if (peak == -1) {
			swap(nums, 0, nums.length - 1);
			return;
		}
		int index = peak;
		for (int i = peak + 1; i < nums.length; i++) {

			if (nums[peak - 1] < nums[i] && nums[i] < nums[index]) {
				index = i;
			}
		}
		swap(nums, peak - 1, index);
		Arrays.sort(nums, peak, nums.length);

	}

	private static void swap(int[] nums, int left, int right) {

		while (left <= right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}

	}

}
