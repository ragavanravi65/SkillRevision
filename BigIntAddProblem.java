package com.webapptest.aa;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntAddProblem {

	public static void main(String[] args) {
//		FileInputStream data;
//		try {
//			data = new FileInputStream("C:\\Users\\ragav\\Desktop\\test.txt");
//		 //additional way of Input -->        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			BufferedReader br = new BufferedReader(new InputStreamReader(data));
//			String name;
//			String[] inputValues=new String[2];
//			while((name=br.readLine())!=null){
//				if(!name.equalsIgnoreCase("")) {
//					inputValues[0] = !name.split(" ")[0].equalsIgnoreCase("")?name.split(" ")[0]:"0";
//					inputValues[1]="0";
//					if(name.split(" ").length==2)
//						inputValues[1] = name.split(" ")[1];
//					System.out.println(new BigInteger(inputValues[0]).add(new BigInteger(inputValues[1])));
//				}
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} 

		Scanner sc= new Scanner(System.in);

		while(sc.hasNext()){

		BigInteger A = sc.nextBigInteger();

		BigInteger B = sc.nextBigInteger();

		System.out.println(A.add(B));
		}
		}
}
