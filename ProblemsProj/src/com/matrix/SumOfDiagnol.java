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

public class SumOfDiagnol {

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

		// this is for output c matrix
		int c[][] = new int[ra][ca];

		for (int i = 0; i < ra; i++) {
			for (int j = 0; j < ca; j++) {
				c[i][j] = a[i][j];
			}
		}

		// here is the the calculation of the mtarix
		System.out.println("this is matrix A is here");
		for (int i = 0; i < ra; i++) {
			for (int j = 0; j < ca; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		int sum1 = 0;
		System.out.println("this is matrix A is here");
		for (int i = 0; i < ra; i++) {
			for (int j = 0; j < ca; j++) {
				if (i == j)
					sum1 += a[i][j];
			}
		}

		int sum = 0;
		for (int i = 0; i < ra; i++) {
			sum += a[i][ra - i - 1];
		}

		System.out.println("the sum of opposite diagnols are " + sum);

		sc.close();
	}
}
