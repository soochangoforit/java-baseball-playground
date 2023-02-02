package racing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingRuleTest {

  @Test
  @DisplayName("여러 대의 자동차는 쉼표(,)를 기준으로 구분한다.")
  void name() {
    RacingRule racingRule = new RacingRule("pobi,crong,honux");
    assertEquals(3, racingRule.getCars().size());
  }

  @Test
  @DisplayName("자동차가 전진하는 조건은 0 ~ 9 사이에서 랜덤값을 구한 후 랜덤값이 4 이상일 경우이다.")
  void add_position_to_car_if_random_value_is_over_4() {
    RacingRule racingRule = new RacingRule("pobi");
    racingRule.moveCars();
    assertEquals(1, racingRule.getCars().get(0).getPosition());
  }

}