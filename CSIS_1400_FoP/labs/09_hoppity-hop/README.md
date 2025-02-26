# Hoppity Hop Lab

## Learning Outcomes
- Formulate an algorithm
- Practice the use of if-else statements
- See the usefulness of conditional operators

## Introduction
Hoppity Hop is a classic counting game where players must follow specific rules when counting in sequence. This lab will help you understand conditional logic by implementing the Hoppity Hop algorithm.

## The Game
The game is played as follows:
1. Students count out loud from 1, 2, 3, ... to establish an order in the class (first student says 1, second student says 2, etc.)
2. Repeat, but this time nobody can mention a multiple of 3. Instead, they must say "Hoppity"
3. Repeat again, but now in addition to saying "Hoppity" for multiples of 3, nobody can say a multiple of 5. Instead, they must say "Hop"
4. Continue until everyone has a clear understanding of the rules

## Assignment Description
Create a program that displays the numbers from 1 to 25, each on one line. However:
- Every multiple of 3 is replaced by the word "Hoppity"
- Every multiple of 5 is replaced by the word "Hop"
- Every number that is both a multiple of 3 AND 5 is replaced by "Hoppity Hop"

## Instructions
1. Form groups of up to 4 students
2. Before starting implementation, gather around the whiteboards to think through the problem
3. Write pseudocode for your solution
4. Feel free to walk around the room to check out approaches of other teams
5. Once your team has completed its pseudocode and all members agree on a feasible solution, start implementing your algorithm

## Expected Output
```
1
2
Hoppity
4
Hop
Hoppity
7
8
Hoppity
Hop
11
Hoppity
13
14
Hoppity Hop
16
17
Hoppity
19
Hop
Hoppity
22
23
Hoppity
Hop
```

## Tips
- Think about the order of your conditions (which should be checked first?)
- Consider the use of modulo operator (%) to check for divisibility
- Remember that a number divisible by both 3 and 5 is also divisible by 15
