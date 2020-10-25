package com.webapptest.aa;

import java.util.Scanner;

public class Anagram2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int testCases=Integer.parseInt(s.nextLine());
		for(int j=0;j<testCases;j++) {
			String value1=s.nextLine();
			String value2=s.nextLine();
			for(int i=0;i<value1.length();i++) {
				String test=Character.toString(value1.charAt(i));
				if(value2.contains(test)) {
					value1=value1.replaceFirst(test, "");
					value2=value2.replaceFirst(test, "");
					i--;
				}
			}
			System.out.println(value1.length()+value2.length());
		}
	}

}
