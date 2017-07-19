package pl.uj.edu.readability;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString(exclude = "text")
@EqualsAndHashCode
public class TextStat {
    private final String text;
    private final List<String> sentences;
    //https://en.wiktionary.org/wiki/polysyllable
    private final int polysyllablesAmount;
    private final int wordsAmount;
    private final int syllabesAmount;
    private final int charactersAmount;

    public TextStat(String text, List<String> sentences, int polysyllablesAmount, int wordsAmount, int syllabesAmount, int charactersAmount) {
        this.text = text;
        this.sentences = sentences;
        this.polysyllablesAmount = polysyllablesAmount;
        this.wordsAmount = wordsAmount;
        this.syllabesAmount = syllabesAmount;
        this.charactersAmount = charactersAmount;
    }
}
