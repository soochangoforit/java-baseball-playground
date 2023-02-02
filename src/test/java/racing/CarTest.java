package racing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest {

  @Test
  @DisplayName("자동차는 이름을 가질 수 있다.")
  void name() {
    Car car = new Car("pobi");
    assertEquals("pobi", car.getName());
  }

  @Test
  @DisplayName("자동차의 이름은 5자를 초과할 수 없다.")
  void name2() {
    assertThrows(IllegalArgumentException.class, () -> {
      new Car("pobibob");
    });
  }


}