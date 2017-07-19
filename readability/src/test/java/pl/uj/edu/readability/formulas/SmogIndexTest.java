package pl.uj.edu.readability.formulas;

import pl.uj.edu.readability.TextStat;

import java.util.Collections;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class SmogIndexTest {
    private SmogIndex smog = new SmogIndex();

    @Test
    public void returnsMinusOne() {
        Assertions.assertThat(smog.calculate(new TextStat("", Collections.nCopies(29, "It is dummy sentence."), 1, 1, 1, 1)))
                .isEqualTo(-1.0);
    }

    @Test
    public void returnsFormulaValue() {
        Assertions.assertThat(smog.calculate(new TextStat("", Collections.nCopies(30, "It is dummy sentence."), 10, 1, 1, 1)))
                .isEqualTo(6.1623);
    }
}