package com.striver.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KadaneAlgorithm {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.println("Enter array number with spaces");
		String[] inputStr = br.readLine().split(" ");
		int nums[] = new int[inputStr.length];
		for (int i = 0; i < inputStr.length; i++) {
			nums[i] = Integer.parseInt(inputStr[i]);
		}
		int size= nums.length;
		int sum =nums[0];
		int sumMax=Integer.MIN_VALUE;
		
		for (int i=1; i<size;i++) {
			
			sum=sum+nums[i];
			sum= Math.max(sum, nums[i]);
			sumMax= Math.max(sumMax, sum);
			
		}
		
		System.out.println("Maximum Sum is " + sumMax);

	}

}

