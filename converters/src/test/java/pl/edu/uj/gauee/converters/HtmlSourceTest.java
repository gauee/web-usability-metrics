package pl.edu.uj.gauee.converters;


import static java.nio.charset.StandardCharsets.UTF_8;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Created by gauee on 5/7/17.
 */
class HtmlSourceTest {

  private ByteArrayInputStream htmlStream;

  @BeforeEach
  void setUp() {
    htmlStream = new ByteArrayInputStream(
        "<html><body><p>Test Paragraph</p></body></html>".getBytes(UTF_8));
  }

  @Test
  public void returnsHtmlWithLoadedFileFromDisk() {
    HtmlSource htmlSource = new HtmlSource(htmlStream);

    assertThat(htmlSource.getHtml())
        .isNotNull()
        .extracting(html -> html.getDocument().body().html())
        .containsOnly("<p>Test Paragraph</p>");
  }

  @Test
  public void returnsHtmlWhenFileCannotBeLoaded() throws IOException {
    BufferedInputStream bufferedInputStream = new BufferedInputStream(htmlStream);
    HtmlSource htmlSource = new HtmlSource(bufferedInputStream);
    bufferedInputStream.close();

    assertThat(htmlSource.getHtml())
        .isEqualTo(Html.EMPTY);
  }

}