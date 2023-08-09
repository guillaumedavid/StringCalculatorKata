import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {


    @Test
    void shouldGetReturnSingleValue(){
        //GIVEN
        String input = "1";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("1");
    }

    @Test
    void shouldGetZeroForEmptyInput(){
        //GIVEN
        String input = "";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("0");
    }

    @Test
    void shouldSumIntegers(){
        //GIVEN
        String input = "1,2";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("3");
    }

    @Test
    void shouldSumDecimals(){
        //GIVEN
        String input = "1.1,2.2";
        //WHEN
        String result = StringCalculator.sum(input);
        //THEN
        Assertions.assertThat(result).isEqualTo("3.3");
    }
}
