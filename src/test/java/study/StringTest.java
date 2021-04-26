package study;

// String test
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {
    // re1
    @Test
    void split() {
        final String[] actual = "1,2".split(",");
        //assertThat(actual).contains("1","2");
        assertThat(actual).containsExactly("1", "2");
        assertThat(actual).containsExactly(actual);
        assertThat(actual).contains(actual);
        assertThat(actual).contains("1","2");
    }

    // re2
    @Test
    void remove() {
        final String actual2 = "(1,2)".replace("(", "").replace(")","");
        assertThat(actual2).contains("1,2");

    }

    // re3
    @DisplayName("find index of something string.")
    @Test
    void find() {
        String actual3 = "abcde";
        assertThatThrownBy(()
                -> { actual3.charAt(7);
        }).isInstanceOf(StringIndexOutOfBoundsException.class);
//        try {
//            System.out.println(actual3.charAt(3));
//        } catch (StringIndexOutOfBoundsException e) {
//            System.out.println("error!"); }
    }
}
