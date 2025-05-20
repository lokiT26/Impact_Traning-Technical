# Strings in Java

## 1. Introduction to Strings
- **String** is a sequence of characters.
- In Java, `String` is a **class** in `java.lang` package.
- Strings are **immutable** (cannot be changed after creation).

```java
String s = "Hello";
```

---

## 2. Creating Strings

### Using String Literals
- Stored in **String Constant Pool**.
- Example:
    ```java
    String s1 = "Java";
    String s2 = "Java"; // s1 and s2 refer to the same object
    ```

### Using `new` Keyword
- Stored in **Heap Memory**.
- Example:
    ```java
    String s3 = new String("Java"); // New object in heap
    ```

---

## 3. Memory Management

| Creation Method      | Memory Location         | Pooling Behavior         |
|----------------------|------------------------|-------------------------|
| String Literal       | String Constant Pool   | Reuses existing objects |
| `new String()`       | Heap                   | Always creates new      |

- **String Pool**: Special memory region for string literals.
- **Heap**: General memory area for all objects.

---

## 4. String Immutability

- Once created, the value cannot be changed.
- Any modification creates a new String object.
- Benefits: **Thread safety**, **security**, **hashcode caching**.

---

## 5. Common String Methods

| Method                | Description                        |
|-----------------------|------------------------------------|
| `length()`            | Returns string length              |
| `charAt(int index)`   | Returns char at given index        |
| `substring(int, int)` | Returns substring                  |
| `toLowerCase()`       | Converts to lowercase              |
| `toUpperCase()`       | Converts to uppercase              |
| `equals(Object)`      | Compares string values             |
| `equalsIgnoreCase()`  | Ignores case in comparison         |
| `contains(CharSeq)`   | Checks if sequence is present      |
| `replace(a, b)`       | Replaces characters                |
| `split(regex)`        | Splits string by regex             |
| `trim()`              | Removes leading/trailing spaces    |

---

## 6. String Comparison

- `==` : Compares **references** (memory addresses).
- `.equals()` : Compares **values** (actual content).

---

## 7. Mutable Alternatives

- **StringBuilder** (not thread-safe) and **StringBuffer** (thread-safe) for mutable strings.

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
```

---

## 8. Useful Tips

- Use string literals for memory efficiency.
- Use `StringBuilder` for frequent modifications.
- Avoid `==` for string value comparison.

---

## 9. Example

```java
String a = "Java";
String b = new String("Java");
System.out.println(a == b);        // false
System.out.println(a.equals(b));   // true
```