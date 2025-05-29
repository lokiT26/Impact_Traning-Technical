# Functions in Java

## What is a Function?
A **function** (also called a *method* in Java) is a block of code that performs a specific task, can take input, and may return a value.

---

## Types of Functions in Java

### 1. Predefined Functions
- Also known as **library methods**.
- Provided by Java libraries (e.g., `System.out.println()`, `Math.sqrt()`).
- Syntax:  
    ```java
    Math.max(10, 20); // returns 20
    ```

#### Examples:
- `System.out.println("Hello");`
- `Math.abs(-5);`
- `String.length();`

---

### 2. User-defined Functions
- Created by the programmer to perform specific tasks.
- Syntax:
    ```java
    returnType functionName(parameters) {
            // function body
            return value;
    }
    ```

#### Example:
```java
int add(int a, int b) {
        return a + b;
}
```

---

## Function Structure

| Part           | Description                        |
|----------------|------------------------------------|
| Return Type    | Data type of value returned        |
| Function Name  | Identifier for the function        |
| Parameters     | Input values (optional)            |
| Body           | Statements to execute              |
| Return Value   | Value returned (if not void)       |

---

## Calling a Function

```java
int result = add(5, 3); // Calls user-defined function
System.out.println(result); // Calls predefined function
```

---
## Function Overloading

- Java allows multiple functions with the same name but different parameter lists (number, type, or order).
- This is called **function overloading**.

#### Example:
```java
int add(int a, int b) {
    return a + b;
}

double add(double a, double b) {
    return a + b;
}
```
- The correct function is chosen based on the arguments passed.

---

## Function Parameters

- **Actual parameters**: Values passed to the function when calling it.
- **Formal parameters**: Variables defined in the function declaration.

#### Example:
```java
void greet(String name) { // 'name' is a formal parameter
    System.out.println("Hello, " + name);
}

greet("Alice"); // "Alice" is the actual parameter
```

---

## Return Statement

- The `return` statement ends function execution and optionally returns a value.
- Functions with a non-`void` return type must use `return`.

#### Example:
```java
int square(int x) {
    return x * x;
}
```

---

## Void Functions

- Functions declared with `void` do not return any value.

#### Example:
```java
void printHello() {
    System.out.println("Hello!");
}
```
## Key Points
- Functions improve code reusability and readability.
- Java distinguishes between predefined (library) and user-defined functions.
- Functions can return values or be `void` (no return).

---