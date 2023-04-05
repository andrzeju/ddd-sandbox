package evolution.strategy;

import evolution.Behavior;

public class Cooperator implements BehavioralStrategy {
    public Behavior showBehavior() {
        return Behavior.COOPERATION;
    }

    public void seenBehaviorWas(Behavior cardTwo) {

    }
}
