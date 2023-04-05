package evolution;

import evolution.strategy.BehavioralStrategy;

public class Interaction {

    static Behaviors between(BehavioralStrategy player, BehavioralStrategy anotherPlayer) {
        Behavior cardOne = player.showBehavior();
        Behavior cardTwo = anotherPlayer.showBehavior();
        player.seenBehaviorWas(cardTwo);
        anotherPlayer.seenBehaviorWas(cardOne);
        return Behaviors.of(cardOne, cardTwo);
    }
}