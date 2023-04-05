package evolution;

public record Behaviors(Behavior cardOne, Behavior cardTwo) {

    public static Behaviors of(Behavior cardOne, Behavior cardTwo) {
        return new Behaviors(cardOne, cardTwo);
    }
}
