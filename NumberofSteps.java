package com.webapptest.aa;

import java.util.Arrays;
import java.util.Scanner;

public class NumberofSteps {

	public static void main(String[] args) {
		int count=0;
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		s.nextLine();
		String[] aa=s.nextLine().split(" ");
		String[] bb=s.nextLine().split(" ");
		int[] a = Arrays.stream(aa).mapToInt(Integer::parseInt).toArray();
		int[] b=Arrays.stream(bb).mapToInt(Integer::parseInt).toArray();
		int minimum=Integer.MAX_VALUE;
		for(int i=0;i<n;i++) {
			if(a[i]<minimum)
				minimum=a[i];
		}
		for(int i=0;i<n;i++) {
			while(a[i]>=b[i]) {
				a[i]-=b[i];
				count++;
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println(count);
	}
}
