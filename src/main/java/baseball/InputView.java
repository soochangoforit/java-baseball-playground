package baseball;

import java.util.Scanner;

/**
 * 사용자의 입력을 받는 클래스
 */
public class InputView {

    private final Scanner scanner;

    public InputView() {
        scanner = new Scanner(System.in);
    }

    /**
     * 사용자의 입력을 받는 메서드
     * @return 사용자의 입력
     */
    public String input() {
        System.out.print("숫자를 입력해주세요 : ");
        return scanner.nextLine();
    }

}
