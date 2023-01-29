package baseballThird;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class InputCheckTest {

  private InputCheck inputCheck = new InputCheck();

  @ParameterizedTest
  @ValueSource(strings = {"123"})
  void 올바른_형식으로_입력_했을경우(String input) {
    assertTrue(inputCheck.isCorrectInput(input));
  }

  @ParameterizedTest
  @ValueSource(strings = {"111"})
  void 중복된_숫자를_입력했을_경우(String input) {
    assertFalse(inputCheck.isCorrectInput(input));
  }

  @ParameterizedTest
  @ValueSource(strings = {"1234"})
  void 숫자_4개를_입력했을_경우(String input) {
    assertFalse(inputCheck.isCorrectInput(input));
  }
}