/*
Easter Sunday is the first Sunday after the full moon of spring.
To compute the date, you can use this algorithm that is invented by 
the mathematician Carl Friedrich Gauss in 1800:

1. Let y be the year (such as 1800 or 2001)
2. Divide y by 19 and call the remainder a. Ignore the quotient.
3. Divide y by 100 to get quotient b and remainder c.
4. Divide b by 4 to get quotient d and remainder e.
5. Divide 8 * b + 13 by 25 to get quotient g. Ignore the remainder.
6. Divide 19 * a + b - d - g + 15 by 30 to get remainder h. Ignore the quotient.
7. Divide c by 4 to get quotient j and remainder k.
8. Divide a + 11 * h by 319 to get quotient m. Ignore the remainder.
9. Divide 2 * e + 2 * j - k - h + m + 32 by 7 to get remainder r. Ignore the quotient.
10. Divide h - m + r + 90 by 25 to get quotient n. Ignore the remainder.
11. Divide h - m + r + n + 19 by 32 to get remainder p. Ignore the quotient.

Then Easter falls on day p of month n. For example: if y is 2001:

Therefore, in 2001, Easter Sunday fell on April 15. Write a program that prompts the 
user for a year and prints out the month and the day of Easter Sunday.
*/

import java.util.Scanner;
//import java.time.Month;

public class Easter {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the year: ");
		int y = s.nextInt();
		int a = y % 19, b = y / 100, c = y % 100, d = b / 4, e = b % 4,
			g =  (8 * b + 13) / 25, h = (19 * a + b - d - g + 15) % 30,
			j = c / 4, k = c % 4, m = (a + 11 * h) / 319, r = (2 * e +2 * j - k - h + m +32) % 7,
			n = (h - m + r + 90) / 25, p = (h - m + r + n + 19) % 32;
		String month = n == 3 ? "March" : "April";
		//System.out.println("The Easter Sunday in " + y + " is " + Month.of(n) + " " + p);
		System.out.println("The Easter Sunday in " + y + " is " + month + " " + p);
                s.close();
	}
}
		
