public class GameController {
    private GameModel model;
    private GameView view;

    public GameController() {
        model = new GameModel();
        view = new GameView();
    }

    public void playGame() {
        do {
            int guess = view.getUserGuess();
            boolean isCorrect = model.checkGuess(guess);

            if (isCorrect) {
                view.displayMessage("Congratulations! You guessed it right!");
            } else {
                view.displayMessage("Sorry, wrong guess.");
            }

        } while (view.playAgain());

        model.updateHighScore();
        view.displayFinalScore(model.getScore(), model.getHighScore());
        view.closeScanner();
    }
}