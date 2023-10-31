# Understanding Check

Let's enhance the concept from the notes and make a program that will help a bank determine someone's interest rate for a mortgage.

Make two variables, `age`, and `salary`, and initialize them with sample values.

Make a variable `interestRate` and assign it the value `0.0`.

Use conditional statements to add to the interest rate according to the following:
- If age is over 60, add 0.02
- If age is over 50, add 0.025
- If age is over 40, add 0.03
- If age is over 35, add 0.035
- If age is over 30, add 0.04
- If age is over 25, add 0.045
- If age is over 20, add 0.05
- If age is 20 or under, set to -1

Use conditional statements to add to the interest rate according to the following:
- If salary is over 200,000, add 0.01
- If salary is over 150,000, add 0.015
- If salary is over 120,000, add 0.02
- If salary is over 100,000, add 0.025
- If salary is over 80,000, add 0.03
- If salary is over 65,000, add 0.035
- If salary is over 50,000, add 0.04
- If salary is over 40,000, add 0.05
- If salary is over 30,000, add 0.065
- If salary is 30,000 or under, set to -1

Use a conditional to decide whether to offer them a loan or not according to the following:
- If interest rate is below 0, no loan
- If interest rate is above 0.1, no loan
- If neither of the above, print out their interest rate as a percent (multiply the variable times 100)

The three possible outputs of the program:

```
We cannot offer you a loan.
Your interest rate would be too high, so we cannot offer you a loan.
Your interest rate is #.#%.
```

Can you find combinations of inputs that will result in each of the three possibilities above?

Once you have gotten to just warnings, save the Java file and commit and push your changes via GitHub Desktop.
