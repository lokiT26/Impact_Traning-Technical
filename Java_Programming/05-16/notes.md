# Bitwise Operations in Java

## 1. Swapping Two Numbers Without a Third Variable (Using XOR)

**Concept:**  
The XOR (`^`) operator can swap two numbers without using a temporary variable.

**Example:**

```java
int a = 5; // 0101
int b = 9; // 1001

a = a ^ b; // a = 0101 ^ 1001 = 1100 (12)
b = a ^ b; // b = 1100 ^ 1001 = 0101 (5)
a = a ^ b; // a = 1100 ^ 0101 = 1001 (9)
```

**Result:**  
- `a = 9`
- `b = 5`

**Explanation:**  
Each XOR operation "removes" the known value, effectively swapping the numbers.

---

## 2. Check if a Particular Bit is Set at a Given Index

**Concept:**  
To check if the bit at position `n` (0-based from right) is set (1), use bitwise AND (`&`).

**Example:**

```java
int num = 10; // 1010 in binary
int index = 1; // Check 2nd bit from right

boolean isSet = (num & (1 << index)) != 0;
System.out.println(isSet); // true (since 2nd bit is 1)
```

**Explanation:**  
- `1 << index` shifts 1 to the left by `index` positions.
- `num & (1 << index)` isolates the bit at `index`.
- If result is not zero, the bit is set.

---

**Summary Table**

| Operation                | Example Code                         | Output/Result |
|--------------------------|--------------------------------------|---------------|
| Swap with XOR            | See above                            | a=9, b=5      |
| Check bit at index `n`   | `(num & (1 << n)) != 0`              | true/false    |
