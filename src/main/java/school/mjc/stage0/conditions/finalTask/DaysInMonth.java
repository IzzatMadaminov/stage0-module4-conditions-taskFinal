package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year > 0 && month > 0 && month < 13) {
            if (month == 2) {
                if (isLeapYear(year)) {
                    System.out.println(29);
                } else {
                    System.out.println(28);
                }
            } else if (month < 8 && month % 2 != 0 || month == 8 || month > 9 && month % 2 == 0) {
                System.out.println(31);
            } else {
                System.out.println(30);
            }
        } else {
            System.out.println("invalid date");
        }
    }

    public boolean isLeapYear(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeap = year % 400 == 0;
            } else {
                isLeap = true;
            }
        }
        return isLeap;
    }
}
