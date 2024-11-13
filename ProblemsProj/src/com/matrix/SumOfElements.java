package com.matrix;

import java.util.Scanner;

/*
1 2 3
4 5 6
7 8 9

4 5 6
7 8 9
1 2 3
*/

public class SumOfElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// this is for A matrix

		System.out.println("enter no of rows for A matrix");
		int ra = sc.nextInt();
		System.out.println("enter column values for A matrix");
		int ca = sc.nextInt();
		int a[][] = new int[ra][ca];

		System.out.println("enter matrix elemnts fro A matrix");
		for (int i = 0; i < ra; i++) {
			for (int j = 0; j < ca; j++) {
				a[i][j] = sc.nextInt();
			}
		}




		/*
		 * for (int i = 0; i < ra; i++) { int sum = 0; for(int j=0;j<ca;j++) {
		 * sum=sum+a[i][j]; } System.out.println((i+1)+"Row Sum= "+sum);
		 * 
		 * }
		 */
		
		for (int i = 0; i < ra; i++) {
			int sum = 0;
			for(int j=0;j<ca;j++)
			{
				sum=sum+a[j][i];
			}
			System.out.println((i+1)+"column Sum= "+sum);

		}

		// here is the the calculation of the mtarix
		System.out.println("this is matrix A is here");
		for (int i = 0; i < ra; i++) {
			for (int j = 0; j < ca; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

//		System.out.println("sum of the all the elements in the matrix is " + sum);

		sc.close();
	}
}
