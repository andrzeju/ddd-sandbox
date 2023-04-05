package evolution;

import evolution.strategy.Cooperator;
import evolution.strategy.Traitor;

public class StartGame {

    public static void main(String[] args) {
        PlayGame playGame = new PlayGame();
        Traitor one = new Traitor();
        Cooperator two = new Cooperator();
        GameResult play = playGame.play(one, two);

        System.out.println(play.printResult(one.name(), two.name()));
    }
}
