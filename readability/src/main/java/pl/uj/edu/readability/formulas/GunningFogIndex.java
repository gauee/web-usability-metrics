package pl.uj.edu.readability.formulas;

import pl.uj.edu.readability.TextStat;
import lombok.ToString;

/**
 * http://en.wikipedia.org/wiki/Gunning-Fog_Index
 */
@ToString
public class GunningFogIndex implements ReadabilityFormula {
    @Override
    public double calculate(TextStat textStat) {
        return round(
                0.4 * (textStat.getWordsAmount() / textStat.getSentences().size() + 100 * textStat.getSyllabesAmount() / textStat.getWordsAmount())
        );
    }
}
