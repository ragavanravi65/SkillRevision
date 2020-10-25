import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class DateUtilCalc {
// between 02-10-2020 //02-10-2020T00:00:00
//	02-10-2020T01:01:00 and 04-10-2020
	public String dateValue(String inputDate) throws ParseException {
		SimpleDateFormat utcdate=new SimpleDateFormat("yyyy-MM-dd");
		//parse,format  
		SimpleDateFormat finaldate=new SimpleDateFormat("yyyy-MM-dd");
		Date utc=utcdate.parse(inputDate);
		System.out.print("before all after parsing: "+utc+"\n");
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(utc);
		calendar.add(Calendar.DAY_OF_MONTH, +0);
		System.out.println(finaldate.format(calendar.getTime()));
		return finaldate.format(calendar.getTime());
	}

	public List<String> dateArrayValue(List<String> values, String inputDate) throws ParseException {
		String resultData = convertingDate(inputDate); //2020-10-09T00:00:00
		while(!resultData.equalsIgnoreCase("2020-10-11")) {
			values.add(resultData);
			resultData=convertingDate(resultData);
			System.out.print("inside loop"+resultData);
		}
			values.add(resultData);
			return values;
	}
	
	public String convertingDate(String inputDate) throws ParseException {
		SimpleDateFormat utcdate=new SimpleDateFormat("yyyy-MM-dd");
		Date utc=utcdate.parse(inputDate);
		Calendar calendar=Calendar.getInstance();
		calendar.setTime(utc);
		calendar.add(Calendar.DAY_OF_MONTH, +1);; //2020-10-09T00:00:00
		System.out.println(utcdate.format(calendar.getTime()));
		String resultData=utcdate.format(calendar.getTime());
		return resultData;
	}
	
	public void findDateDiff(String first,String second) throws ParseException{
		 List<String> getdata=new ArrayList<>();
 		SimpleDateFormat utcdate=new SimpleDateFormat("yyyy-MM-dd");
		 Date date = new Date();  
		    String currentDate = (utcdate.format(date)); 
		    Date currentDate1=utcdate.parse(currentDate);
		Date utc1=utcdate.parse(first);
		Date utc2=utcdate.parse(second);
//		System.out.print(currentDate1.after(utc1));
//		System.out.println((utc1.getTime()-utc2.getTime())/(1000*60*60*24));
		while(!utc1.equals(utc2)) {
			System.out.println("executing add");
			getdata.add(utcdate.format(utc1));
			utc1=addDay(utc1);
		}
		if(utc1.equals(utc2))
			getdata.add(utcdate.format(utc1));
		System.out.println(getdata);
//		2020-10-08
//		2020-10-09
	}
	
	public Date addDay(Date dt) {
		Calendar c = Calendar.getInstance(); 
		c.setTime(dt); 
		c.add(Calendar.DATE, 1);
		dt = c.getTime();
		return dt;
	}
	public static <JSONObject> void main(String[] args) throws ParseException {
		DateUtilCalc obj=new DateUtilCalc();
		List<String> values=new ArrayList<>();
		List<String> newVal=new ArrayList<>();
		//		obj.findDateDiff("2020-10-07","2020-10-07");
//		System.out.print(values==null || values.size()<1);
		List<Integer> values1= new ArrayList<>( 
	            Arrays.asList(1, 2, 3,4,5,6)); 
		values1.parallelStream().forEach((s)->{
			String a="adding values"+s+" ";
			newVal.add(a);
		});
//		String CurrentData=obj.dateValue("2020-10-08");
//			if(!CurrentData.equalsIgnoreCase("2020-10-13T00:00:00"))  //2020-10-08T00:00:00
//				{//08,
//				values.add(CurrentData);  //2020-10-08T00:00:00,2020-10-09T00:00:00,2020-10-10T00:00:00,2020-10-11T00:00:00
//				values = obj.dateArrayValue(values,CurrentData);
////				}
//				System.out.println("same date Terminating with Values "+values);
//				System.out.println("************\n");
//				return;
//				}
	System.out.println(newVal);
//	2020-10-08T00:00:00   where inredate Like "2020-10-08%"
	}
}
