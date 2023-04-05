package evolution;

class GameResult {
    private int scoreOne;
    private int scoreTwo;

    public GameResult(int scoreOne, int scoreTwo) {
        this.scoreOne = scoreOne;
        this.scoreTwo = scoreTwo;
    }

    public String printResult() {
        return "Player one: " + scoreOne + ", Player two: " + scoreTwo;
    }
}
