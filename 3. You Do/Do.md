# You Do

This assignment will use a new skill: nesting `if` statements. To be very selective about what we do, we can put an `if` statement inside of another `if` statement, so the internal piece will only be run if it passes two conditional checks!

As a sample, it might look something like this:

```java
if (boolean expression1) {
    System.out.println("This runs when 1 is true and regardless of 2");
    if (boolean expression2)
    {
        System.out.println("This only runs when both 1 and 2 are true");
    }
    System.out.println("This runs when 1 is true and regardless of 2");
}
```

Make three variables, `a`, `b`, and `c` and assign them each random integers between 10 and 20.

Print out the value of each as a sentence like `"a is ##, b is ##, c is ##"`.

Use conditionals to print out the following sentences at appropriate times:
- `"a is greater than b which is greater than c"` (this would happen when a is greater than b and b is greater than c)
- `"a is less than b which is less than c"`
- `"a is equal to b which is equal to c"`

Obviously which one (if any) are printed is random, can you run it enough to see at least one of the options printed?

Once you have gotten to just warnings, save the Java file and commit and push your changes via GitHub Desktop.