# 2D Arrays in Java

## What is a 2D Array?
A 2D array is an array of arrays. It represents a matrix or table of rows and columns.

```java
// Declaration
int[][] matrix;

// Initialization
matrix = new int[3][4]; // 3 rows, 4 columns
```

## Declaration & Initialization

```java
// Declaration and initialization in one line
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

## Accessing Elements

```java
int value = arr[1][2]; // Accesses element at 2nd row, 3rd column (value = 6)
```

## Iterating Over a 2D Array

```java
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
```

## Key Points
- **Rows:** `arr.length`
- **Columns:** `arr[0].length`
- **Default values:** Numeric arrays are initialized to `0`.

## Example: Sum of All Elements

```java
int sum = 0;
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        sum += arr[i][j];
    }
}
System.out.println("Sum: " + sum);
```

## Jagged Arrays

2D arrays can have rows of different lengths.

```java
int[][] jagged = {
    {1, 2},
    {3, 4, 5},
    {6}
};
```

---

**Tip:** Use enhanced for-loops for cleaner code:

```java
for (int[] row : arr) {
    for (int val : row) {
        System.out.print(val + " ");
    }
    System.out.println();
}
```