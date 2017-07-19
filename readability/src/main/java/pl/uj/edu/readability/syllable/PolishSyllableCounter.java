package pl.uj.edu.readability.syllable;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PolishSyllableCounter implements SyllableCounter {

    private Set<Character> VOWELS = new HashSet<>(Arrays.asList('a', 'ą', 'i', 'y', 'e', 'ę', 'o', 'u'));

    @Override
    public int count(String word) {
        int syllableAmount = 0;
        for (char c : word.toCharArray()) {
            if (VOWELS.contains(Character.toLowerCase(c))) {
                syllableAmount++;
            }
        }
        return syllableAmount;
    }
}
