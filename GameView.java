    import java.util.Scanner;
    
    public class GameView {
        private Scanner scanner;
    
        public GameView() {
            scanner = new Scanner(System.in);
        }
    
        public int getUserGuess() {
            System.out.print("Enter your guess (1-10): ");
            return scanner.nextInt();
        }
    
        public boolean playAgain() {
            System.out.print("Do you want to play again? (yes/no): ");
            String input = scanner.next();
            return input.equalsIgnoreCase("yes");
        }
    
        public void displayMessage(String message) {
            System.out.println(message);
        }
    
        public void displayFinalScore(int score, int highScore) {
            System.out.println("Game over! Your final score is: " + score);
            if (score > highScore) {
                System.out.println("Congratulations! You set a new high score: " + score);
            } else {
                System.out.println("Your high score is: " + highScore);
            }
        }
    
        public void closeScanner() {
            scanner.close();
        }
    }   

