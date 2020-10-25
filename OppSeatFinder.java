package com.webapptest.aa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.JsonArray;

/**
 * Hello world!
 *
 */
public class OppSeatFinder 
{
    public static void main( String[] args )
    {

//	     String s ="[\r\n" + 
//	     		"  {\r\n" + 
//	     		"    \"inc\": \"1\",\r\n" + 
//	     		"    \"deepdive\": {\r\n" + 
//	     		"      \"de1\": \"11\",\r\n" + 
//	     		"      \"de2\": \"2\"\r\n" + 
//	     		"    }\r\n" + 
//	     		"  },\r\n" + 
//	     		" {\r\n" + 
//	     		"    \"inc\": \"2\",\r\n" + 
//	     		"    \"deepdive\": {\r\n" + 
//	     		"      \"de1\": \"22\",\r\n" + 
//	     		"      \"de2\": \"3\"\r\n" + 
//	     		"    }\r\n" + 
//	     		"  }\r\n" + 
//	     		"]";
////	   System.out.println(s);
//	   JSONArray datas=new JSONArray(s);
//	   System.out.println(datas);
//	   for(Object data:datas) {
//		   JSONObject dataa=(JSONObject) data;
//		  JSONObject valueKey = (JSONObject) dataa.get("deepdive");
//		  valueKey.remove("de2");
//		   
//	   }
//	   System.out.println(datas.toString());
    	  Scanner s = new Scanner(System.in);
          int problems=s.nextInt();
          List<Integer> upperBracket=new ArrayList<>(Arrays.asList(6,5,4));
          List<Integer> lowerBracket=new ArrayList<>(Arrays.asList(1,2,3));
          String[] seats={"WS","MS","AS"};
          for(int i=0;i<problems;i++){
              int currentSeat=s.nextInt();
              int value=currentSeat%12;
              int oppType;
              int oppSeat;
              if(value!=0) {
              oppType=13-value;
              oppSeat=13+currentSeat-(value*2);
              }
              else {
            	  oppType=12;
            	  oppSeat=13+currentSeat-(12*2);
              }
              String opptypeValue = null;

              if(upperBracket.contains(value<oppType?value:oppType)) {
            	  opptypeValue=seats[upperBracket.indexOf(value<oppType?value:oppType)];
              }
              if(lowerBracket.contains(value<oppType?value:oppType)) {
            	  opptypeValue=seats[lowerBracket.indexOf(value<oppType?value:oppType)];
              }
              if(value==0) {
            	  opptypeValue=seats[0];
              }
              System.out.println(oppSeat+" "+opptypeValue);
          }
    }
}
