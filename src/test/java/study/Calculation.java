package study;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Calculation {
    List<String> numbers = new ArrayList();
    int result = 0;

    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b) {
        return a - b;
    }

    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }

    @BeforeEach
    void test() {
        String input = "2 + 3 * 4 / 2";
        numbers = Arrays.asList(input.split(" "));
//        assertThatThrownBy(() -> {
//        }).isInstanceOf(IndexOutOfBoundsException.class);
    }
    // Test Case 구현
    @ParameterizedTest
    @ValueSource(strings = {"+", "-", "*", "/"}) // six numbers
    void contains(String operator) {
        assertTrue(numbers.contains(operator));
        int index = numbers.indexOf(operator);
        int val1 = Integer.parseInt(numbers.get(index - 1));
        int val2 = Integer.parseInt(numbers.get(index + 1));
        if (operator == "+") {
            assertThat(val1 + val2);
        } else if (operator == "-") {
            assertThat(val1 - val2);
        } else if (operator == "*") {
            assertThat(val1 * val2);
        } else {
            assertThat(val1 / val2);
        }
    }
//    // Test Case 구현
//    @ParameterizedTest
//    @CsvSource(value = {"+", "-", "*", "/"})
//    void contains(String operator) {
//        assertTrue(numbers.contains(operator));
////        int index = numbers.indexOf(operator);
////        int val1 = Integer.parseInt(numbers.get(index - 1));
////        int val2 = Integer.parseInt(numbers.get(index + 1));
////        if (operator == "+") {
////            result += val1 + val2;
////        } else if (operator == "-") {
////            result += val1 - val2;
////        } else if (operator == "*") {
////            result += val1 * val2;
////        } else {
////            result += val1 / val2;
////        }
//    }

}
