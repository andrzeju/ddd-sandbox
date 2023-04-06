package evolution;

import evolution.strategy.BehavioralStrategy;

import java.util.stream.IntStream;

import static evolution.Behavior.BETRAYAL;
import static evolution.Behavior.COOPERATION;

class PlayGame {

    public static final int GAMES_PLAYED = 200;

    GameResult between(BehavioralStrategy player, BehavioralStrategy anotherPlayer) {
        return IntStream.range(0, GAMES_PLAYED)
                .mapToObj(i -> calculatePoints(Interaction.between(player, anotherPlayer)))
                .reduce(GameResult.zeroZero, GameResult::add);
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
