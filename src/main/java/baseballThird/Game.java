package baseballThird;

import java.util.List;

/**
 * 실제 게임을 진행하는 클래스
 */
public class Game {

  private final Rule rule;
  private final Player player;
  private final InputView inputView;
  private final ResultView resultView;

  private final InputCheck inputCheck;

  private final Computer computer;

  public Game() {
    rule = new Rule();
    player = new Player();
    inputView = new InputView();
    resultView = new ResultView();
    inputCheck = new InputCheck();
    computer = new Computer();
  }

  public void play() {
    List<Integer> answers = computer.generate();
    System.out.println(answers);

    boolean flag = true;
    while (flag) {
      String playNumbers = inputView.scanNumbers();
      if (inputCheck.isCorrectInput(playNumbers)) {
        List<Integer> playNumberList = player.inputNumbers(playNumbers);
        int strike = rule.correctStrike(answers, playNumberList);
        int ball = rule.hasNumberCount(answers, playNumberList) - strike;
        resultView.printResult(strike, ball);
        if (isEnd(strike)) {
          resultView.printGameEnd();
          flag = inputView.scanRestart();
          answers = computer.generate();
          System.out.println(answers);
        }
      }
    }

  }





  private static boolean isEnd(int strike) {
    return strike == 3;
  }

}
