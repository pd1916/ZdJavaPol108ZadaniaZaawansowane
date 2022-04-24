package pl.sdacademy.java.advance.exercises.day1.task8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

/*
    część testów napisałem z wykorzystaniem tzw testów sparametryzowanych @ParameterizedTest
    będziecie się uczyć o nich na bloku z testów zaawansowanych ale dla chętnych pdorzucam już tutaj takie
    rozwiązanie.
    więcej możecie poczytać np tutaj: https://www.baeldung.com/parameterized-tests-junit-5
 */
class ParcelValidatorWithSomeTrickTest {
    private Validator validator;

    @BeforeEach
    void setUp() {
        validator = new ParcelValidator();
    }

    @Test
    void shouldBePossibleToAddNonExpressParcel() {
        //given
        Parcel parcel = new Parcel(35, 40, 45, 29, false);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldNotBePossibleToAddNonExpressParcelWhenSumOfLengthsIsTooHigh() {
        //given
        Parcel parcel = new Parcel(100, 100, 101, 29, false);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void shouldNotBePossibleToAddNonExpressParcelWhenSingleDimensionIsTooLow(int xLength, int yLength, int zLength) {
        //given
        Parcel parcel = new Parcel(xLength, yLength, zLength, 29, false);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldNotBePossibleToAddNonExpressParcelWhenWeightIsTooHigh() {
        //given
        Parcel parcel = new Parcel(30, 35, 40, 31, false);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldBePossibleToAddExpressParcel() {
        //given
        Parcel parcel = new Parcel(35, 40, 45, 14, true);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isTrue();
    }

    @Test
    void shouldNotBePossibleToAddExpressParcelWhenSumOfLengthsIsTooHigh() {
        //given
        Parcel parcel = new Parcel(100, 100, 101, 14, true);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

    @ParameterizedTest
    @MethodSource("provideData")
    void shouldNotBePossibleToAddExpressParcelWhenSingleDimensionIsTooLow(int xLength, int yLength, int zLength) {
        //given
        Parcel parcel = new Parcel(xLength, yLength, zLength, 14, true);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldNotBePossibleToAddExpressParcelWhenWeightIsTooHigh() {
        //given
        Parcel parcel = new Parcel(30, 35, 40, 16, true);
        //when
        boolean result = validator.validate(parcel);
        //then
        assertThat(result).isFalse();
    }

    private static Stream<Arguments> provideData() {
        return Stream.of(
                Arguments.of(29, 30, 35),
                Arguments.of(30, 29, 35),
                Arguments.of(30, 35, 29)
        );
    }

}