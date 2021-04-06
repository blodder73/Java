public class NumberToWords {
    public static void numberToWords(int number){
        int reverse = reverse(number);
        int numberOfDigitsOriginal = getDigitCount(number);
        int numberOfDigitsReverse = getDigitCount(reverse);
        int sumDigits = numberOfDigitsOriginal - numberOfDigitsReverse;

        if(reverse < 0){
            System.out.println("Invalid Value");
        } else if(reverse == 0){
            System.out.println("Zero");
        } else {
            while(reverse > 0) {
                int i = reverse % 10;

                switch(i){
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
               reverse /= 10;
            }
        }

        for (int i = sumDigits; i != 0; i--){
            System.out.println("Zero");
        }
    }

    public static int reverse (int number) {
        int reverse = 0;
        int lastDigit =0;
        while(number != 0) {
            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return reverse;
    }

    public static int getDigitCount(int number) {
        int countDigit = 0;
        if(number < 0) {
            return -1;
        } else if(number == 0) {
            return 1;
        } else {
            while(number != 0) {
                number /= 10;
                countDigit++;
            }
            return countDigit;
        }
    }
}
