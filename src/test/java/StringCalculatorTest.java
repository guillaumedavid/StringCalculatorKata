import org.assertj.core.api.Assertions;
import org.junit.Test;

public class StringCalculatorTest {


    @Test
    public void shouldGetReturnSingleValue() {
        //GIVEN
        String input = "1";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("1");
    }

    @Test
    public void shouldGetZeroForEmptyInput() {
        //GIVEN
        String input = "";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("0");
    }

    @Test
    public void shouldSumIntegers() {
        //GIVEN
        String input = "1,2";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("3");
    }

    @Test
    public void shouldSumDecimals() {
        //GIVEN
        String input = "1.1,2.2";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("3.3");
    }

    @Test
    public void shouldAdd3000ToResultIfEndBy6() {
        //GIVEN
        String input = "142,34";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("3176");
    }

    @Test
    public void shouldMultipleBy2IfThe2lastDigitsAreTheSame() {
        //GIVEN
        String input = "624,20";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("1288");
    }

    @Test
    public void shouldAdd3000AndMultipleBy2IfEndBy6And2LastdigitsAreTheSame() {
        //GIVEN
        String input = "666";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("7332");
    }

    @Test
    public void shouldAcceptNewlineSeparator() {
        //GIVEN
        String input = "1\n2,4";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("7");
    }

    @Test
    public void shouldIgnoreNumbersBiggerThan1000() {
        //GIVEN
        String input = "2,1001";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("2");
    }

}
