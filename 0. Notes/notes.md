# `else if` Statements

We often refer to an `if` statement as a one-way selector, as it has only one direction to go: when the **boolean expression** is `true`. In the Unit 3 Section 3, we introduced `if-else` statements, which function as two-way selectors, as it has two directions to go: when the **boolean expression** is `true`, or when it is `false`. In real life, decision-making is much more complex than just two options, and so we would wonder if we can combine some tools we have to overcome the limitation of booleans only having two values.

---

## `if-else if` Statements

Unlike `if` and `if-else` statements, an **`else if` statement** doesn't exist on it's own, it is instead incorporated into one of the other two tools in order to make them more powerful. The most typical application of this new tool would be creating an `if-else if` statement. This is something that might make sense to first work through a real-life decision in English and then translate it into a program. Here is our situation:

```
I am going to apply for a loan to buy a house. One of the things the bank takes into consideration is my age.
The bank has a process they follow to decide what interest rate I can get:
1. If I am older than 30, I can get a 3% interest rate on my loan.
2. If I am not older than 30, but I am older than 20, I can get a 4% interest rate on my loan. (Higher interest rate is worse).

So I tell the bank that I am 25.
They go through their process:
1. Am I older than 30? I am not. Continue on.
2. Am I older than 20? I am. I can have the 4% interest rate.

On the other hand, my friend Sam is 33 and goes to the bank for a loan as well.
They go through their process:
1. Is Sam older than 30? Yes he is. He can have the 3% interest rate.
The bank doesn't bother checking if Sam is older than 20 because they have already found his interest rate.
```

This scenario is an example of `if-else if` statement in action. The first ask a question, "are you older than 30". If you are, you get the 3% interest rate, but if you aren't, instead of just making a blanket statement that you can have the 4% interest rate, they ask a follow-up question, "are you older than 20". If you are, then you get the 4% interest rate and we are done, but if you aren't their process just ends, since I guess they wouldn't give a loan for a house to a person under 20.

Essentially, we've done two `if` statements, `if age is over 30` and `if age is over 20`, but the second `if` statement will only happen when needed, which is why it is an `if-else if` statement, as opposed to just an `if-if` statement. Let's turn this scenario into a Java program, which can be seen in this example from the `NotesIfElseIf1.java` file:

```java
int age = 25; // Mr. G's age
if (age > 30) {
    System.out.println("You can have the 4% interest rate.");
} else if (age > 20) {
    System.out.println("You can have the 3% interest rate.");
}
```

When run, we expect this to assign us the 4% interest rate, let's see if it works:

```
You can have the 4% interest rate.
```

It does! Here is an example from the `NotesIfElseIf2.java` file where the only change is that we put in Sam's age of 33:

```java
int age = 33; // Mr. G's friend Sam's age
if (age > 30) {
    System.out.println("You can have the 4% interest rate.");
} else if (age > 20) {
    System.out.println("You can have the 3% interest rate.");
}
```

When run, we expect this to assign Sam the 3% interest rate, let's see if it works:

```
You can have the 3% interest rate.
```

Even though we are using the keyword `else`, which in Unit 3 Section 3 meant that we will always have something to do, it is possible here to not do either of the options presented. Let's say one of you all tried to get a loan from this bank as a high school student, here is the slightly modified example from the `NotesIfElseIf3.java` file to show what might happen:

```java
int age = 16; // Sample student age
if (age > 30) {
    System.out.println("You can have the 4% interest rate.");
} else if (age > 20) {
    System.out.println("You can have the 3% interest rate.");
}
```

We know that in the real-life example, this would have just not given you an interest, but the program we put together works a little bit differently. We'd expect here for the program to just not offer us an interest rate:

```

```

The output is just blank, nothing is printed! This makes sense based on the code, but doesn't make any sense in real life, as the bank would at least let us know they can't offer us an iterest rate! There must be a piece we are missing that could enable us to handle a final "other" option.

---

## `if-else if-else` Statements

Continuing with the above example, it would be reasonable for the bank to add a third step to their process, as follows:

```
1. If I am older than 30, I can get a 3% interest rate on my loan.
2. If I am not older than 30, but I am older than 20, I can get a 4% interest rate on my loan. (Higher interest rate is worse).
3. If I am not older than 20, then I cannot get a loan.
```

Fortunately in code, this is just as simple as adding another piece to our existing `if-else if` statement, an `else` statement, and we can continue on. Here is an example from the `NotesIfElseIfElse1.java` file:

```java
int age = 16; // Sample student age
if (age > 30) {
    System.out.println("You can have the 4% interest rate.");
} else if (age > 20) {
    System.out.println("You can have the 3% interest rate.");
} else {
    System.out.println("You cannot have a loan.");
}
```

Adding this `else` statement shouldn't effect our working examples, because `else` would only happen when everything else fails, which was only in the case of the student example. Now, we expect to hear from the bank to let us know what the status of our loan is if they don't offer us an interest rate:

```
You cannot have a loan.
```

Excellent! Well, not excellent that you can't get a loan, but excellent that it works! Regardless of how many pieces there are to your `if` statement, you can always end it with a singular `else` to offer a final alternative. "Regardless of how many pieces", does this mean we can have more options?

---

## `if-else if-...-else if-else` Statements

That's right, we can have as many options as we want, all we need to do is add more `else if` statements to our chain! Let's liven up our real-life scenario by making it more realistic, with more interest rate breakpoints:

```
1. If I am older than 60, I can get a 1% interest rate on my loan.
2. If I am not older than 60, but I am older than 50, I can get a 1.5% interest rate on my loan. (Higher interest rate is worse).
3. If I am not older than 50, but I am older than 40, I can get a 2% interest rate on my loan. (Higher interest rate is worse).
4. If I am not older than 40, but I am older than 30, I can get a 2.5% interest rate on my loan. (Higher interest rate is worse).
5. If I am not older than 30, but I am older than 20, I can get a 3% interest rate on my loan. 
6. If I am not older than 20, then I cannot get a loan.
```

The bank's process is 6 steps now! Let's turn this into code to make it easier for the people that work there. Here is an example from the `NotesIfElseIfElseIfElse1.java` file:

```java
int age = 53; // Mr. G's father's age
double interestRate = -1.0;
if (age > 60) {
    interestRate = 1.0;
} else if (age > 50) {
    interestRate = 1.5;
} else if (age > 40) {
    interestRate = 2.0;
} else if (age > 30) {
    interestRate = 2.5;
} else if (age > 20) {
    interestRate = 3.0;
} else {
    System.out.println("You cannot have a loan.");
}

if (interestRate > 0) {
    System.out.println("You can have the " + interestRate + "% interest rate.");
}
```

This code was rewritten more than the previous examples to make it easier to read and work with. Now there is an `interestRate` variable that changes throughout the `if` statement and then is printed with later. At the end, we need to check that `interestRate` has been changed before we tell them what their interest rate is.

We plugged my dad's age into here to see if it works right. We expect this should give him an interest rate of `1.5%` if we set this up right:

```
You can have the 1.5% interest rate.
```

---

## Assignment

Now that you have gone through the notes for this section, you can check out the `Try.md` and `Try.java` files to try a short assignment using this material.
