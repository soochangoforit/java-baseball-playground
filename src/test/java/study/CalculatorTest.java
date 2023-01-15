package study;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void add() {
        int result = calculator.add(1, 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void subtract() {
        int result = calculator.subtract(1, 2);
        assertThat(result).isEqualTo(-1);
    }

    @Test
    void multiply() {
        int result = calculator.multiply(1, 2);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void divide() {
        int result = calculator.divide(1, 2);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void remainder() {
        int result = calculator.remainder(1, 2);
        assertThat(result).isEqualTo(1);
    }


    @Test
    void finalTest() {
        int calculate = calculator.calculate("2 + 3 * 4 / 2");
        assertThat(calculate).isEqualTo(10);
    }






}
