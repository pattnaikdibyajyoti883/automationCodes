package automationProject;

import java.util.Date;

public class CurrentDate {

	public static void main(String[] args) throws Throwable
	{
		Date d = new Date();
		String date = d.toString();
		
		String dates[] = date.split(" ");
		String day_0 = dates[2];
		String day = day_0.replaceFirst("0","");
		int month = d.getMonth();
		String year = dates[5];
		System.out.println("The day is " + day);
		System.out.println("The month is " + month);
		System.out.println("The year is " + year);
	}
}
