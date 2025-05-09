# Notes: Arrays in Java

## Introduction
An **array** is a data structure in Java that stores a fixed-size sequential collection of elements of the same type.

---

## Features of Arrays
- **Fixed Size**: The size of an array is defined at the time of creation and cannot be changed.
- **Indexed**: Array elements are accessed using zero-based indexing.
- **Homogeneous**: All elements in an array must be of the same data type.
- **Efficient**: Arrays provide fast access to elements using their index.

---

## Declaration and Initialization

### Declaration
```java
dataType[] arrayName;
```

### Initialization
```java
arrayName = new dataType[size];
```

### Combined Declaration and Initialization
```java
dataType[] arrayName = new dataType[size];
```

### Example
```java
int[] numbers = new int[5]; // Array of size 5
```

---

## Types of Arrays
1. **Single-Dimensional Array**  
    Example:
    ```java
    int[] arr = {1, 2, 3, 4, 5};
    ```

2. **Multi-Dimensional Array**  
    Example:
    ```java
    int[][] matrix = {
         {1, 2, 3},
         {4, 5, 6},
         {7, 8, 9}
    };
    ```

---

## Common Operations on Arrays

### Traversing
```java
for (int i = 0; i < array.length; i++) {
     System.out.println(array[i]);
}
```

### Updating Elements
```java
array[index] = newValue;
```

### Finding Length
```java
int length = array.length;
```

---

## Advantages of Arrays
- Easy to use and implement.
- Provides random access to elements.
- Memory-efficient for storing multiple values of the same type.

---

## Limitations of Arrays
- Fixed size: Cannot grow or shrink dynamically.
- No built-in methods for advanced operations (e.g., searching, sorting).

---

## Example Program
```java
public class ArrayExample {
     public static void main(String[] args) {
          int[] numbers = {10, 20, 30, 40, 50};

          // Traversing the array
          for (int i = 0; i < numbers.length; i++) {
                System.out.println("Element at index " + i + ": " + numbers[i]);
          }
     }
}
```

---

## Conclusion
Arrays are a fundamental part of Java programming and are widely used for storing and managing collections of data. Understanding arrays is essential for mastering Java.
