package com.striver.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StockBuyAndSell_2_Transaction {

	public static void main(String args[]) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter array number with spaces");
		String[] inputStr = br.readLine().split(" ");
		int nums[] = new int[inputStr.length];
		for (int i = 0; i < inputStr.length; i++) {
			nums[i] = Integer.parseInt(inputStr[i]);
		}

		int left[] = new int[nums.length];
		int right[] = new int[nums.length];

		// calculate left side profits
		int leftMin = nums[0];
		for (int i = 0; i < nums.length; i++) {
			leftMin = Math.min(leftMin, nums[i]);
			left[i] = nums[i] - leftMin;
		}
		
		// calculate right side profits
		int rightMax = nums[nums.length-1];
		for(int i=nums.length-1; i>0; i--) {
			rightMax= Math.max(rightMax, nums[i]);
			right[i]= rightMax- nums[i];
		}
		
		int maxProfit= right[0];
		for(int i=1; i<nums.length;i++) {
			maxProfit= Math.max(maxProfit, left[i-1] + right[i]);
		}
		System.out.println("Max Profit fot 2 Transactions are:  "+maxProfit);

	}
}
