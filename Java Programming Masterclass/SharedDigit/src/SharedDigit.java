public class SharedDigit {
    public static boolean hasSharedDigit(int first, int second) {
        if((first < 10 || first > 99) || (second < 10 || second > 99)) {
            return false;
        }

        int compareFirstDigit = 0;
        int compareSecondDigit = 0;
        int tempSecond = 0;
        boolean hasShared = false;

        while(first != 0) {
            compareFirstDigit = first % 10;
            tempSecond = second;
            while(tempSecond != 0) {
                compareSecondDigit = tempSecond % 10;

                if(compareFirstDigit == compareSecondDigit) {
                    hasShared = true;
                    return hasShared;
                } else {
                    hasShared = false;
                }

                tempSecond /= 10;
            }

            first /= 10;
        }

        return hasShared;
    }
}
