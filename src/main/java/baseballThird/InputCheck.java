package baseballThird;

/**
 * 사용자 입력을 검증하는 책임을 가진다.
 *
 * 1. 사용자는 3개의 숫자를 입력해야 한다.
 * 2. 사용자는 중복된 숫자를 입력할 수 없다.
 */
public class InputCheck {

  private final int MAX_INPUT_NUMBER = 3;

  /**
   * 사용자가 입력한 숫자가 3개인지 확인한다.
   * @param numbers 사용자가 입력한 String 숫자
   * @return 3개의 숫자를 입력했고, 중복이 없으면 true, 아니면 false
   */
  public boolean isCorrectInput(String numbers) {
    return numbers.length() == MAX_INPUT_NUMBER && isNotDuplicate(numbers);
  }

  /**
   * 중복된 숫자가 있는지 확인한다.
   */
  private boolean isNotDuplicate(String numbers) {
    return numbers.chars().distinct().count() == numbers.length();
  }

}
