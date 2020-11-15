package edu.epam.task.seven.main;

import java.util.Scanner;
import java.util.Calendar;

import edu.epam.task.seven.entity.Birthday;
import edu.epam.task.seven.service.BirthdayService;

public class BirthdayMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your birthday date:\n" + "Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.YEAR, year);
		Birthday birthday = new Birthday(calendar);
		BirthdayService service = new BirthdayService();
		System.out.println("\n" + birthday.getBirthdayDate());
		System.out.println("You was born on : " + service.getDayOfWeekWhenBirthday(birthday));
		System.out.println("Full years : " + service.getFullYears(birthday));
		if(service.getCongrats(birthday)) {
            System.out.println("Congrats, you have a birthday!!!!");
        }
	}
}