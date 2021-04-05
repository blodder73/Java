public class EvenDigitSum {
    public static int getEvenDigitSum(int number){
        if(number < 0) {
            return -1;
        } else {
            int evenDigitSum = 0;
            int getDigit = 0;

            while(number != 0) {
                getDigit = number % 10;
                number /= 10;
                if(getDigit % 2 == 0) {
                    evenDigitSum += getDigit;
                }

            }
            return evenDigitSum;
        }
    }
}
