import java.util.Map;

public class SportsArticle extends NewsArticle {
    private static final String TEAM_KEY = "team";
    private static final String LEVEL_KEY = "level";
    private static final String SPORT_KEY = "sport";

    private String team;
    private String level;
    private String sport;

    public SportsArticle(String title, String author, Map<String, String> extraData) {
        super(title, author);
        if (extraData.containsKey(SportsArticle.TEAM_KEY)) {
            this.team = extraData.get(SportsArticle.TEAM_KEY);
        }

        if (extraData.containsKey(SportsArticle.LEVEL_KEY)) {
            this.level = extraData.get(SportsArticle.LEVEL_KEY);
        }

        if (extraData.containsKey(SportsArticle.SPORT_KEY)) {
            this.sport = extraData.get(SportsArticle.SPORT_KEY);
        }
    }

    @Override
    public String prettyPrint() {
        return String.format("%sSport: %s\nLevel: %s\nTeam: %s\n", super.prettyPrint(), this.team, this.level, this.sport);
    }
}
