package evolution;

import evolution.strategy.BehavioralStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tournament {
    Map<String, Integer> play(List<BehavioralStrategy> players) {
        Map<String, Integer> score = new HashMap<>();

        players.forEach(p -> players.forEach(p2 -> {
            GameResult result = new PlayGame().between(p, p2);
            score.merge(p.name(), result.getScoreOne(), Integer::sum);
            score.merge(p2.name(), result.getScoreTwo(), Integer::sum);
        }));

        return score;
    }
}
