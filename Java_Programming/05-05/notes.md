# Java Basics Notes

## 1. History of Java
- **Created By**: James Gosling at Sun Microsystems in 1995.
- **Purpose**: Designed for interactive television but evolved into a general-purpose programming language.
- **Features**:
    - Platform-independent (Write Once, Run Anywhere - WORA).
    - Object-Oriented, Secure, and Robust.

---

## 2. Java Basic Code Structure
```java
// Example of a basic Java program
public class Main {
        public static void main(String[] args) {
                System.out.println("Hello, World!"); // Prints output
        }
}
```
### Explanation:
- `public class Main`: Defines the class.
- `public static void main(String[] args)`: Entry point of the program.
- `System.out.println`: Prints output to the console.

---

## 3. Java Data Types
### Primitive Data Types:
| Data Type  | Size (in bits) | Default Value | Example Values       |
|------------|----------------|---------------|----------------------|
| `byte`     | 8              | 0             | -128 to 127          |
| `short`    | 16             | 0             | -32,768 to 32,767    |
| `int`      | 32             | 0             | -2^31 to 2^31-1      |
| `long`     | 64             | 0L            | -2^63 to 2^63-1      |
| `float`    | 32             | 0.0f          | 3.4e−038 to 3.4e+038 |
| `double`   | 64             | 0.0d          | 1.7e−308 to 1.7e+308 |
| `char`     | 16             | '\u0000'      | 'a', '1', '$'        |
| `boolean`  | 1              | false         | true, false          |

### Non-Primitive Data Types:
- **String**: Represents a sequence of characters. Example: `"Hello, World!"`
- **Array**: A collection of elements of the same type. Example: `int[] numbers = {1, 2, 3};`
- **Class**: A blueprint for creating objects. Example: `class Person { String name; int age; }`
- **Interface**: A reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
- **Enum**: A special data type that enables a variable to be a set of predefined constants. Example: `enum Day { MONDAY, TUESDAY, WEDNESDAY }`
- **Objects**: Instances of classes that encapsulate data and methods. Example: `Person person = new Person();`

---

## 4. Java Operators
### Arithmetic Operators:
- `+`, `-`, `*`, `/`, `%`

### Relational Operators:
- `==`, `!=`, `>`, `<`, `>=`, `<=`

### Logical Operators:
- `&&` (AND), `||` (OR), `!` (NOT)

### Bitwise Operators:
- `&` (AND), `|` (OR), `^` (XOR), `~` (NOT), `<<` (Left Shift), `>>` (Right Shift)

---

## 5. Taking Input in Java
```java
import java.util.Scanner;

public class InputExample {
        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                // Taking integer input
                System.out.print("Enter an integer: ");
                int num = scanner.nextInt();

                // Taking float input
                System.out.print("Enter a float: ");
                float decimal = scanner.nextFloat();

                // Taking string input
                System.out.print("Enter a string: ");
                scanner.nextLine(); // Consume newline
                String text = scanner.nextLine();

                System.out.println("Integer: " + num);
                System.out.println("Float: " + decimal);
                System.out.println("String: " + text);
        }
}
```

---

## 6. Printing Output in Java
```java
public class OutputExample {
        public static void main(String[] args) {
                int a = 10;
                float b = 5.5f;
                String name = "Java";

                // Printing using System.out.println
                System.out.println("Integer: " + a);
                System.out.println("Float: " + b);
                System.out.println("Name: " + name);

                // Printing using System.out.printf
                System.out.printf("Formatted Output: Integer=%d, Float=%.2f, Name=%s%n", a, b, name);
        }
}
```

---

### Additional Notes:
- Use `Scanner` for user input.
- Use `System.out.println` or `System.out.printf` for output.

