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

public class Substraction {
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

		// this is for B matrix

		System.out.println("enter no of rows for B matrix");
		int rb = sc.nextInt();
		System.out.println("enter column values for B matrix");
		int cb = sc.nextInt();
		int b[][] = new int[rb][cb];

		System.out.println("enter matrix elemnts fro B matrix");
		for (int i = 0; i < rb; i++) {
			for (int j = 0; j < cb; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		// this is for output c matrix
		int c[][] = new int[ra][ca];

		if (ra == rb && ca == cb) {
			for (int i = 0; i < ra; i++) {
				for (int j = 0; j < ca; j++) {
					c[i][j]=a[i][j]-b[i][j];
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
			
			// here is the the calculation of the mtarix
			System.out.println("this is matrix B is here");
			for (int i = 0; i < rb; i++) {
				for (int j = 0; j < cb; j++) {
					System.out.print(b[i][j] + " ");
				}
				System.out.println();
			}

			// here is the the calculation of the mtarix
			System.out.println("your addtion of matrix A and matrix B is here");
			for (int i = 0; i < ra; i++) {
				for (int j = 0; j < ca; j++) {
					System.out.print(c[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("Matrxi substraction is not possible");
		}

		sc.close();
	}
}
