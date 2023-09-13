import java.math.BigDecimal;

public class StringCalculator {





    public static String sum(String input) {
        if (input.isEmpty()) {
            return "0";
        }

        String[] numberStrings = input.split(",|\n");
        BigDecimal normalSum = BigDecimal.ZERO;

        for (String numberString : numberStrings) {
            try {
                BigDecimal number = new BigDecimal(numberString);
                if (number.intValue() <= 1000) {
                    normalSum = normalSum.add(number);
                }
            } catch (NumberFormatException e) {
                // Ignorer les valeurs non numériques
            }
        }

        BigDecimal tenRemainder = normalSum.remainder(BigDecimal.TEN);
        BigDecimal hundredRemainder = normalSum.remainder(new BigDecimal(100));
        BigDecimal elevenRemainder = hundredRemainder.remainder(new BigDecimal(11));

        if (tenRemainder.intValue() == 6) {
            normalSum = normalSum.add(new BigDecimal(3000));
        }

        if (elevenRemainder.intValue() == 0) {
            normalSum = normalSum.multiply(new BigDecimal(2));
        }

        return normalSum.toPlainString();
    }
}
