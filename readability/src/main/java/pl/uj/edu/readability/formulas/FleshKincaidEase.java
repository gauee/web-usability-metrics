package pl.uj.edu.readability.formulas;

import pl.uj.edu.readability.TextStat;
import lombok.ToString;

/**
 * https://en.wikipedia.org/wiki/Flesch%E2%80%93Kincaid_readability_tests#Flesch_reading_ease
 */
@ToString
public class FleshKincaidEase implements ReadabilityFormula {
    @Override
    public double calculate(TextStat textStat) {
        return round(
                206.835 - 1.015 * textStat.getWordsAmount() / textStat.getSentences().size() - 84.6 * textStat.getSyllabesAmount() / textStat.getWordsAmount()
        );
    }
}
