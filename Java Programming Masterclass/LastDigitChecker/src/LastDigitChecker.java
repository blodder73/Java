public class LastDigitChecker {
    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (!isValid(first) || !isValid(second) || !isValid(third)){
            return false;
        } else {
            int compareFirstDigit;
            int compareSecondDigit;
            int compareThirdDigit;
            int tempSecond;
            int tempThird;

            while(first != 0) {
                compareFirstDigit = first % 10;
                tempSecond = second;

                while(tempSecond != 0) {
                    compareSecondDigit = tempSecond % 10;
                    tempThird = third;

                    while(tempThird != 0) {
                        compareThirdDigit = tempThird % 10;

                        return (compareFirstDigit == compareSecondDigit) || (compareFirstDigit == compareThirdDigit) || (compareSecondDigit == compareThirdDigit);
                    }

                    tempSecond /= 10;
                }

                first /= 10;
            }

            return false;
        }
    }

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }
}
