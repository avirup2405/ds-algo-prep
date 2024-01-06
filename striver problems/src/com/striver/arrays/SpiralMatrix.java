package com.striver.arrays;

public class SpiralMatrix {

	public static void main(String[] args) {
		
		int spiralArrays [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int rowLength =spiralArrays.length;
		int columnLength=spiralArrays[0].length;
		
		int top= 0;
		int down = rowLength-1;
		int left = 0;
		int right =  columnLength-1;
		
		int dir =0;
		
		while(left<= right && top <= down) {
			if(dir==0) {
				for(int i=left;i<=right;i++) {
					System.out.print(spiralArrays[top][i] +" ");
				}
				top++;
			}
			else if(dir==1) {
				for(int i=top; i<=right;i++) {
					System.out.print(spiralArrays[i][right] +" ");
				}
				right--;
			}
			else if(dir==2) {
				for(int i=right; i>=left;i--) {
					System.out.print(spiralArrays[down][i] +" ");
				}
				down --;
				
			}
			else if(dir==3) {
				for(int i =down; i>=top;i--) {
					System.out.print(spiralArrays[i][left] + " ");
				}
				left ++;
			}
			
			dir = (dir +1)%4;
			
			
		}

	}

}
