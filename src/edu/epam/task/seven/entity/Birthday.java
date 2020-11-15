package edu.epam.task.seven.entity;

import java.util.Calendar;

public class Birthday {
	
	private Calendar calendar;

    public Birthday(Calendar calendar) {
        this.calendar = calendar;
    }

	public int getDayOfWeek() {
        return calendar.get(Calendar.DAY_OF_WEEK); //Почему-то возвращает на день как бы вперёд??
    }

	public int getDayOfMonth() {
        return calendar.get(Calendar.DAY_OF_MONTH);
    }

	public int getYear() {
        return calendar.get(Calendar.YEAR);
    }

    public int getMonth() {
        return  calendar.get(Calendar.MONTH);
    }

    public String getBirthdayDate() {
        StringBuilder sb = new StringBuilder();
        sb.append("Birthday date: ").append(calendar.get(Calendar.DAY_OF_MONTH)).append(".").append(calendar.get(Calendar.MONTH) + 1).append(".").append(calendar.get(Calendar.YEAR));
        return sb.toString();
    }
}
