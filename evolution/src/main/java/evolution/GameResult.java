package evolution;

class GameResult {
    public static GameResult zeroZero = new GameResult(0, 0);
    private final int scoreOne;
    private final int scoreTwo;

    public GameResult(int scoreOne, int scoreTwo) {
        this.scoreOne = scoreOne;
        this.scoreTwo = scoreTwo;
    }

    public String printResult(String playerOne, String playerTwo) {
        return playerOne + ": " + scoreOne + ", " + playerTwo + ": " + scoreTwo;
    }

    public static GameResult add(GameResult one, GameResult two) {
        return new GameResult(one.scoreOne + two.scoreOne, one.scoreTwo + two.scoreTwo);
    }
}
