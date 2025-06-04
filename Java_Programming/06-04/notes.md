# Time Complexity

_Time complexity_ is a measure of the amount of **computational time** an algorithm takes as a function of the size of the input.

---

## 📚 Why Time Complexity?

- Helps compare algorithms' efficiency.
- Predicts performance for large inputs.
- Guides optimal algorithm selection.

---

## 🕒 Big O Notation

Describes the **upper bound** of an algorithm's running time.

| Notation   | Name            | Example                |
|------------|-----------------|------------------------|
| O(1)       | Constant        | Accessing array index  |
| O(log n)   | Logarithmic     | Binary search          |
| O(n)       | Linear          | Simple loop            |
| O(n log n) | Linearithmic    | Merge sort             |
| O(n²)      | Quadratic       | Nested loops           |
| O(2ⁿ)      | Exponential     | Recursive Fibonacci    |

---

## 📝 How to Analyze

1. **Identify basic operations** (comparisons, assignments).
2. **Count the number of operations** as input size grows.
3. **Express in Big O** (ignore constants and lower-order terms).

---

## ⚡ Examples

```java
// O(1)
int x = arr[5];

// O(n)
for (int i = 0; i < n; i++) {
    sum += arr[i];
}

// O(n^2)
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        // some operation
    }
}
```

---

## 🏁 Key Points

- Focus on **worst-case** unless specified.
- Ignore hardware and language specifics.
- Time complexity ≠ actual running time.

---

> **Tip:** Always strive for the lowest possible time complexity for large-scale problems.

---

# 📋 ArrayList in Java

_An `ArrayList` is a resizable array implementation of the `List` interface in Java, found in `java.util`._

---

## 🚀 Features of ArrayList

- **Dynamic sizing:** Grows or shrinks as needed.
- **Indexed access:** Fast random access via indices.
- **Allows duplicates:** Stores duplicate elements.
- **Order preserved:** Maintains insertion order.
- **Not synchronized:** Not thread-safe by default.

---

## 🛠️ Common Operations

```java
ArrayList<String> list = new ArrayList<>();
list.add("Apple");           // Add element
list.get(0);                 // Access element
list.set(0, "Banana");       // Update element
list.remove("Banana");       // Remove element
list.size();                 // Get size
list.contains("Apple");      // Check existence
```

---

## 🆚 ArrayList vs Array

| Feature         | Array                        | ArrayList                    |
|-----------------|-----------------------------|------------------------------|
| Size            | Fixed                       | Dynamic (resizable)          |
| Type            | Primitives & Objects        | Objects only                 |
| Performance     | Faster for primitives       | Slightly slower (overhead)   |
| Methods         | None (except length)        | Rich API (add, remove, etc.) |
| Memory          | Less (no overhead)          | More (dynamic resizing)      |

---

## 🔄 Conversion

- **Array → ArrayList:**
    ```java
    List<Integer> list = Arrays.asList(array);
    ```
- **ArrayList → Array:**
    ```java
    Integer[] arr = list.toArray(new Integer[0]);
    ```

---

> **Tip:** Use `ArrayList` for flexible, frequently changing collections; use arrays for fixed-size, performance-critical data.
