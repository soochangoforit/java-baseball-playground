package baseballThird;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 랜덤으로 숫자 3개를 제공해준다.
 * 다만, 숫자 3개는 중복 되지 않는다.
 */
public class Computer {

  /**
   * 랜덤으로 숫자 3개를 생성한다.
   * 다만, 숫자 3개는 중복 되지 않는다.
   * @return 숫자 3개
   */
  public List<Integer> generate() {
    List<Integer> numbers = new ArrayList<>();

    while (numbers.size() < 3) {
      int number = getNumber();
      checkDuplicate(numbers, number);
    }

    return numbers;
  }

  private static void checkDuplicate(List<Integer> numbers, int number) {
    if (numbers.contains(number)) {
      return;
    }
    numbers.add(number);
  }

  private int getNumber() {
    int number = new Random().nextInt(9) + 1;
    return number;
  }
}
