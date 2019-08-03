package day8;

import java.util.*;

public class Array2D {
	public static void main(String[] args) {

		/*
		 * 2 dimensional array can be visualized as excel sheet which has rows and
		 * columns first dimension size of 2d array can be seen as row count second
		 * dimension size of 2d array can be seen as column count
		 * 
		 * 12 17 3 40 44 27 23 12
		 */

//		int [] [ ] data = new int [4] [2]; 

		// how to assign value to this two dimensional array

//			data [0] [0]= 12;   // first row and first column
//					
//			data [1] [0] =3;
//					
//			data [2] [0] =44;
//			
//			data [3] [ 0]= 23;
//			
//			data [0] [1]= 17;   
//			
//			data [1] [1] =40;
//					
//			data [2] [1] =27;
//			
//			data [3] [ 1]= 12;

		int[][] data2 = new int[2][4];
		int[][] data3 = new int[3][2];
		int[][] data4 = new int[2][2];

		int[][] data5 = { { 12, 17, 3, 40 }, { 44, 27, 23, 12 } };

		int[] nums1 = new int[] { 1, 3, 5 };
		int[] nums2 = new int[] { 1, 13 };

		// 2 dimensional array is an array object that store
		// 1 dimensional array in each slot

		int[][] numsOfnums = new int[2][];
		// length method on an array will always return first dimension length
		System.out.println(numsOfnums.length);

		numsOfnums[0] = nums1;
		numsOfnums[1] = nums2;

		for (int i = 0; i < numsOfnums.length; i++) {

			System.out.println(Arrays.toString(numsOfnums[i]));
			System.out.println(numsOfnums[i].length);

		}

		for (int[] eachRow : numsOfnums) {
			for (int eachCell : eachRow) {
				System.out.print(eachCell + " ");
			}

			int[][] data = new int[4][2];
			data[0][0] = 12;
			data[0][1] = 17;
			data[1][0] = 3;
			data[1][1] = 40;
			data[2][0] = 44;
			data[2][1] = 27;
			data[3][0] = 23;
			data[3][1] = 12;

			for (int[] eachRowA : data) {
				for (int eachCellB : eachRowA) {
					System.out.print(eachCellB + " ");
				}

				System.out.print("colum 1         |" + " colum2\n");
				for (int i = 0; i < data.length; i++) {
					for (int j = 0; j < data[i].length; j++) {
						System.out.print("row " + (i + 1) + ": " + data[i][j] + "       | ");
					}
					System.out.println();
					System.out.println("-----------------------------------------");
				}

				System.out.println("The array has " + data.length + " rows.");
				System.out.println("The array has " + data[0].length + " colums.");

			}
		}
	}

}
