import java.util.*;

public class Hangman {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] words = {
            "apple",
            "computer",
            "java",
            "school",
            "football"
        };

        Random random = new Random();

        String word = words[random.nextInt(words.length)];

        ArrayList<Character> guessed = new ArrayList<>();

        int wrongGuesses = 0;
        int maxWrong = 6;

        System.out.println("===== HANGMAN GAME =====");

        while (wrongGuesses < maxWrong) {

            // Display word
            System.out.print("\nWord: ");

            for (int i = 0; i < word.length(); i++) {

                char letter = word.charAt(i);

                if (guessed.contains(letter)) {
                    System.out.print(letter + " ");
                } else {
                    System.out.print("_ ");
                }
            }

            System.out.println();
            System.out.println("Wrong guesses: "
                    + wrongGuesses + "/" + maxWrong);

            // Check win
            boolean won = true;

            for (int i = 0; i < word.length(); i++) {

                if (!guessed.contains(word.charAt(i))) {
                    won = false;
                    break;
                }
            }

            if (won) {
                System.out.println("\n🎉 YOU WON!");
                System.out.println("The word was: " + word);
                break;
            }

            // Take guess
            System.out.print("Enter a letter: ");
            char guess = sc.next().toLowerCase().charAt(0);

            // Already guessed
            if (guessed.contains(guess)) {
                System.out.println("You already guessed this letter!");
                continue;
            }

            guessed.add(guess);

            // Check letter
            if (word.indexOf(guess) != -1) {
                System.out.println("✅ Correct!");
            } else {
                System.out.println("❌ Wrong!");
                wrongGuesses++;
            }
        }

        if (wrongGuesses == maxWrong) {
            System.out.println("\n GAME OVER!");
            System.out.println("The word was: " + word);
        }

        sc.close();
    }
}
