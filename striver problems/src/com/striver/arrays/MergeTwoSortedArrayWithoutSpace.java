package com.striver.arrays;

import java.util.Arrays;


/*
This is an optimal solution for Merge two sorted array without using extra space
We are checking the elements of arr1 and arr2 staring from last element of arr1 and first
element of arr 2 and if they are not in proper order swapping as all elements of arr1 should be
less than any element of arr2. We are finally sorting the arr1 and arr2
Time complexity : (m+n) log (m+n)
 */

public class MergeTwoSortedArrayWithoutSpace {

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

        int left = 0;
        int right =m-1;

        while(left < m && right >= 0){

            if(arr2[left] <= arr1[right]) {
                swapArrayElements(arr1,arr2,left,right);
                left++;
                right--;
            }
            else{
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    private static void swapArrayElements(int[] arr1, int[] arr2, int left, int right) {

        int temp =arr2[left];
        arr2[left] =arr1[right];
        arr1[right]=temp;

    }
}
