package racing;

public class Game {

  private Car car;
  private RacingRule racingRule;
  private ResultView resultView;
  private InputView inputView;

  public Game() {
    inputView = new InputView();
    racingRule = new RacingRule();
    resultView = new ResultView();
  }

  public void start() {
    String carNames = inputView.inputCarNames();
    int moveCount = inputView.inputMoveCount();
    resultView.printEmptyLine();
    racingRule.getCarFromString(carNames);

    racingRule.startGame(moveCount);

    resultView.printFinalPosition(racingRule.getCars());
    resultView.printEmptyLine();
    resultView.printWinner(racingRule.getWinner());
  }

}
