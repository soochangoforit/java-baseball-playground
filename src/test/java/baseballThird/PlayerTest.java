package baseballThird;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class PlayerTest {

  @ParameterizedTest
  @ValueSource(strings = {"123"})
  void 입력한_숫자_3개_생성(String numbers) {
    Player player = new Player();
    List<Integer> inputNumbers = player.inputNumbers(numbers);
    assertEquals(3, inputNumbers.size());
  }



}