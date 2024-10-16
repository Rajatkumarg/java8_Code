package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Test1 {
	//Asia/Calcutta
	public static void main(String[] args) {
//		Date date = new Date();
//		System.out.println(date);
//		Date todayISTDate = toGivenTimeZone(new Date(), "Asia/Calcutta");
//		System.out.println("todayISTDate "+todayISTDate);
		Date todayGMTDate = toGivenTimeZone(new Date(), "IST");
		System.out.println("todayGMTDate "+todayGMTDate);
//		System.out.println(getNextMonthDate());
		Date afterOneMonthFromTodayGMT = toGivenTimeZone(getNextMonthDate(), "GMT");
		System.out.println("afterOneMonthFromToday "+afterOneMonthFromTodayGMT);
		Date afterOneMonthFromTodayIST = toGivenTimeZone(getNextMonthDate(), "IST");
		System.out.println("afterOneMonthFromTodayIST "+afterOneMonthFromTodayIST);
		System.out.println(isDateBetween(getOneDayBefore(new Date()), todayGMTDate, afterOneMonthFromTodayGMT));
		printNextDateFromToday();
		System.out.println(getPreviousMonthDate());
	}
	public static boolean isDateBetween(Date dateToCheck, Date fromDate, Date toDate) {
        Calendar calendarToCheck = Calendar.getInstance();
        calendarToCheck.setTime(dateToCheck);

        Calendar calendarFrom = Calendar.getInstance();
        calendarFrom.setTime(fromDate);

        Calendar calendarTo = Calendar.getInstance();
        calendarTo.setTime(toDate);

        return calendarToCheck.compareTo(calendarFrom) >= 0 && calendarToCheck.compareTo(calendarTo) <= 0;
    }
	public static Date getNextMonthDate() {
        // Get today's date
        Calendar today = Calendar.getInstance();

        // Move to the next month
        today.add(Calendar.MONTH, 1);

        // Set the day of the month to the first day (1)
//        today.set(Calendar.DAY_OF_MONTH, 1);

        // Get the next month's date
        Date nextMonthDate = today.getTime();

        return nextMonthDate;
    }
	public static Date getPreviousMonthDate() {
        // Get today's date
        Calendar today = Calendar.getInstance();

        // Move to the next month
        today.add(Calendar.MONTH, -1);

        // Set the day of the month to the first day (1)
//        today.set(Calendar.DAY_OF_MONTH, 1);

        // Get the next month's date
        Date nextMonthDate = today.getTime();

        return nextMonthDate;
    }
	
	public static Date toGivenTimeZone(Date date, String timeZone) {
		String stringDate = formatDate(date, "yyyy-MM-dd'T'HH:mm:ss");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		sdf.setTimeZone(TimeZone.getTimeZone(timeZone));
		Date response = null;
		try {
			response = sdf.parse(stringDate);
		}
		catch(ParseException e) {
			System.out.println("METHOD=toGMT, Exception={}"+ e);
		}
		
		return response;
	}
	public static String formatDate(Date date, String format) {

		final String FAI_FORMAT = format;

		TimeZone.setDefault(TimeZone.getTimeZone("GMT"));
		Calendar cal = Calendar.getInstance(TimeZone.getDefault());
		cal.setTime(date);
		date = cal.getTime();

		String newDateString = null;
		SimpleDateFormat sdf = new SimpleDateFormat(FAI_FORMAT);
		newDateString = sdf.format(date);

		return newDateString;

	}
	public static void printNextDateFromToday() {
        // Get today's date
        Calendar today = Calendar.getInstance();

        // Move to the next day
        today.add(Calendar.DAY_OF_MONTH, 1);

        // Get the next date
        int year = today.get(Calendar.YEAR);
        int month = today.get(Calendar.MONTH) + 1; // Months are 0-based, so we add 1
        int day = today.get(Calendar.DAY_OF_MONTH);

        System.out.println("Next date from today: " + year + "-" + month + "-" + day);
    }
	public static Date getOneDayBefore(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);

        // Move to one day before
        calendar.add(Calendar.DAY_OF_MONTH, -1);

        // Get the one day before date
        return calendar.getTime();
    }
}
