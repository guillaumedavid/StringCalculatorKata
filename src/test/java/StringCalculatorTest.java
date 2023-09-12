import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class StringCalculatorTest {


    @Test
    void shouldGetReturnSingleValue() {
        //GIVEN
        String input = "1";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("1");
    }

    @Test
    void shouldGetZeroForEmptyInput() {
        //GIVEN
        String input = "";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("0");
    }

    @Test
    void shouldSumIntegers() {
        //GIVEN
        String input = "1,2";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("3");
    }

    @Test
    void shouldSumDecimals() {
        //GIVEN
        String input = "1.1,2.2";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("3.3");
    }

    @Test
    void shouldAdd3000ToResultIfEndBy6() {
        //GIVEN
        String input = "142,34";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("3176");
    }

    @ParameterizedTest
    @MethodSource("dataForShouldMultipleBy2IfThe2lastDigitsAreTheSame")
    void shouldMultipleBy2IfThe2lastDigitsAreTheSame(String input, String output) {
        //GIVEN
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo(output);
    }

    private static Stream<Arguments> dataForShouldMultipleBy2IfThe2lastDigitsAreTheSame() {
        return Stream.of(
                Arguments.of("624,20","1288"),
                Arguments.of("700","1400"),
                Arguments.of("711,500","2422")

        );
    }

    @Test
    void shouldAdd3000AndMultipleBy2IfEndBy6And2LastdigitsAreTheSame() {
        //GIVEN
        String input = "666";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("7332");
    }

    @Test
    void shouldAcceptNewlineSeparator() {
        //GIVEN
        String input = "1\n2,4";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("7");
    }

    @Test
    void shouldIgnoreNumbersBiggerThan1000() {
        //GIVEN
        String input = "2,1001";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("2");
    }

}
