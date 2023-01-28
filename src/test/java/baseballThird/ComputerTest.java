package baseballThird;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class ComputerTest {

  @Test
  void generate_숫자_3개_생성() {
    Computer computer = new Computer();
    List<Integer> numbers = computer.generate();
    assertEquals(3, numbers.size());
  }

  @Test
  void generate_중복되지_않는_숫자_3개() {
    Computer computer = new Computer();
    List<Integer> numbers = computer.generate();

    for (int i = 0; i < numbers.size(); i++) {
      for (int j = i + 1; j < numbers.size(); j++) {
        assertNotEquals(numbers.get(i), numbers.get(j));
      }
    }
  }

}