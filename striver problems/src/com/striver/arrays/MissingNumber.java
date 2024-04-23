package com.striver.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {

	public static void main(String[] args) {

		int n=10;
		int [] arr = {1,2,3,4,5,6,7,9,10};
		int missingNumber = getMissingNumberByXOR(arr,n);
		int missingNumber2 = getMissingNumberBySum(arr,n);
		System.out.println("Missing number using Summation of N: " + missingNumber2);
		System.out.println("Missing Number using XOR logic: " + missingNumber);

	}

	private static int getMissingNumberBySum(int[] arr,int n) {
		int sum = (n*(n+1)/2);
		int arrSum = Arrays.stream(arr).sum();
		return (sum-arrSum);
	}

	private static int getMissingNumberByXOR(int[] arr,int n) {
		int xorOfN = IntStream.rangeClosed(1,n).reduce((x,y)-> x ^ y).orElse(0);
		int xorArr = Arrays.stream(arr).reduce((x,y)-> x^y).orElse(0);
		return (xorOfN ^ xorArr);
	}

}
