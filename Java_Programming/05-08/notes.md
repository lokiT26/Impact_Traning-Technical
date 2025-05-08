# Nested Loops in Java

## Introduction
Nested loops are loops within loops. They allow you to perform repeated actions in a structured way, especially when dealing with multi-dimensional data or complex iterations.

---

## Syntax
```java
for (initialization; condition; update) {
    for (initialization; condition; update) {
        // Inner loop code
    }
    // Outer loop code
}
```

---

## Example: Multiplication Table
```java
public class MultiplicationTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}
```

**Output:**
```
1   2   3   4   5   6   7   8   9   10
2   4   6   8   10  12  14  16  18  20
...
```

---

## Types of Nested Loops
1. **For Loop inside For Loop**
   ```java
   for (int i = 0; i < 3; i++) {
       for (int j = 0; j < 3; j++) {
           System.out.println("i: " + i + ", j: " + j);
       }
   }
   ```

2. **While Loop inside For Loop**
   ```java
   for (int i = 0; i < 3; i++) {
       int j = 0;
       while (j < 3) {
           System.out.println("i: " + i + ", j: " + j);
           j++;
       }
   }
   ```

3. **Do-While Loop inside While Loop**
   ```java
   int i = 0;
   while (i < 3) {
       int j = 0;
       do {
           System.out.println("i: " + i + ", j: " + j);
           j++;
       } while (j < 3);
       i++;
   }
   ```

---

## Common Use Cases
- **2D Arrays Traversal**
  ```java
  int[][] matrix = {
      {1, 2, 3},
      {4, 5, 6},
      {7, 8, 9}
  };

  for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
          System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
  }
  ```

- **Patterns Printing**
  ```java
  for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= i; j++) {
          System.out.print("*");
      }
      System.out.println();
  }
  ```
- **Inverted Triangle Pattern**
    ```java
    for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                    System.out.print("*");
            }
            System.out.println();
    }
    ```

- **Number Pyramid**
    ```java
    for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
            }
            System.out.println();
    }
    ```

- **Floyd's Triangle**
    ```java
    int num = 1;
    for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                    System.out.print(num + " ");
                    num++;
            }
            System.out.println();
    }
    ```

- **Diamond Pattern**
    ```java
    int n = 5;
    for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                    System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
            }
            System.out.println();
    }
    for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                    System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
            }
            System.out.println();
    }
    ```

- **Checkerboard Pattern**
    ```java
    int n = 5;
    for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                    if ((i + j) % 2 == 0) {
                            System.out.print("*");
                    } else {
                            System.out.print(" ");
                    }
            }
            System.out.println();
    }
    ```