package pl.uj.edu.readability.formulas;

import pl.uj.edu.readability.TextStat;
import lombok.ToString;

/**
 * https://en.wikipedia.org/wiki/SMOG
 */
@ToString
public class Smog implements ReadabilityFormula {

    @Override
    public double calculate(TextStat textStat) {
        if (textStat.getSentences().size() < 30) {
            return -1;
        }
        return round(1.043 * Math.sqrt(textStat.getPolysyllablesAmount() * 30.0 / textStat.getSentences().size()) + 3.1291);
    }
}
