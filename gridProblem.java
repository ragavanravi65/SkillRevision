package com.webapptest.aa;

import java.util.Arrays;
import java.util.Scanner;

public class gridProblem {

	public static void main(String[] args) {
		int flag=0;
		Scanner s= new Scanner(System.in);
		int gridCount=s.nextInt();
		s.nextLine();
		String[] values=new String[gridCount];

		String data=s.nextLine();
		values=data.split("");
		for(int i = 1;i<gridCount;i++) {
			if(values[i].equalsIgnoreCase("h") && values[i-1].equalsIgnoreCase(values[i])) {
				flag=1;
				break;
			}
		}
		if(flag==1)
			System.out.println("NO");
		else {
			String newValue=data.replace('.', 'B');
			System.out.println("YES");
			System.out.println((newValue));
		}
	}

}


//for(int i=0;i<gridCount;i++) {
//values[i]=s.nextLine();
//if(houses==null)
//	houses=values[i];
//else
//	houses+=values[i];
//}