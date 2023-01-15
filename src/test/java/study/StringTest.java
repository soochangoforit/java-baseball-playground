package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("split - v1.1")
    void split() {
        String[] test1 = "1,2".split(",");
        String[] test2 = "1".split(",");

        assertThat(test1).contains("1", "2");
        assertThat(test2).containsExactly("1");
    }

    @Test
    @DisplayName("split - v1.2")
    void substring() {
        String test1 = "(1,2)".substring(0, 4);
        assertThat(test1).contains("1", "2");
    }

    @Test
    @DisplayName("charAtSuccess - v1.3")
    void charAtSuccess() {
        char charAt = "abc".charAt(1);
        assertThat(charAt).isEqualTo('b');
    }

    @Test
    @DisplayName("charAtFail - v1.3")
    void charAtFail() {
        assertThatThrownBy(() -> {
            char charAt = "abc".charAt(5);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
    }
}
