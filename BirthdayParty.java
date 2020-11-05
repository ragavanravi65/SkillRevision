package com.webapptest.aa;

import java.util.Scanner;

public class BirthdayParty {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int TestCases=s.nextInt();
		for(int i=0;i<TestCases;i++) {
			int friends=s.nextInt();
			int chocolates=s.nextInt();
			String result=(chocolates%friends==0)?"Yes":"No";
			System.out.println(result);
			
		}
	}
}
