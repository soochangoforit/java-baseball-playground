package baseball;

/**
 * 딜러의 숫자와 사용자의 숫자 값을 비교하는 역할
 */
public class Rule {

    public String isMatched(String dealerNumber, String gamerNumber) {

        if (isAllMatched(dealerNumber, gamerNumber)) {
            return "3스트라이크";
        }

        if (isAnyMatched(dealerNumber, gamerNumber)) {
            String result ="";

            int strike = findMatchedStrikeNumbers(dealerNumber, gamerNumber);
            if (strike > 0) {
                result += strike + "스트라이크";
            }

            int ball = findMatchedBallNumbers(dealerNumber, gamerNumber);
            if (ball != 0) {
                result += " " + ball + "볼";
            }

            return result;

        }

        return "낫싱";
    }

    private int findMatchedBallNumbers(String dealerNumber, String gamerNumber) {
        int matchedBallNumbers = 0;
        for (int i = 0; i < dealerNumber.length(); i++) {
            for (int j = 0; j < gamerNumber.length(); j++) {
                if (dealerNumber.charAt(i) == gamerNumber.charAt(j) && i != j) {
                    matchedBallNumbers++;
                }
            }
        }
        return matchedBallNumbers;
    }

    private int findMatchedStrikeNumbers(String dealerNumber, String gamerNumber) {
        int count = 0;
        for (int i = 0; i < dealerNumber.length(); i++) {
            if (dealerNumber.charAt(i) == gamerNumber.charAt(i)) {
                count++;
            }
        }
        return count;
    }


    private boolean isAnyMatched(String dealerNumber, String gamerNumber) {

        // return true if dealerNumber contains any of gamerNumber
        for (int i = 0; i < dealerNumber.length(); i++) {
            for (int j = 0; j < gamerNumber.length(); j++) {
                if (dealerNumber.charAt(i) == gamerNumber.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean isAllMatched(String dealerNumber, String gamerNumber) {
        return dealerNumber.equals(gamerNumber);
    }

}


