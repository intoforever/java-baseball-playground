package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    @Test
    @DisplayName("replace 테스트")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("split 테스트")
    void split() {
        String[] test1 = "1,2".split(",");
        String[] test2 = "1".split(",");

        assertThat(test1).contains("1", "2");
        assertThat(test2).containsExactly("1");
    }

    @Test
    @DisplayName("subString 테스트")
    void substring() {
        String test1 = "(1,2)".substring(1, 4);
        System.out.printf("substring 결과: %s\n", test1);
    }

    @Test
    @DisplayName("chatAt 테스트")
    void testException() {
        String test = "abc";
        assertThatThrownBy(() -> {test.charAt(3);})
            .isInstanceOf(StringIndexOutOfBoundsException.class)
            .hasMessageContaining("String index out of range");
    }


}
