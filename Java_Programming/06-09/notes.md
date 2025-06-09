# LinkedList in Java

## 1. Introduction
A **LinkedList** is a linear data structure where elements are stored in nodes, and each node points to the next node in the sequence. Unlike arrays, LinkedLists do not require contiguous memory.

---

## 2. Types of LinkedList
- **Singly Linked List**: Each node points to the next node.
- **Doubly Linked List**: Each node points to both the next and previous nodes.
- **Circular Linked List**: The last node points back to the first node.

---

## 3. Structure of a Node

```java
class Node {
    int data;
    Node next; // For singly linked list
    // Node prev; // For doubly linked list
}
```

---

## 4. LinkedList in Java Collections Framework

- Java provides `java.util.LinkedList` class.
- Implements `List`, `Deque`, and `Queue` interfaces.
- Allows duplicate elements and maintains insertion order.

---

## 5. Key Operations

| Operation      | Description                        | Time Complexity |
|----------------|------------------------------------|----------------|
| add(element)   | Adds element at the end            | O(1)           |
| add(index, e)  | Adds element at specific index     | O(n)           |
| remove(index)  | Removes element at index           | O(n)           |
| get(index)     | Retrieves element at index         | O(n)           |
| size()         | Returns number of elements         | O(1)           |

---

## 6. Example Usage

```java
import java.util.LinkedList;

LinkedList<String> list = new LinkedList<>();
list.add("A");
list.add("B");
list.addFirst("Start");
list.addLast("End");
list.remove("B");
System.out.println(list); // Output: [Start, A, End]
```

---

## 7. Advantages

- Dynamic size (no need to specify initial size).
- Efficient insertions/deletions at the beginning or middle.

---

## 8. Disadvantages

- Slow access time (no direct access by index).
- Extra memory for storing pointers.

---

## 9. When to Use

- When frequent insertions/deletions are required.
- When memory overhead is not a concern.

---

## 10. Visual Representation

```
[Head] -> [Node1|data|next] -> [Node2|data|next] -> ... -> [null]
```

---

## 11. Common Interview Questions

- Reverse a linked list.
- Detect a cycle in a linked list.
- Find the middle element of a linked list.

---

> **Tip:** Use ArrayList for fast access, LinkedList for fast insertions/deletions.


---

# Recursion

## 1. What is Recursion?

Recursion is a programming technique where a method calls itself to solve a problem by breaking it down into smaller, simpler subproblems.

---

## 2. Key Components

- **Base Case**: The condition under which the recursion ends.
- **Recursive Case**: The part where the function calls itself with a simpler or smaller input.

---

## 3. Example: Factorial Calculation

```java
int factorial(int n) {
    if (n == 0) return 1; // Base case
    return n * factorial(n - 1); // Recursive case
}
```

---

## 4. How Recursion Works

1. Each recursive call adds a new frame to the call stack.
2. The function keeps calling itself until the base case is met.
3. Once the base case is reached, the stack unwinds and results are combined.

---

## 5. Types of Recursion

- **Direct Recursion**: Function calls itself directly.
- **Indirect Recursion**: Function calls another function, which in turn calls the original function.
- **Tail Recursion**: Recursive call is the last operation in the function.

---

## 6. Advantages

- Simplifies code for problems that have recursive structure (e.g., tree traversals, divide and conquer).
- Reduces code complexity for certain algorithms.

---

## 7. Disadvantages

- Can lead to stack overflow if base case is not reached or recursion is too deep.
- May be less efficient than iterative solutions due to overhead of function calls.

---

## 8. Common Recursion Problems

- Fibonacci sequence
- Linked list reversal
- Tree traversals (preorder, inorder, postorder)
- Tower of Hanoi

---

## 9. Visual Example: Recursive Linked List Traversal

```java
void printList(Node head) {
    if (head == null) return; // Base case
    System.out.print(head.data + " ");
    printList(head.next); // Recursive call
}
```

---

> **Tip:** Always ensure your recursive function has a well-defined base case to prevent infinite recursion.
