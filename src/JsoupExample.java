import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupExample {
    public static void main(String[] args) {
        String url = "https://open.neis.go.kr/hub/mealServiceDietInfo?ATPT_OFCDC_SC_CODE=F10&SD_SCHUL_CODE=7380031&MLSV_YMD=20240708&Type=xml";

        String[] ret = {null, null, null};

        try {
            Document doc = Jsoup.connect(url).get();
            Elements resultElements = doc.select("RESULT > CODE");

            if (!resultElements.isEmpty() && !resultElements.text().equals("INFO-000")) {
                System.out.println("[null, null, null]");
                return;
            }

            Elements headElements = doc.select("head > RESULT > CODE");

            if (!headElements.isEmpty() && !headElements.text().equals("INFO-000")) {
                System.out.println("[null, null, null]");
                return;
            }

            Elements elements = doc.select("row");

            for (Element element : elements) {
                String mealType = element.select("MMEAL_SC_NM").text();
                String dishName = element.select("DDISH_NM").text();

                switch (mealType) {
                    case "조식":
                        ret[0] = dishName;
                        break;
                    case "중식":
                        ret[1] = dishName;
                        break;
                    case "석식":
                        ret[2] = dishName;
                        break;
                }
            }

            System.out.println("조식: " + (ret[0] != null ? ret[0] : "정보 없음"));
            System.out.println("중식: " + (ret[1] != null ? ret[1] : "정보 없음"));
            System.out.println("석식: " + (ret[2] != null ? ret[2] : "정보 없음"));

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("[null, null, null]");
        }
    }
}
