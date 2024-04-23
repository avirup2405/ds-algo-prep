package com.striver.arrays;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {

        int [] arr ={1,1,1,1,2,2,2,2,3,3,3,3,4,4,5}; // Result will be {1,2,3,4,5,.....}
        int uniqueElements = getUniqueElements(arr);
        System.out.println("Unique Elements :" + uniqueElements );
    }

    private static int getUniqueElements(int[] arr) {

        int i=0;
        for(int j=1; j < arr.length; j++){
             if(arr[i] != arr[j]){
                 arr[++i] =arr[j];

             }

        }
        return i+1;
    }


}
