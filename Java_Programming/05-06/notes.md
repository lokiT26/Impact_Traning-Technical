# Java Notes: Conditional Statements and Iterations

## 1. Conditional Statements

### 1.1 `if` Statement
```java
if (condition) {
    // Code to execute if condition is true
}
```
- Executes a block of code if the condition evaluates to `true`.

### 1.2 `if-else` Statement
```java
if (condition) {
    // Code to execute if condition is true
} else {
    // Code to execute if condition is false
}
```
- Provides an alternative block of code if the condition is `false`.

### 1.3 `if-else if-else` Ladder
```java
if (condition1) {
    // Code for condition1
} else if (condition2) {
    // Code for condition2
} else {
    // Code if none of the conditions are true
}
```
- Used to test multiple conditions sequentially.

### 1.4 `switch` Statement
```java
switch (expression) {
    case value1:
        // Code for value1
        break;
    case value2:
        // Code for value2
        break;
    default:
        // Code if no case matches
}
```
- Tests a variable against a list of values (`case`) and executes the matching block.

---

## 2. Iterations (Loops)

### 2.1 `for` Loop
```java
for (initialization; condition; update) {
    // Code to execute in each iteration
}
```
- Executes a block of code a fixed number of times.

### 2.2 `while` Loop
```java
while (condition) {
    // Code to execute while condition is true
}
```
- Executes a block of code as long as the condition is `true`.

### 2.3 `do-while` Loop
```java
do {
    // Code to execute
} while (condition);
```
- Executes the block of code at least once, then repeats while the condition is `true`.

### 2.4 Enhanced `for` Loop (for-each)
```java
for (type variable : collection) {
    // Code to execute for each element
}
```
- Iterates over arrays or collections.

---

## 3. Loop Control Statements

### 3.1 `break`
- Exits the loop immediately.
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;
    }
}
```

### 3.2 `continue`
- Skips the current iteration and moves to the next.
```java
for (int i = 0; i < 10; i++) {
    if (i % 2 == 0) {
        continue;
    }
    System.out.println(i);
}
```

### 3.3 `return`
- Exits from the current method, optionally returning a value.

---

## 4. Nested Loops
- Loops inside another loop.
```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println("i: " + i + ", j: " + j);
    }
}
```

---

## 5. Common Use Cases
- **Conditional Statements**: Decision-making, validation, branching logic.
- **Loops**: Iterating over arrays, processing collections, repetitive tasks.
