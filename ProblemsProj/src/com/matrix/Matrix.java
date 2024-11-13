package com.matrix;

import java.util.Scanner;

/*enter no of rows
5
enter column values
4
enter matrix elemnts
1 2 3 4 
5 6 7 8 
1 2 3 4 
5 6 7 8
9 8 7 6 
your matrix is here
1[0,0] 2[0,1] 3[0,2] 4[0,3] 
5[1,0] 6[1,1] 7[1,2] 8[1,3] 
1[2,0] 2[2,1] 3[2,2] 4[2,3] 
5[3,0] 6[3,1] 7[3,2] 8[3,3] 
9[4,0] 8[4,1] 7[4,2] 6[4,3] */

public class Matrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no of rows");
		int r = sc.nextInt();
		System.out.println("enter column values");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		
		System.out.println("enter matrix elemnts");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("your matrix is here");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				System.out.print(a[i][j]+"["+i+","+j+"]"+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
