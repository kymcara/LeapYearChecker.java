import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year:");
        int year = scanner.nextInt();

        checkLeapYear(year);

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Method to check if a year is a leap year
    private static void checkLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("The year you entered (" + year + ") is a leap year.");
        } else {
            System.out.println("The year you entered (" + year + ") is not a leap year.");
        }
    }
}
