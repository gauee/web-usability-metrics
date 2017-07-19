package pl.uj.edu.readability.formulas;

import pl.uj.edu.readability.TextStat;

import org.junit.Test;

import static java.util.Collections.nCopies;
import static org.assertj.core.api.Assertions.assertThat;

public class GunningFogIndexTest {

    @Test
    public void returnsFormulaValue() {
        assertThat(new GunningFogIndex().calculate(new TextStat("", nCopies(30, "It is dummy sentence."), 30, 120, 150, 30 * 15)))
                .isEqualTo(51.6);
    }
}