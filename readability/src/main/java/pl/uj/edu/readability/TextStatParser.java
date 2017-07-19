package pl.uj.edu.readability;

import pl.uj.edu.readability.syllable.PolishSyllableCounter;
import pl.uj.edu.readability.syllable.SyllableCounter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang3.StringUtils;

public class TextStatParser {

    private Map<String, SyllableCounter> syllables = ImmutableMap.of("pl", new PolishSyllableCounter());

    public TextStat generateStat(String text) {
        List<String> sentences = Arrays.asList(text.split("."));
        int sentencesAmount = StringUtils.countMatches(text, '.');
        SyllableCounter syllableCounter = syllables.get("pl");
        List<String> words = parseWords(text);
        List<Integer> wordsBySyllables = words.stream().map(syllableCounter::count).collect(Collectors.toList());
        int wordsAmount = words.size();
        int complexWordsAmount = (int) wordsBySyllables.stream().filter(amount -> amount > 3).count();
        int syllabesAmount = wordsBySyllables.stream().mapToInt(value -> value).sum();
        int charactersAmount = words.stream().mapToInt(w -> w.length()).sum();
        return new TextStat(text, sentences, complexWordsAmount, wordsAmount, syllabesAmount, charactersAmount);
    }

    private List<String> parseWords(String text) {
        char[] chars = text.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char aChar : chars) {
            if (Character.isLetter(aChar) || Character.isSpaceChar(aChar)) {
                sb.append(aChar);
            }
        }

        return Arrays.asList(sb.toString().split(" "));
    }
}
