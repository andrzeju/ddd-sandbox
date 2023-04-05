package evolution.strategy;

import evolution.Behavior;

public class Traitor implements BehavioralStrategy {
    public Behavior showBehavior() {
        return Behavior.BETRAYAL;
    }

    public void seenBehaviorWas(Behavior cardTwo) {

    }
}
