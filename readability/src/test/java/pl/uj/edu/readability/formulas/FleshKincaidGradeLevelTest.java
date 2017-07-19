package pl.uj.edu.readability.formulas;

import pl.uj.edu.readability.TextStat;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static java.util.Collections.nCopies;
import static org.assertj.core.api.Assertions.assertThat;

public class FleshKincaidGradeLevelTest {
    @Test
    public void returnsFormulaValue() {
        assertThat(new FleshKincaidGradeLevel().calculate(new TextStat("", nCopies(30, "It is dummy sentence."), 30, 120, 150, 30 * 15)))
                .isEqualTo(0.72);
    }
}