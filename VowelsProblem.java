package com.webapptest.aa;


import java.util.*;

class VowelsProblem {
    public static void main(String args[] ) throws Exception {

	List<String> vowels=new ArrayList<String>();
		Collections.addAll(vowels,"a","e","i","o","u","A","E","I","O","U");
		Scanner s = new Scanner(System.in);
		int testCase=Integer.parseInt(s.nextLine());
		for(int test=1;test<=testCase;test++){
			long vowelCount=0;
			String inputData=s.nextLine();
			for(int i=0;i<inputData.length();i++) {
						if(vowels.contains(String.valueOf(inputData.charAt(i))))
							vowelCount=vowelCount+(i+1)*(inputData.length()-i);

				}
			System.out.println(vowelCount);
			}
    }
}
