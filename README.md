# HANGMAN---The-Game
## Game Rules

1. The game randomly selects a secret word from a predefined list of words.

2. The secret word is hidden from the player and displayed using underscores (`_`), with each underscore representing one letter.

3. The player must guess **one letter at a time**.

4. If the guessed letter is present in the secret word, all occurrences of that letter are revealed.

5. If the guessed letter is not present in the secret word, the player receives one wrong-guess penalty.

6. A letter that has already been guessed cannot be counted as a new guess.

7. The player has a maximum of **6 incorrect guesses**.

8. The player **wins** when all letters in the secret word have been correctly revealed.

9. The player **loses** when the maximum number of incorrect guesses is reached before the word is completed.

10. At the end of the game, the result is displayed:

*  **You Win** — if the word is successfully guessed.
*  **Game Over** — if the maximum incorrect guesses are reached.

11. The game is played through the **Command Prompt / Terminal**, with the player entering guesses using the keyboard.
