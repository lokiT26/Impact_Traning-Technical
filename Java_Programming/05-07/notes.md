# Digit Manipulation in Java

Digit manipulation involves performing operations on the digits of a number. Java provides various techniques to extract, modify, and analyze digits of an integer.

---

## Table of Contents
- [Digit Manipulation in Java](#digit-manipulation-in-java)
  - [Table of Contents](#table-of-contents)
  - [1. Extracting Digits](#1-extracting-digits)
  - [2. Reversing Digits](#2-reversing-digits)
  - [3. Sum of Digits](#3-sum-of-digits)
  - [4. Product of Digits](#4-product-of-digits)
  - [5. Checking Palindrome Numbers](#5-checking-palindrome-numbers)
  - [6. Digit Count](#6-digit-count)
    - [Using Loop:](#using-loop)
    - [Using Logarithm:](#using-logarithm)
  - [7. Examples](#7-examples)
    - [Example 1: Reverse and Sum Digits](#example-1-reverse-and-sum-digits)
    - [Example 2: Check Palindrome](#example-2-check-palindrome)
  - [Conclusion](#conclusion)

---

## 1. Extracting Digits
Digits of a number can be extracted using mathematical operations:
- Use `% 10` to get the last digit.
- Use `/ 10` to remove the last digit.

```java
int number = 12345;
while (number > 0) {
    int digit = number % 10; // Extract last digit
    System.out.println(digit);
    number = number / 10;    // Remove last digit
}
```

---

## 2. Reversing Digits
Reversing a number involves extracting digits and reconstructing the number in reverse order.

```java
int number = 12345;
int reversed = 0;
while (number > 0) {
    int digit = number % 10;
    reversed = reversed * 10 + digit;
    number = number / 10;
}
System.out.println("Reversed Number: " + reversed);
```

---

## 3. Sum of Digits
The sum of digits can be calculated by repeatedly extracting and adding digits.

```java
int number = 12345;
int sum = 0;
while (number > 0) {
    sum += number % 10;
    number = number / 10;
}
System.out.println("Sum of Digits: " + sum);
```

---

## 4. Product of Digits
The product of digits is calculated similarly to the sum, but using multiplication.

```java
int number = 12345;
int product = 1;
while (number > 0) {
    product *= number % 10;
    number = number / 10;
}
System.out.println("Product of Digits: " + product);
```

---

## 5. Checking Palindrome Numbers
A number is a palindrome if it reads the same backward as forward.

```java
int number = 121;
int original = number;
int reversed = 0;
while (number > 0) {
    int digit = number % 10;
    reversed = reversed * 10 + digit;
    number = number / 10;
}
if (original == reversed) {
    System.out.println("Palindrome Number");
} else {
    System.out.println("Not a Palindrome");
}
```

---

## 6. Digit Count
The number of digits in an integer can be determined using a loop or logarithmic operations.

### Using Loop:
```java
int number = 12345;
int count = 0;
while (number > 0) {
    count++;
    number = number / 10;
}
System.out.println("Number of Digits: " + count);
```

### Using Logarithm:
```java
int number = 12345;
int count = (int) Math.log10(number) + 1;
System.out.println("Number of Digits: " + count);
```

---

## 7. Examples
### Example 1: Reverse and Sum Digits
```java
int number = 9876;
int reversed = 0, sum = 0;
while (number > 0) {
    int digit = number % 10;
    reversed = reversed * 10 + digit;
    sum += digit;
    number = number / 10;
}
System.out.println("Reversed: " + reversed);
System.out.println("Sum of Digits: " + sum);
```

### Example 2: Check Palindrome
```java
int number = 1221;
int original = number, reversed = 0;
while (number > 0) {
    int digit = number % 10;
    reversed = reversed * 10 + digit;
    number = number / 10;
}
System.out.println(original == reversed ? "Palindrome" : "Not a Palindrome");
```

---

## Conclusion
Digit manipulation is a fundamental concept in programming. Java provides efficient ways to extract, analyze, and modify digits using basic arithmetic operations. These techniques are widely used in solving algorithmic problems.
