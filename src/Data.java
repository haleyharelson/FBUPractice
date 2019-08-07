import java.util.Map;

public class Data {
    public String title;
    public String author;
    public String category;
    public Map<String, String> extraData;

    public Data(String title, String author, String category, Map<String, String> extraData) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.extraData = extraData;
    }
}
