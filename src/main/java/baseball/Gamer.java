package baseball;

/**
 * 숫자를 예측하는 게이머
 */
public class Gamer {

    /**
     * 게이머가 예측한 숫자
     */
    private String predictNumber;

    /**
     * 숫자를 예측한다.
     */
    public void predictNumber() {
        InputView inputView = new InputView();
        predictNumber = inputView.input();
    }

    /**
     * 예측한 숫자를 알려준다.
     * @return 예측한 숫자
     */
    public String getPredictNumber() {
        return predictNumber;
    }




}
