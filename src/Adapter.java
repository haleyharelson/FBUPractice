import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Adapter {
    private List<NewsArticle> articles;

    public Adapter(List<Data> allData) {
        articles = new ArrayList<>();
        for(Data dataPoint : allData) {
            addItem(dataPoint.title, dataPoint.author, dataPoint.category, dataPoint.extraData);
        }
    }

    private void addItem(String title, String author, String category, Map<String, String> extraData) {
        //articles.add(new NewsArticle(title, author));
        if (category.equals("SPORTS")) {
            articles.add(new SportsArticle(title, author, extraData));
        } else if (category.equals("POLITICS")) {
            articles.add(new PoliticsArticle(title, author, extraData));
        }
    }

    public void print() {
        for (NewsArticle article : articles) {
            System.out.println(article.prettyPrint());
        }
    }
}
