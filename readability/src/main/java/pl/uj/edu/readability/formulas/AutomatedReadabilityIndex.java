package pl.uj.edu.readability.formulas;

import pl.uj.edu.readability.TextStat;

public class AutomatedReadabilityIndex implements ReadabilityFormula {
    @Override
    public double calculate(TextStat textStat) {
        return round(
                4.71 * textStat.getCharactersAmount() / textStat.getWordsAmount() + 0.5 * textStat.getWordsAmount() / textStat.getSentences().size() - 21.43
        );
    }
}
