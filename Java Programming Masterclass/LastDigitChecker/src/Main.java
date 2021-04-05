public class Main {
    public static void main(String[] args) {
        System.out.println(LastDigitChecker.hasSameLastDigit(9, 99, 999));
        System.out.println(LastDigitChecker.hasSameLastDigit(999, 99, 9));
        System.out.println(LastDigitChecker.hasSameLastDigit(99, 9, 999));
        System.out.println(LastDigitChecker.hasSameLastDigit(11, 99, 999));
        System.out.println(LastDigitChecker.hasSameLastDigit(41, 22, 71));
        System.out.println(LastDigitChecker.hasSameLastDigit(23, 32, 42));
        System.out.println(LastDigitChecker.hasSameLastDigit(22, 23, 34));
    }
}
