package evolution;

import evolution.strategy.Cooperator;
import evolution.strategy.Traitor;

public class StartGame {
    public static void main(String[] args) {
        PlayGame playGame = new PlayGame();
        GameResult play = playGame.play(new Traitor(), new Cooperator());

        System.out.println(play.printResult());
    }
}
