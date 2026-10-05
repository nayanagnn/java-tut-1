# Detective Investigation System

Java tutorial 1 - team coding activity.
The Missing Exam Paper: a small console program where a detective looks at suspects, collects clues and tries to find who took the question paper.

## Files and who did what

| File | Part | Done by |
|------|------|---------|
| Suspect.java | Suspect class, array of 5 suspects, display methods | Student 1 |
| ClueManager.java | Clue array, tracking collected clues | Student 2 |
| Investigation.java | Search suspect by ID, accusation logic (3 attempts) | Student 3 |
| DetectiveGame.java | main(), menu, switch, linking everything | Student 4 |

## How to run

```
javac *.java
java DetectiveGame
```

The program uses Scanner, so you type the menu option, then the suspect ID or clue number when it asks. If you type something that isn't a number it asks again.

## Concepts used

classes, objects, constructors, `this`, methods, arrays, array of objects, if-else, switch, for loop, for-each loop, do-while, break, continue, return, strings and primitive types.

## Git

Each of us worked on our own file in Codespaces and pushed it:

```
git add .
git commit -m "Add suspect management"
git push
```
