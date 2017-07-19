package pl.uj.edu.html2paragraph;

import java.util.LinkedList;
import java.util.List;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Html2Paragraph {

    public List<String> convert(Document document) {
        Elements paragraphElements = document.select("p");
        List<String> paragraphs = new LinkedList<String>();
        for (Element paragraph : paragraphElements) {
            paragraphs.add(paragraph.text());
        }
        return paragraphs;
    }
}
