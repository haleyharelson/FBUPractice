public class NewsArticle implements PrettyPrintable {
    public String title;
    public String author;

    public NewsArticle(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String prettyPrint() {
        return String.format("Title: %s\nAuthor: %s\n", this.title, this.author);
    }
}
