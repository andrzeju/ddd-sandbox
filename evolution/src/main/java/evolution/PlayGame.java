package evolution;

import evolution.strategy.BehavioralStrategy;

import static evolution.Behavior.BETRAYAL;
import static evolution.Behavior.COOPERATION;

class PlayGame {

    GameResult play(BehavioralStrategy player, BehavioralStrategy anotherPlayer) {
        Behaviors played = Interaction.between(player, anotherPlayer);
        return calculatePoints(played);
    }

    private GameResult calculatePoints(Behaviors played) {
        Behavior cardOne = played.cardOne();
        Behavior cardTwo = played.cardTwo();

        if (cardOne == COOPERATION && cardTwo == COOPERATION) {
            return new GameResult(3, 3);
        } else if (cardOne == BETRAYAL && cardTwo == BETRAYAL) {
            return new GameResult(1, 1);
        } else if (cardOne == COOPERATION && cardTwo == BETRAYAL) {
            return new GameResult(0, 5);
        } else if (cardOne == BETRAYAL && cardTwo == COOPERATION) {
            return new GameResult(5, 0);
        }
        throw new IllegalArgumentException("Operation not supported");
    }
}
