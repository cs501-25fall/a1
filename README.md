[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/8Q5uxeW5)
# Week 1 Assignment

This assignment has **3 practices** in one repo. Complete all of them.
Push your work to GitHub; the autograder will run automatically.

---

## Practice 1: Two Lines of Text
Write `HelloVariations.java` that prints **exactly 2 separate lines**.
- The lines may contain any text.
- Each line must be **non-empty**.
- Use at least one `print` and at least one `println` somewhere in your program.

---

## Practice 2: Simple Calculator
Write `Calculator.java` that:
- Asks the user for **two integers** (use `Scanner`).
- Prints the results of **addition**, **subtraction**, **multiplication**, and **integer division**.
- The output should include the operator and the result. The exact labels/spacing can vary (e.g., `12 + 32 = 44` or `12+32=44`).

---

## Practice 3: Student Introduction
Write `StudentIntro.java` that:
- Prompts the user (print prompts) for their **name** (String), **age** (int), and **favorite programming language** (String).
- Then prints:
  ```
  Hello, my name is <name>.
  I am <age> years old.
  My favorite programming language is <lang>.
  ```

### How to Test
- Run `mvn test` locally (if you have Maven installed) otherwise push your code to GitHub.
- Do **not** edit files in `src/test/java`.
- Push to GitHub to trigger the autograder.
