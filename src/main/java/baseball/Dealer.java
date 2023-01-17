package baseball;

/**
 * 3자리 숫자를 생성하는 클래스
 */
public class Dealer {


    private int number;

    public Dealer() {}

    /**
    * 3자리 숫자를 생성하는 메서드
    */
    public void generateNumber() {
        number = (int) (Math.random() * 900) + 100;
        System.out.println(number);
    }

    /**
    * 3자리의 숫자를 알려주는 메서드
    */
    public String getNumber() {
        return String.valueOf(number);
    }
}
