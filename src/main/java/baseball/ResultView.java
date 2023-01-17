package baseball;

/**
 * 화면 출력을 담당한다.
 */
public class ResultView {
    public void print(String s) {
        System.out.println(s);
    }

    public void askContinue() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }

    public void endMessage() {
        System.out.println("게임을 종료합니다.");
    }
}
