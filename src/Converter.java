import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Converter {
    double courseUSA;
    int tenge;
    int dollar;

    public void Converter() throws IOException {
        Document doc = Jsoup.connect("http://kurstenge.kz/").get();
        Elements element = doc.getElementsByAttributeValueContaining("style", "font-size: 150%; ")
                .select("span")
                .first()
                .getElementsByClass("today");
        String changetostr = String.valueOf(element);
        String value = changetostr.substring(46, 52);
        String valuewithpoint = value.replaceAll(",",".");
        Double courseUSA = Double.parseDouble(valuewithpoint);
        this.courseUSA = courseUSA;
    }
}

