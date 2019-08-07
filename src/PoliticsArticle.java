import java.util.Map;

public class PoliticsArticle extends NewsArticle {
    private static final String ROLE_KEY = "role";

    private String role;

    public PoliticsArticle(String title, String author, Map<String, String> extraData) {
        super(title, author);
        if (extraData.containsKey(PoliticsArticle.ROLE_KEY)) {
            this.role = extraData.get(PoliticsArticle.ROLE_KEY);
        }
    }

    @Override
    public String prettyPrint() {
        return String.format("%sRole: %s\n", super.prettyPrint(), this.role);
    }
}
