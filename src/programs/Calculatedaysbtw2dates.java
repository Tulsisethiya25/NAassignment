package programs;

import java.util.Scanner;

public class Calculatedaysbtw2dates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int day = 0;
		int m[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		System.out.println("enter first date");
		int date = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		System.out.println("enter second date");
		int date1 = sc.nextInt();
		int month1 = sc.nextInt();
		int year1 = sc.nextInt();
		
		// if  first date appears after second date 
		if(year1<year || (year==year1 && month>month1) ||(year==year1 && month==month1 && date>date1)) {
			System.out.println("Inputs are invalid");
			System.exit(0);
		}

//		if month year date all are same
		if (year == year1 && month == month1 && date == date1) {
			System.out.println(day);
			System.exit(0);
		}
		//if month and year are same
		if (year == year1 && month == month1) {
			day = day + (date1 - date);
			System.out.println("no of day in a given month " + day);
			System.exit(0);
		}
		//if only year same
		if (year == year1) {

			if (month != 2) {
				day = day + (m[month - 1] - date);
			} else {
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
					day = day + (29 - date);
				else
					day = day + (m[month - 1] - date);

			}

			month++;

			while (month < month1) {
				if (month != 2) {
					day = day + m[month - 1];
				} else {
					if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
						day = day + 29;
					else
						day = day + m[month - 1];

				}
				month++;

			}
			day = day + date1;
			System.out.println(day);
			System.exit(0);
		}

		// if year are different
		if (month != 2) {
			day = day + (m[month - 1] - date);
		} else {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				day = day + (29 - date);
			else
				day = day + (m[month - 1] - date);

		}

		month++;

		while (month < 13) {
			if (month != 2) {
				day = day + m[month - 1];
			} else {
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
					day = day + 29;
				else
					day = day + m[month - 1];

			}
			month++;

		}

		year++;
		while (year < year1) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				day = day + 366;
			} else
				day = day + 365;
			year++;
		}

		for (int i = 1; i < month1; i++) {
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				m[2] = 29;
			day = day + m[i - 1];

		}
		day = day + date1;
		System.out.println(day);
	}

}
