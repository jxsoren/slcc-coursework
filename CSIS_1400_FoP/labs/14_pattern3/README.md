# Lab Pattern3

Create an algorithm by following the steps and filling out the blanks below.
When you are done write the corresponding code to implement the pattern.

## Pattern3:
```
o o o o o
o o o o .
o o o . .
o o . . .
o . . . .
```

## Pseudo-code:
```
for each of the rows do the following:
   draw the right amount (n1) of _____
   draw the right amount (n2) of _____
   print a new line
```

## We still need to figure out:
* The values for n1 and n2
* how to draw n characters in a row

| Pattern3 | n1 (number of circles) | n2 (number of dots) |
|----------|------------------------|---------------------|
| o o o o o | 5                      | 0                   |
| o o o o . | 4                      | 1                   |
| o o o . . | 3                      | 2                   |
| o o . . . | 2                      | 3                   |
| o . . . . | 1                      | 4                   |

Count up or down? Compare number lines in columns

## Outer loop:
```
for (int i = _______; ________; _______)
{
    // TODO: draw the current rows
}
```

| Pattern3 | i (control variable) | n1 (number of circles) | n2 (number of dots) |
|----------|----------------------|------------------------|---------------------|
| o o o o o | 1                    | 5                      | 0                   |
| o o o o . | 2                    | 4                      | 1                   |
| o o o . . | 3                    | 3                      | 2                   |
| o o . . . | 4                    | 2                      | 3                   |
| o . . . . | 5                    | 1                      | 4                   |

* n1 is the same as __________
* n2 is the same as ____________

## Pseudo-code refinement:
```
for each of the rows do the following:
   draw _______________________
   draw _______________________
   print a new line
```