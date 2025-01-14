package baseballSecond;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberGenerator {

  public List<Integer> createRandomNumber() {

    List<Integer> numbers = new ArrayList<>();

    while (numbers.size() < 3) {
      int number = new Random().nextInt(9) + 1;
      if (numbers.contains(number)) {
        continue;
      }
      numbers.add(number);
    }

    return numbers;
  }
}
