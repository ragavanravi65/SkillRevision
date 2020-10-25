package com.webapptest.aa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AnagramProblem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int testCases=Integer.parseInt(s.nextLine());
		for(int j=0;j<testCases;j++) {
			int count=0;
			String value1=s.nextLine();
			String value2=s.nextLine();
			ArrayList<String> first=new ArrayList<>();
			ArrayList<String> second=new ArrayList<>();
			first=new ArrayList<String>(Arrays.asList(value1.split("")));
			second=new ArrayList<String>(Arrays.asList(value2.split("")));
			int val1Size=value1.length();
			int val2Size=value2.length();
			if(val1Size<val2Size) {
				while(val1Size>0) {
					if(second.contains(first.get(val1Size-1))){
						second.remove(first.get(val1Size-1));
						first.remove(first.get(val1Size-1));
					}
					else {
						first.remove(first.get(val1Size-1));
						count++;
					}
					val1Size--;
				}
			}
			if(val2Size<val1Size) {
				while(val2Size>0) {
					if(first.contains(second.get(val2Size-1))){
						first.remove(second.get(val2Size-1));
						second.remove(second.get(val2Size-1));
					}
					else {
						second.remove(second.get(val2Size-1));
						count++;
					}
					val2Size--;
				}
			}
			if(first.size()==0)
				count+=second.size();
			if(second.size()==0)
				count+=first.size();
			System.out.println(count);
		}
	}

}
