package com.webapptest.aa;

import java.util.Arrays;
import java.util.Scanner;

public class BestIndex {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int N=Integer.parseInt(s.nextLine());
		int[] values=Arrays.stream(s.nextLine().split(" "))
				.mapToInt(Integer::parseInt)
				.toArray();
		int max=Integer.MIN_VALUE;
		for(int i=0;i<values.length;i++) {
			int sum=0;
			int j=i;
			int Quotient=(values.length-i)/3;
			if(values.length-i>=3) {
				while(Quotient>0) {
				sum+=values[j]+values[j+1]+values[j+2];
				j+=3;
				Quotient--;
				}
			}
			else if(values.length-i<3) {
				sum+=values[i];
			}
			max=sum>=max?sum:max;
		}
		System.out.println(max);

	}

}
