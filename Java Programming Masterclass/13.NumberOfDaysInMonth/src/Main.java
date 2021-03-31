public class Main {
    public static void main(String[] args) {
        System.out.println("-1600 " + NumberOfDaysInMonth.isLeapYear(-1600));
        System.out.println("1600 " + NumberOfDaysInMonth.isLeapYear(1600));
        System.out.println("2017 " + NumberOfDaysInMonth.isLeapYear(2017));
        System.out.println("2000 " + NumberOfDaysInMonth.isLeapYear(2000));
        System.out.println("0 " + NumberOfDaysInMonth.isLeapYear(0));

        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(2, 2018));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(-1, 2020));
        System.out.println(NumberOfDaysInMonth.getDaysInMonth(1, -2020));
    }
}
