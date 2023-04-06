package evolution;

import evolution.strategy.Cooperator;
import evolution.strategy.Randomer;
import evolution.strategy.Traitor;

import java.util.List;
import java.util.Map;

public class StartGame {

    public static void main(String[] args) {
        Tournament tournament = new Tournament();
        Map<String, Integer> tournamentScore = tournament.play(List.of(new Traitor(), new Cooperator(), new Randomer()));

        System.out.println(tournamentScore);
    }
}
