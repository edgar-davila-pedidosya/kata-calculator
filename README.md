# kata-calculator
In this exercise we need to emulate an old calculator by reading an string and evaluating the expression from left to right unless stated otherwise.

The input will always be valid, so for the sake of simplicity don’t overthink random or invalid data.

## First iteration: Sum, Sustraction, Multiplication
Focus on positive numbers and make these kind of cases work:
- “2+3” must return 5
- “2-3” must return -1
- “2*3” must return 6
- “2+1*4” must return 12

## Second iteration: Division, Mod
You must validate the division by zero, don’t let the default exception trigger
- “6/3” must return 2
- “1/3” must return 0.333 (formatting is not required)
- “2/0” must throw a custom exception
- “1%3” must return 1
- “3%1” must return 0
- All previous operations must be combinable with divisions and mod

## Third iteration: Parenthesis
We are now required to respect the rules of the parenthesis and apply those operations in order, for example:
- “(2+1)*4” must return 12
- “2+(1*4)” must return 8
- “(((2+1*4)))” must return 12
- All previous operations must be combinable 

## Bonus iteration: Negative numbers, Square roots
We are now required to read negative numbers too, and we add adding support for square roots, adding the following:
- “-2-4” must return -6
- “-1*-4” must return 4
- “2-(2*-8)” must return 18
- “sq(9)” must return 3
- “sq(-9)” must show a custom exception
- All previous operations must be combinable 
