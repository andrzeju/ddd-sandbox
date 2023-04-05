package evolution.strategy;

import evolution.Behavior;

public interface BehavioralStrategy {

    Behavior showBehavior();

    void seenBehaviorWas(Behavior cardTwo);

    String name();
}
