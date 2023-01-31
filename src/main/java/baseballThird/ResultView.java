package baseballThird;

/**
 * 1. 볼, 스트라이크, 낫싱을 출력한다.
 * 2. 3개의 숫자를 모두 맞히셨습니다! 게임 종료
 */
public class ResultView {

  public void printResult(int strike, int ball) {
    if (strike == 0 && ball == 0) {
      System.out.println("낫싱");
      return;
    }

    if (ball > 0) {
      System.out.print(ball + "볼");
    }


    if (strike > 0) {
      System.out.print(strike + "스트라이크 ");
    }


    System.out.println();
  }

  public void printGameEnd() {
    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
  }

}
