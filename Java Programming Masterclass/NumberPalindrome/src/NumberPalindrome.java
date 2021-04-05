public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int orginalNumber = number;
        int reverse = 0;
        int lastDigit;

        while(number != 0) {
            lastDigit = number % 10;
            reverse = reverse * 10;
            reverse = reverse + lastDigit;
            number = number / 10;

            if (number == 0){
                break;
            }
        }
        if (orginalNumber == reverse){
            return true;
        }
        return false;
    }
}
