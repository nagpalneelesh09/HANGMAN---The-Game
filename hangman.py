import random

words = ["apple", "computer", "python", "school", "football"]

word = random.choice(words)

guessed = []
wrong_guesses = 0
max_wrong = 6

print("===== HANGMAN GAME =====")

while wrong_guesses < max_wrong:

    # Display word
    display = ""

    for letter in word:
        if letter in guessed:
            display += letter + " "
        else:
            display += "_ "

    print("\nWord:", display)
    print("Wrong guesses:", wrong_guesses, "/", max_wrong)

    # Check win
    if all(letter in guessed for letter in word):
        print("\n YOU WON!")
        print("The word was:", word)
        break

    guess = input("Enter a letter: ").lower()

    # Validate input
    if len(guess) != 1 or not guess.isalpha():
        print("Please enter ONE letter.")
        continue

    if guess in guessed:
        print("You already guessed this letter!")
        continue

    guessed.append(guess)

    if guess in word:
        print("Correct!")
    else:
        print("Wrong!")
        wrong_guesses += 1

else:
    print("\n GAME OVER!")
    print("The word was:", word)
