public class Main {
    public static void main(String[] args) {
        boolean isALeapYear;
        System.out.println("1700 " + LeapYear.isLeapYear(1700));
        System.out.println("1800 " + LeapYear.isLeapYear(1800));
        System.out.println("1900 " + LeapYear.isLeapYear(1900));
        System.out.println("2100 " + LeapYear.isLeapYear(2100));
        System.out.println("2200 " + LeapYear.isLeapYear(2200));
        System.out.println("2300 " + LeapYear.isLeapYear(2300));
        System.out.println("2500 " + LeapYear.isLeapYear(2500));
        System.out.println("2600 " + LeapYear.isLeapYear(2600));
        System.out.println("1600 " + LeapYear.isLeapYear(1600));
        System.out.println("2000 " + LeapYear.isLeapYear(2000));
        System.out.println("2400 " + LeapYear.isLeapYear(2400));
        System.out.println("\n\n");
        System.out.println("-1600 " + LeapYear.isLeapYear(-1600));
        System.out.println("2017 " + LeapYear.isLeapYear(2017));
        System.out.println("2000 " + LeapYear.isLeapYear(2000));
        System.out.println("1924 " + LeapYear.isLeapYear(1924));

    }
}
