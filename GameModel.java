public class GameModel {
    private int score;
    private static int highScore;

    public GameModel() {
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public int getHighScore() {
        return highScore;
    }

    public boolean checkGuess(int guess) {
        int randomNumber = (int) (Math.random() * 10) + 1;
        if (guess == randomNumber) {
            score++;
            return true;
        }
        return false;
    }

    public void updateHighScore() {
        if (score > highScore) {
            highScore = score;
        }
    }
}

