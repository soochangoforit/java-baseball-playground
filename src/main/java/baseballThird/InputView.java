package baseballThird;

import java.util.Scanner;

/**
 * 1. 숫자를 입력받는다.
 * 2. 게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
 */
public class InputView {

  public String scanNumbers() {
    System.out.print("숫자를 입력해주세요 : ");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  public boolean scanRestart() {
    System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요. : ");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextInt() == 1;
  }

}
