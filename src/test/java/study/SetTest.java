package study;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {
    private Set<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);
    }

    // Test1
    @Test
    void check_size() {
        assertThat(numbers.size()).isEqualTo(3);
    }

    // Test2
    @ParameterizedTest
    @ValueSource(ints={1,2,3,4,5})
    void contains(int number) {
        assertThat(numbers.contains(number));
    }

    // Test3
    @ParameterizedTest
    @CsvSource({"1,true","2,true","3,true","4,false","5,false"})
    void contains(int number, boolean result) {
        assertThat(numbers.contains(number)).isEqualTo(result);
    }

}
