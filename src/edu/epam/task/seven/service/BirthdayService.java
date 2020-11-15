package edu.epam.task.seven.service;

import edu.epam.task.seven.entity.Birthday;
import java.util.Calendar;

public class BirthdayService {
	
	private static final String[] DAYS = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    public String getDayOfWeekWhenBirthday(Birthday birthday) {
        int day = birthday.getDayOfWeek();
        return DAYS[day - 1];
    }
	
	public int getFullYears(Birthday birthday) {
        Calendar calendar = Calendar.getInstance();
        if(calendar.get(Calendar.MONTH) >= birthday.getMonth()) {
            return calendar.get(Calendar.YEAR) - birthday.getYear();
        } else {
            return calendar.get(Calendar.YEAR) - birthday.getYear() - 1;
        }
    }
	
	public boolean getCongrats(Birthday birthday) {
        Calendar calendar = Calendar.getInstance();
        return (calendar.get(Calendar.DAY_OF_MONTH) == birthday.getDayOfMonth()) && (calendar.get(Calendar.MONTH) == birthday.getMonth());
    }
}