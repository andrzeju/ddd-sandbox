package evolution.strategy;

import evolution.Behavior;

import java.util.Random;

public class Randomer implements BehavioralStrategy {

    private final Behavior [] possibleBehaviors = new Behavior[] {Behavior.BETRAYAL, Behavior.COOPERATION};

    @Override
    public Behavior showBehavior() {
        return possibleBehaviors[new Random().nextInt(2)];
    }

    @Override
    public void seenBehaviorWas(Behavior cardTwo) {

    }

    @Override
    public String name() {
        return "Randomer";
    }
}
