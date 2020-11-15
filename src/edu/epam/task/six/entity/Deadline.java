package edu.epam.task.six.entity;

import java.util.Calendar;

public class Deadline {
	public static void main(String[] args) {
		System.out.println("Developer surname: Galian");
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.MONTH, 8);
        calendar.set(Calendar.DAY_OF_MONTH, 13);
        calendar.set(Calendar.HOUR_OF_DAY, 15);
        calendar.set(Calendar.MINUTE, 23);
        calendar.set(Calendar.SECOND, 5);
        System.out.println("Date of getting task: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 2);
        calendar.add(Calendar.DAY_OF_MONTH, 4);
        calendar.add(Calendar.HOUR_OF_DAY, 8);
        calendar.add(Calendar.MINUTE, 15);
        calendar.add(Calendar.SECOND, 45);
        System.out.println("Date of ending task: " + calendar.getTime());
	}
}