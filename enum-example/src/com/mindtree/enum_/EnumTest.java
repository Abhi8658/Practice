package com.mindtree.enum_;

public class EnumTest {

	DaysOfWeek week;

	public EnumTest(DaysOfWeek week) {
		this.week = week;
	}

	public void dayIsLike() {

		switch (week) {
		case MONDAY:
			System.out.println("Monday is the to workship of God Shiv");
			break;
		case TUESDAY:
			System.out.println("Tuesday is the day of Maa Mangla");
			break;
		case WEDNESDAY:
			System.out.println("Wednesday is the day to workship is buddha");
			break;
		case THURSDAY:
			System.out.println("Thursday is the day to workship laxmi");
			break;
		case FRIDAY:
			System.out.println("Friday is the day to workship Maa Santoshi");
			break;
		case SATURDAY:
			System.out.println("Saturday is the day to workship Prabhu Birbajarang Bali");
			break;
		case SUNDAY:
			System.out.println("Sunday is the day to do lot of fun");
			break;
		default:
			System.out.println("Please provide an valid daysOfTheWeek");
		}
	}

	public static void main(String[] args) {
		EnumTest test = new EnumTest(DaysOfWeek.SATURDAY);

		test.dayIsLike();

	}
}
