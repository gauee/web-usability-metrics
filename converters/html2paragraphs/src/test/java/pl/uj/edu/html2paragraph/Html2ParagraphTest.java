package pl.uj.edu.html2paragraph;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class Html2ParagraphTest {

    @Test
    public void containsAllParagraphs() throws IOException {
        Document document = Jsoup.parse(new File("C:\\dev\\web-usability-metrics\\converters\\html2paragraphs\\src\\test\\resources\\site-with-multiple-paragraphs.html"), "UTF-8");

        assertThat(new Html2Paragraph().convert(document))
                .hasSize(15);
    }

}