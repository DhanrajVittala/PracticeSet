package javaProblems;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
	int n=sc.nextInt();
	int m=sc.nextInt();
	
	int[][] arr=new int[n][m];

	for(int i=0; i<=n-1;i++) {
		for(int j=0;j<=m-1;j++) {
			arr[i][j]=sc.nextInt();
		}
	}
	
	for(int i=0; i<=n-1;i++) {
		for(int j=0;j<=m-1;j++) {
			System.out.print(arr[i][j]+" ");

	}
System.out.println();
}
	}
}
