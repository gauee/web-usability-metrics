package pl.edu.uj.gauee.converters;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jsoup.Jsoup;

/**
 * Created by gauee on 5/7/17.
 */
public class HtmlSource {

  private static final Logger LOGGER = LogManager.getLogger(HtmlSource.class);
  private final InputStream inputStream;

  public HtmlSource(InputStream inputStream) {
    this.inputStream = inputStream;
  }

  public Html getHtml() {
    try {
      return new Html(
          Jsoup.parse(inputStream, StandardCharsets.UTF_8.name(), "http://www.onet.pl"));
    } catch (IOException e) {
      LOGGER.warn("Cannot load the html");
    }
    return Html.EMPTY;
  }
}
