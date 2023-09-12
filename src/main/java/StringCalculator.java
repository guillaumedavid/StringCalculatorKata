import javax.swing.*;
import java.math.BigDecimal;
import java.util.Arrays;

public class StringCalculator {

    public static String sum(String input) {
        if (input.isEmpty()) {
            return "0";
        }
        BigDecimal normalSum = Arrays.stream(input.split(","))
                .map(BigDecimal::new)
                .reduce(BigDecimal::add)
                .get();

        if (normalSum.remainder(BigDecimal.TEN).intValue() == 6){
            normalSum = normalSum.add(new BigDecimal(3000));
        }

        if (normalSum.remainder(new BigDecimal(100)).remainder(new BigDecimal(11)).intValue()  == 0){
            normalSum = normalSum.multiply(new BigDecimal(2));
        }

        return normalSum.toPlainString();
    }
}
