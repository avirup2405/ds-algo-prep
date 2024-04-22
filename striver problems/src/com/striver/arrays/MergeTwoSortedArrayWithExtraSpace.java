package com.striver.arrays;

import java.util.Arrays;


/*
This solution is merging two sorted array using temp space and the merge logic of Merge Sort
Time Complexity: (m+n)
Space Complexity: (m+n)
 */
public class MergeTwoSortedArrayWithExtraSpace {

	public static void main(String[] args) {

		int [] arr1 = {1,3,5,7,9};
		int [] arr2 ={2,4,6,8};

		int m= arr1.length;
		int n= arr2.length;

		 mergeArray(arr1,arr2,m,n);
		 System.out.println("Merged Array");
		 Arrays.stream(arr1).forEach(System.out::println);
		 Arrays.stream(arr2).forEach(System.out::println);

	}

	private static void mergeArray(int[] arr1, int[] arr2, int m, int n) {
		int left =0;
		int right =0;
		int i=0;
		int [] temp = new int[m+n];

		while(left < m && right < n){

			if(arr1[left] <= arr2[right]){
				temp[i++] =arr1[left++];

			}
			else{
				temp[i++] =arr2[right++];
			}

		}

		while(left < m){
			temp[i++] =arr1[left++];
		}
		while (right < n){
			temp[i++] =arr2[right++];
		}

		Arrays.stream(temp).forEach(System.out::println);

		for (int j=0 ; j < n+m; j++){
			if(j < m){
				arr1[j] = temp[j];


			}else{
				arr2[j-m] = temp[j];

			}
		}
	}

}
