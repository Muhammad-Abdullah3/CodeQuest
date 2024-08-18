# This is a guess the number game
import random
secretNumber = random.randint(1,50)
print("I am thinking of a number between 1 and 50")
#Asking player to guess number 5 times
guess = 0
for guessTaken in range(1,6):
    print('Take a guess:')
    guess = int(input())

    if guess<secretNumber:
        print("Your guess is too low.")
        print(f"You have {5-guessTaken} left")
    elif guess>secretNumber:
        print("Your guess is too high.")
        print(f"You have {5-guessTaken} left")
    else:
        break
if guess == secretNumber:
    print('You guessed my number in '+ str(guessTaken)+' guesses!')
else:
    print("You haven't guessed the number correct that was "+str(secretNumber))

