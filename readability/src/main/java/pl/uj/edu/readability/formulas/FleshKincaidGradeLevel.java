package pl.uj.edu.readability.formulas;

import pl.uj.edu.readability.TextStat;
import lombok.ToString;

/**
 * https://en.wikipedia.org/wiki/Flesch–Kincaid_readability_tests#Flesch.E2.80.93Kincaid_grade_level
 */
@ToString
public class FleshKincaidGradeLevel implements ReadabilityFormula {
    @Override
    public double calculate(TextStat textStat) {
        return round(
                0.39 * textStat.getWordsAmount() / textStat.getSentences().size() + 11.8 * textStat.getSyllabesAmount() / textStat.getWordsAmount() - 15.59
        );
    }
}
