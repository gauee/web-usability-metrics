package pl.uj.edu.readability.formulas;

import pl.uj.edu.readability.TextStat;
import lombok.ToString;

/**
 * https://en.wikipedia.org/wiki/Coleman%E2%80%93Liau_index
 */
@ToString
public class ColemanLiauIndex implements ReadabilityFormula {
    @Override
    public double calculate(TextStat textStat) {
        return round(
                5.88 * textStat.getCharactersAmount() / textStat.getWordsAmount() - 29.6 * textStat.getSentences().size() / textStat.getWordsAmount() - 15.8
        );
    }
}
