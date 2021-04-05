public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {
        int firstDigit = 0;
        int lastDigit = 0;
        int temp = number;

        while(number >= 0) {
            firstDigit = number % 10;
            lastDigit = temp;
            temp = temp / 10;

            if(temp == 0) {
                return (firstDigit + lastDigit);
            }
        }
        return -1;
    }
}
