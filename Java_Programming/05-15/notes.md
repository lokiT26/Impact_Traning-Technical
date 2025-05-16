# Bitwise Operations in Java

Bitwise operations allow direct manipulation of individual bits within integer types.

---

## 1. Bitwise Operators

| Operator | Name            | Example | Description                       |
|----------|-----------------|---------|-----------------------------------|
| `&`      | AND             | `a & b` | 1 if both bits are 1              |
| `|`      | OR              | `a \| b`| 1 if either bit is 1              |
| `^`      | XOR             | `a ^ b` | 1 if bits are different           |
| `~`      | NOT (Complement)| `~a`    | Inverts all bits                  |
| `<<`     | Left Shift      | `a << n`| Shifts bits left by n positions   |
| `>>`     | Right Shift     | `a >> n`| Shifts bits right by n positions  |
| `>>>`    | Unsigned Right Shift | `a >>> n` | Shifts right, fills with 0   |

---

## 2. Examples

### AND (`&`)
```java
int a = 5;      // 0101
int b = 3;      // 0011
int c = a & b;  // 0001 (1)
```

### OR (`|`)
```java
int a = 5;      // 0101
int b = 3;      // 0011
int c = a | b;  // 0111 (7)
```

### XOR (`^`)
```java
int a = 5;      // 0101
int b = 3;      // 0011
int c = a ^ b;  // 0110 (6)
```

### NOT (`~`)
```java
int a = 5;      // 0000 0101
int c = ~a;     // 1111 1010 (-6)
```

### Left Shift (`<<`)
```java
int a = 5;      // 0000 0101
int c = a << 1; // 0000 1010 (10)
```

### Right Shift (`>>`)
```java
int a = 5;      // 0000 0101
int c = a >> 1; // 0000 0010 (2)
```

### Unsigned Right Shift (`>>>`)
```java
int a = -8;         // 1111...1000
int c = a >>> 2;    // 0011...1110 (large positive number)
```

---

## 3. Use Cases

- **Checking if a number is even/odd:**  
    `if ((n & 1) == 0) // even`
- **Swapping values without temp variable:**  
    ```java
    a = a ^ b;
    b = a ^ b;
    a = a ^ b;
    ```
- **Setting, clearing, toggling bits:**  
    - Set: `n |= (1 << k);`
    - Clear: `n &= ~(1 << k);`
    - Toggle: `n ^= (1 << k);`

---

## 4. Tips

- Bitwise operations are fast and memory-efficient.
- Only work with integer types (`byte`, `short`, `int`, `long`).


---

## 5. 1's and 2's Complement

### 1's Complement
- The 1's complement of a binary number is obtained by inverting all bits (changing 0 to 1 and 1 to 0).
- Example:
    - Number: `0101` (5)
    - 1's complement: `1010` (-5 in 1's complement for 4 bits)

### 2's Complement
- The 2's complement is obtained by adding 1 to the 1's complement of a number.
- Used in Java (and most systems) to represent negative numbers.
- Example:
    - Number: `0000 0101` (5)
    - 1's complement: `1111 1010`
    - 2's complement: `1111 1011` (-5 in 8 bits)

### Why 2's Complement?
- Simplifies binary arithmetic (addition, subtraction).
- Only one representation for zero.
- Range for 8-bit signed integer: -128 to 127.

---
## 6. 1's and 2's Complement Example

### Example: Finding 2's Complement of 12

```java
int n = 12;           // 0000 1100
int ones = ~n;        // 1111 0011 (1's complement)
int twos = ones + 1;  // 1111 0100 (2's complement, -12)
System.out.println(twos); // Output: -12
```

### Example: Finding 1's Complement of 7

```java
int n = 7;        // 0000 0111
int ones = ~n;    // 1111 1000 (1's complement)
System.out.println(ones); // Output: -8
```