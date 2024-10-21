package week7;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class a12 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            // 输入年份和月份
            System.out.print("Enter full year (e.g., 2012): ");
            int year = input.nextInt();
            System.out.print("Enter month as number between 1 and 12: ");
            int month = input.nextInt();

            // 显示日历
            printMonthCalendar(year, month);
        }
    }

    public static void printMonthCalendar(int year, int month) {
        LocalDate date = LocalDate.of(year, month, 1);
        int daysInMonth = date.lengthOfMonth();
        int firstDayOfWeek = date.getDayOfWeek().getValue();

        // 打印月份和年份
        System.out.println(date.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH) + " " + year);
        System.out.println("-----------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        // 打印日历内容
        for (int i = 0; i < firstDayOfWeek % 7; i++) {
            System.out.print("    ");
        }
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);
            if ((firstDayOfWeek + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
}

