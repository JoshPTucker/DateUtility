import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateUtility {
	 int month;
	 int day;
	 int year;
	//Scanner keyboard = new Scanner(System.in);
	
	
	public static int[][] displayCalendar( int year, int month) {
		int y=year;
		int m=month-1;
		int dayDisplay[][] = new int[5][7];
		GregorianCalendar gc = new GregorianCalendar(y, m, 1);
		int startDay = gc.get(Calendar.DAY_OF_WEEK) - 1;
		int k = 1;
		for (int w = 0; w < 5; w++) {
			for (int d = startDay; d < 7; d++) {
				dayDisplay[w][d] = k;
				k++;
			}
			startDay = 0;
		}
		return  dayDisplay;
	}

	public static int getLastDayOfMonth(int month, int year) {
		int lastday=0;
		
		
		return lastday;
	}

	static String toString(int month, int day, int year, String delimiter) {
		return delimiter;
	} // prints the date as mm/dd/yyyy

	public static boolean isLeapYear(int year) {
		// returns t/f if the year is a leap year
		// leap years are all years divisible by 4 but not 100
		// years that are divisible by 400 are leap years, too
		// is it divisible by 4?
		// Note that the year is not passed as an argument. It could be but
		// I choose to use the class level private variable for my method.
		boolean bLeapYear = false;
		bLeapYear = (year % 4 == 0);
		// is it divisible by 4 and not 100
		bLeapYear = bLeapYear && (year % 100 != 0);
		// is it divisible by 4 and not 100 unless it's divisible by 400
		bLeapYear = bLeapYear || (year % 400 == 0);
		return bLeapYear;

	}
	public static int calcDaysBetween(int month, int year, int day , int month2, int year2, int day2){
		int m=month-1;
		int m2=month2-1;
		int y=year;
		int y2=year2;
		int d=day;
		int d2=day2;
		GregorianCalendar gc = new GregorianCalendar(y, m, d);
		
		GregorianCalendar gc2 = new GregorianCalendar(y2, m2, d2);
		
		long millisecondsPerDay = (24*60*60*1000);
		long DateInMS = gc.getTimeInMillis();
		long DateInMS2 = gc2.getTimeInMillis();
		
		float numberOfDays = DateInMS/millisecondsPerDay;
		float numberOfDays2 = DateInMS2/millisecondsPerDay;
		int daysBetween = (int) (numberOfDays-numberOfDays2);
		return daysBetween;
	}
	public static String dayOfWeek(int month, int year, int day){
		int y=year;
		int m=month-1;
		int d=day;
		int dOw;
		String weekDays[] = { "Sun", "Mon", "Tues", "Wed", "Thur",
				 "Fri", "Sat" };
		GregorianCalendar gc = new GregorianCalendar(y, m, d);
		  dOw=gc.get(Calendar.DAY_OF_WEEK)-1;
		  
		return weekDays[dOw];
		
	}
}