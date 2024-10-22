# Mastermind 

## Instruction
Computer will compose a 4 digit number and player has to guess within 10 tries. Player guesses the number and the computer will responds with hints to let the player know how accurate the guess was.

## Objective
To guess the number within 10 tries

## Theory
a. Use random generator to generate 4 different numbers
    - need to use 4 different random generator to generate because when using one, it may generate numbers such as 1178, 2928, 3001, 4678 and etc which is not something we want

b. Prompt user for 4 digit number (1111 - 6666)
    - should be inside a "while loop"

c. Check for invalid input such as String, digits not 1 - 6 and digits length less than 4 or more than 4.

d. Use "for loop" for check
    - check the digit at each index using at char(index) match position and number
        - increment by 1 if the number and position matches

    - check whether the input digit occurs in other position
        - if it fits the requirement above, then don't need to do this
        - loop through to check if there are matching number
            - increment number if number match but not position

e. Repeat (d) until solution matches
    - allow up to 10 tries

f. Display whether user wins or loses

g. Repeat game