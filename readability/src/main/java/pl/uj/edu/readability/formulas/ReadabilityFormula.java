package pl.uj.edu.readability.formulas;

import pl.uj.edu.readability.TextStat;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;

public interface ReadabilityFormula {

    double calculate(TextStat textStat);

    default double round(double value) {
        return new BigDecimal(value).setScale(4, HALF_UP).doubleValue();
    }
}
