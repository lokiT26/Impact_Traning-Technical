# Java Basics Notes

## Features of Java
- **Platform Independent**: Write Once, Run Anywhere (WORA).
- **Object-Oriented**: Supports OOP principles like inheritance, encapsulation, polymorphism, and abstraction.
- **Robust**: Strong memory management, exception handling, and type checking.
- **Secure**: Provides a secure runtime environment with features like bytecode verification.
- **Multithreaded**: Supports concurrent execution of multiple threads.
- **High Performance**: Uses Just-In-Time (JIT) compiler for faster execution.
- **Dynamic**: Supports dynamic linking of classes and libraries.

---

## About JDK, JVM, and JRE
### 1. **JDK (Java Development Kit)**:
    - A complete development environment for Java.
    - Includes tools like `javac` (compiler), `java` (interpreter), and libraries.
    - Contains both JRE and development tools.

### 2. **JVM (Java Virtual Machine)**:
    - Executes Java bytecode.
    - Converts bytecode into machine code for the underlying OS.
    - Provides runtime environment and manages memory (Garbage Collection).

### 3. **JRE (Java Runtime Environment)**:
    - Provides libraries and JVM for running Java applications.
    - Does not include development tools like `javac`.

---

## Flow of a `.java` File (Code to Execution)
1. **Write Code**: Create a `.java` file with source code.
2. **Compile**: Use `javac` to compile the `.java` file into a `.class` file (bytecode).
3. **Execute**: Use `java` command to run the `.class` file on the JVM.

---

## Runtime vs Compile Time
- **Compile Time**:
  - Syntax checking and bytecode generation.
  - Tools: `javac` (Java Compiler).
- **Runtime**:
  - Execution of bytecode by JVM.
  - Memory allocation, method calls, and exception handling occur.

---

## Compiling and Running Java Code via Command Line
1. **Compile**:
    ```bash
    javac FileName.java
    ```
    - Generates `FileName.class`.

2. **Run**:
    ```bash
    java FileName
    ```
    - Executes the bytecode.

---

## About the `System` Class
- **`System` Class**:
  - Part of `java.lang` package, which is imported by default.
  - Provides utility methods and fields like `System.out` for output and `System.in` for input.

- **Why `print` Works Without Importing**:
  - `System.out` is a static field of `System` class.
  - `out` is an instance of `PrintStream` class, which provides `print` and `println` methods.

---

**End of Notes**  