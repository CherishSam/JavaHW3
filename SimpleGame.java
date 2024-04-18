package hw3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleGame {

    private int score;
    private static int highScore;

    public SimpleGame() {
        score = 0;
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Simple Game");

        Label guessLabel = new Label("Enter your guess (1-10): ");
        TextField guessTextField = new TextField();
        Button guessButton = new Button("Guess");
        Label resultLabel = new Label();
        Label playAgainLabel = new Label("Do you want to play again? (yes/no): ");
        TextField playAgainTextField = new TextField();
        Button playAgainButton = new Button("Play Again");
        Label finalScoreLabel = new Label();

        guessButton.setOnAction(e -> {
            int guess = Integer.parseInt(guessTextField.getText());
            int randomNumber = (int) (Math.random() * 10) + 1;

            if (guess == randomNumber) {
                resultLabel.setText("Congratulations! You guessed it right!");
                score++;
            } else {
                resultLabel.setText("Sorry, wrong guess. The number was: " + randomNumber);
            }
        });

        playAgainButton.setOnAction(e -> {
            String playAgainInput = playAgainTextField.getText();
            if (playAgainInput.equalsIgnoreCase("yes")) {
                guessTextField.clear();
                resultLabel.setText("");
                playAgainTextField.clear();
                playGame();
            } else {
                primaryStage.close();
            }
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(guessLabel, guessTextField, guessButton, resultLabel,
                playAgainLabel, playAgainTextField, playAgainButton, finalScoreLabel);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();

        playGame();
    }

    public void playGame() {
        score = 0;
    }
}