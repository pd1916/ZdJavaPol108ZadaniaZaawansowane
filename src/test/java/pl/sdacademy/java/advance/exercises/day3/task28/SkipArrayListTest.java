package pl.sdacademy.java.advance.exercises.day3.task28;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class SkipArrayListTest {

    @Test
    void shouldReturnCorrectListOfStrings() {
        //given
        SkipArrayList<String> skipArrayList = new SkipArrayList<>();
        skipArrayList.addAll(List.of("a", "b", "c", "d", "e", "f", "g"));
        List<String> expectedResult = List.of("c", "g");
        //when
        List<String> result = skipArrayList.getEveryNthElement(2, 3);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnCorrectListOfIntegers() {
        //given
        SkipArrayList<Integer> skipArrayList = new SkipArrayList<>();
        skipArrayList.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13));
        List<Integer> expectedResult = List.of(6, 9, 12);
        //when
        List<Integer> result = skipArrayList.getEveryNthElement(5, 2);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

}