package pl.edu.uj.gauee.converters;

import org.jsoup.nodes.Document;

/**
 * Created by gauee on 5/7/17.
 */
public class Html {

  public static final Html EMPTY = new Html(new Document("http://not-found.html"));
  private final Document document;

  public Html(Document document) {
    this.document = document;
  }

  public Document getDocument() {
    return document;
  }
}
