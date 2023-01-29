package baseballThird;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 플레이어는 3개의 숫자를 입력하되, 중복이 있으면 안된다.
 *
 * 1. 3개의 숫자를 입력해야 한다.
 * 2. 중복된 숫자가 있으면 안된다.
 */
public class Player {


  public List<Integer> inputNumbers(String numbers) {
    return Arrays.stream(numbers.split(""))
        .map(Integer::parseInt)
        .collect(Collectors.toList());
  }
}
