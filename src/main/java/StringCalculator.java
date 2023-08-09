import java.math.BigDecimal;
import java.util.Arrays;

public class StringCalculator {

    public static String sum(String input) {
        if (input.isEmpty()) {
            return "0";
        }
        return Arrays.stream(input.split(","))
                .map(BigDecimal::new)
                .reduce(BigDecimal::add)
                .get()
                .toPlainString();
    }
}
