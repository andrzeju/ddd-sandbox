package evolution;

import evolution.strategy.BehavioralStrategy;

public class PlayGame {
    GameResult play(BehavioralStrategy player, BehavioralStrategy anotherPlayer) {
        Behavior cardOne = player.showBehavior();
        Behavior cardTwo = anotherPlayer.showBehavior();
        player.seenBehaviorWas(cardTwo);
        anotherPlayer.seenBehaviorWas(cardOne);
        return calculatePoints(cardOne, cardTwo);
    }

    private GameResult calculatePoints(Behavior cardOne, Behavior cardTwo) {
        return new GameResult();
    }
}
