public class LastDigitChecker {
    public static boolean hasSameLastDigit(int first, int second, int third) {
        if (!isValid(first) || !isValid(second) || !isValid(third)){
            return false;
        } else {
            int compareFirstDigit = 0;
            int compareSecondDigit = 0;
            int compareThirdDigit = 0;
            int tempSecond = 0;
            int tempThird =0;
            boolean hasShared = false;

            while(first != 0) {
                compareFirstDigit = first % 10;
                tempSecond = second;

                while(tempSecond != 0) {
                    compareSecondDigit = tempSecond % 10;
                    tempThird = third;

                    while(tempThird != 0) {
                        compareThirdDigit = tempThird % 10;

                        if((compareFirstDigit == compareSecondDigit) || (compareFirstDigit == compareThirdDigit) || (compareSecondDigit == compareThirdDigit)) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                    tempSecond /= 10;
                }

                first /= 10;
            }

            return false;
        }
    }

    public static boolean isValid(int number){
        if(number < 10 || number > 1000){
            return false;
        }
        return true;
    }
}
