package pl.uj.edu.readability.formulas;

import pl.uj.edu.readability.TextStat;

import java.util.Collections;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SmogTest {
    private Smog smog = new Smog();

    @Test
    public void returnsMinusOne() {
        assertThat(smog.calculate(new TextStat("", Collections.nCopies(29, "It is dummy sentence."), 1, 1, 1, 1)))
                .isEqualTo(-1.0);
    }

    @Test
    public void returnsFormulaValue() {
        assertThat(smog.calculate(new TextStat("", Collections.nCopies(30, "It is dummy sentence."), 10, 1, 1, 1)))
                .isEqualTo(6.4274);
    }
}