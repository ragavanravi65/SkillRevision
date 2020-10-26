package com.webapptest.aa;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CipherData {

	public static void main(String[] args) {

		 StringBuffer result = new StringBuffer();		
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		int encryptCode=Integer.parseInt(s.nextLine());
		for(int i=0;i<input.length();i++) {
			int asciiOfChar=0;
			int newAscii=0;
			asciiOfChar=(int)input.charAt(i);
//			System.out.println(asciiOfChar+"-->"+input.charAt(i));
			if(asciiOfChar>=48 && asciiOfChar<=57) {
				newAscii=asciiOfChar+encryptCode%10;
				if(newAscii<=57) {
					result.append(String.valueOf((char)newAscii));
				}
				else {
				newAscii=newAscii-57+48-1;
				result.append(String.valueOf((char)newAscii));
				}
			}
			if(asciiOfChar>=97 && asciiOfChar<=122) {
				newAscii=asciiOfChar+encryptCode%26;
				if(newAscii<=122) {
					result.append(String.valueOf((char)newAscii));
				}
				else {
				newAscii=newAscii-122+97-1;
				result.append(String.valueOf((char)newAscii));
				}
			}
			if(asciiOfChar>=65 && asciiOfChar<=90) {
				newAscii=asciiOfChar+encryptCode%26;
				if(newAscii<=90) {
					result.append(String.valueOf((char)newAscii));
				}
				else {
				newAscii=newAscii-90+65-1;
				result.append(String.valueOf((char)newAscii));
				}
			}
			if(Pattern.compile("[^\\w]").matcher(String.valueOf(input.charAt(i))).matches()) {
				result.append(String.valueOf(input.charAt(i)));
			}
		}
		System.out.println(result);
	}

}
