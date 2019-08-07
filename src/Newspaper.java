import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Newspaper {

    public static void main (String[] args) {
        List<Data> allData = new ArrayList<>();

        Map<String, String> map1 = new HashMap<>();
        map1.put("role", "president");

        allData.add(
                new Data("Trump withdraws pick for US intelligence director", "CNN", "POLITICS", map1)
        );

        Map<String, String> map2 = new HashMap<>();
        map2.put("team", "Huskies");
        map2.put("level", "College");
        map2.put("sport", "Football");

        allData.add(
                new Data("Washington Football Countdown", "DawgPound", "SPORTS", map2)
        );

        Map<String, String> map3 = new HashMap<>();
        map3.put("role", "presidential candidate");

        allData.add(
                new Data("Democratic Debate Winners and Losers", "NBC", "POLITICS", map3)
        );

        Map<String, String> map4 = new HashMap<>();
        map4.put("team", "Packers");
        map4.put("level", "Professional");
        map4.put("sport", "Football");

        allData.add(
                new Data("Green Bay Packers Training Camp Starts", "NFL", "SPORTS", map4)
        );

        Adapter adapter = new Adapter(allData);

        adapter.print();
    }
}
