package com.striver.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StockBuyAndSell_1_Transaction {
	
	public static void main(String args[]) throws IOException
	{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter array number with spaces");
		String[] inputStr = br.readLine().split(" ");
		int nums[] = new int[inputStr.length];
		for (int i = 0; i < inputStr.length; i++) {
			nums[i] = Integer.parseInt(inputStr[i]);
		}

		int profit=findMaxProfit(nums);
		System.out.println("Max Profit is:  " +profit);
	}

	private static int findMaxProfit(int[] nums) {
		
		int maxProfit=Integer.MIN_VALUE;
		int minPrice=nums[0];
		for(int i=0;i< nums.length;i++) {
			minPrice= Math.min(minPrice, nums[i]);
			maxProfit=Math.max(maxProfit,  nums[i]-minPrice);
		}
		return maxProfit;
	}

}
