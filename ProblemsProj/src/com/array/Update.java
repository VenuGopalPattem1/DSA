package com.array;

public class Update {
	static void v1(int a[]) {
		int l = a.length;
		int tar = 7;

		for (int i = 0; i < l; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < l; i++) {
			if (a[i] == tar) {
				a[i] = 0;
				break;// if you want to update only first occurance
				//remove that when we want to update the all ocuurances
			}
		}

		System.out.println();
		for (int i = 0; i < l; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

// update the n element in the array
	static void v2(int a[]) {
		int l = a.length;
		int tar = 7;
		int q = 0;
		for (int i = 0; i < l; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = 0; i < l; i++) {
			if (a[i] == tar) {
				q++;
				if (q == 2) //this will update only the specific occurance of the element
					a[i] = 0;
					break;
				}
			}
		

		System.out.println();
		for (int i = 0; i < l; i++) {
			System.out.print(a[i] + " ");
		}
	}

	static void v3(int a[]) {//if you want to update the last n occurance of the element
		int l = a.length;
		int tar = 7;
		int q=0;
		for (int i = 0; i < l; i++) {
			System.out.print(a[i] + " ");
		}
		for (int i = l-1; i >=0; i--) {//
			if (a[i] == tar) {
				q++;
				if(q==2) {
					a[i] = 0;
					break;
				}
				}
			}
		

		System.out.println();
		for (int i = 0; i < l; i++) {
			System.out.print(a[i] + " ");
		}
	}
	
	
	

	public static void main(String[] args) {
		int[] a = { 1, 4, 5, 6, 7, 3, 7, 4, 6, 7, 3, 7, 7, 8, 7, 6 };
//		int q = 0;
//		v1(a);
//		v2(a);
		v3(a);
	}
}
