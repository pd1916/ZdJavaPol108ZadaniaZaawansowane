package pl.sdacademy.java.advance.exercises.day3.task27;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JoinerTest {

    @Test
    void shouldReturnCorrectResultFromInputAsStrings() {
        //given
        Joiner<String> joiner = new Joiner<>("|");
        String expectedResult = "a|b|c|d";
        //when
        String result = joiner.join("a", "b", "c", "d");
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnCorrectResultFromInputAsIntegers() {
        //given
        Joiner<Integer> joiner = new Joiner<>("-");
        String expectedResult = "1-2-3";
        //when
        String result = joiner.join(1, 2, 3);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

}