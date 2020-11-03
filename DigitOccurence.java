package com.webapptest.aa;

import java.util.Scanner;

public class DigitOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int[] digits=new int[10]; 
        for(int i=0;i<name.length();i++) {
        	int number=Integer.parseInt(String.valueOf(name.charAt(i)));
        	digits[number]+=1;
        }
        for(int i=0;i<10;i++) {
        	System.out.println(i+" "+digits[i]);
        }
	}

}
