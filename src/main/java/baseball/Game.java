package baseball;

/**
 * 실질적인 게임이 이루어진다.
 */
public class Game {

    private final Dealer dealer;
    private final Gamer gamer;
    private final Rule rule;
    private final ResultView resultView;
    private final InputView inputView;

    public Game() {
        dealer = new Dealer();
        gamer = new Gamer();
        rule = new Rule();
        resultView = new ResultView();
        inputView = new InputView();
    }


    public void start() {
        boolean isContinue = true;
        while (isContinue) {
            dealer.generateNumber();
            play();
            resultView.askContinue();
            isContinue = isContinue();
        }
        resultView.endMessage();

    }

    /**
     * 게임을 진행한다.
     * 다 맞출 경우 혹은 그렇지 않는 경우, 그 결과를 출력해서 보여준다.
     */
    private void play() {
        boolean flag = true;
        while (flag) {
            gamer.predictNumber();
            String resultAnswer = rule.isMatched(dealer.getNumber(), gamer.getPredictNumber());
            resultView.print(resultAnswer);

            if (resultAnswer.equals("3스트라이크")) {
                resultView.print("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
                flag = false;
            }
        }
    }

    /**
     * 사용자가 게임을 계속해서 진행할 지 여부를 판단한다.
     * @return 진행 여부
     */
    private boolean isContinue() {
        String answer = inputView.input();
        return answer.equals("1");
    }


}
