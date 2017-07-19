package pl.uj.edu.readability.formulas;

import pl.uj.edu.readability.TextStat;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static java.util.Collections.nCopies;

public class FleshKincaidEaseTest {
    @Test
    public void returnsFormulaValue() {
        Assertions.assertThat(new FleshKincaidEase().calculate(new TextStat("", nCopies(30, "It is dummy sentence."), 30, 120, 150, 30 * 15)))
                .isEqualTo(97.025);
    }
}