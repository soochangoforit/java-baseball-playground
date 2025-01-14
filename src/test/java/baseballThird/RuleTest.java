package baseballThird;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class RuleTest {

  @Test
  void 숫자_모두_다_맞는_경우() {
    Rule rule = new Rule();
    int count = rule.correctStrike(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
    assertEquals(3, count);
  }

  @Test
  void 숫자_일부만_맞는_경우() {
    Rule rule = new Rule();
    int count = rule.correctStrike(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 4));
    assertEquals(2, count);
  }

  @Test
  void 랜덤숫자_중에_사용자_숫자가_있는_개수_구하기() {
    Rule rule = new Rule();
    int numberInclude = rule.hasNumberCount(Arrays.asList(1, 2, 3), Arrays.asList(3,9,8));
    assertEquals(numberInclude, 1);
  }
}