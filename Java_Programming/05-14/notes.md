# Number System Conversions

## 1. Binary to Decimal

**Binary** is base-2 (digits: 0, 1).  
**Decimal** is base-10 (digits: 0-9).

### Steps:
1. Write down the binary number.
2. Starting from the right, multiply each bit by 2 raised to its position index.
3. Sum all the results.

### Example
```
Binary:  1  0  1  1
Index:   3  2  1  0

Calculation:
(1 × 2³) + (0 × 2²) + (1 × 2¹) + (1 × 2⁰)
= (1 × 8) + (0 × 4) + (1 × 2) + (1 × 1)
= 8 + 0 + 2 + 1 = **11**
```
**Result:** `1011₂ = 11₁₀`

---

## 2. Decimal to Binary

### Steps:
1. Divide the decimal number by 2.
2. Write down the remainder (0 or 1).
3. Divide the quotient by 2, repeat step 2.
4. Continue until the quotient is 0.
5. The binary number is the remainders read **bottom to top**.

### Example
```
Decimal: 13

13 ÷ 2 = 6, remainder 1
6 ÷ 2 = 3, remainder 0
3 ÷ 2 = 1, remainder 1
1 ÷ 2 = 0, remainder 1

Read remainders bottom to top: 1101
```
**Result:** `13₁₀ = 1101₂`

---

## 3. Quick Reference Table

| Decimal | Binary |
|---------|--------|
| 0       | 0      |
| 1       | 1      |
| 2       | 10     |
| 3       | 11     |
| 4       | 100    |
| 5       | 101    |
| 6       | 110    |
| 7       | 111    |
| 8       | 1000   |

---

