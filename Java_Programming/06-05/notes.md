# HashMap in Java

## Overview
A `HashMap` is a part of Java's `java.util` package. It implements the `Map` interface and stores data in key-value pairs.

---

## Key Features

- **Unordered:** Does not maintain insertion order.
- **Allows null:** One null key and multiple null values allowed.
- **Non-synchronized:** Not thread-safe by default.
- **Fast operations:** Provides constant-time performance for basic operations (get and put).

---

## Declaration & Initialization

```java
import java.util.HashMap;

HashMap<Integer, String> map = new HashMap<>();
```

---

## Common Methods

| Method                | Description                                 |
|-----------------------|---------------------------------------------|
| `put(K key, V value)` | Inserts a key-value pair                    |
| `get(Object key)`     | Returns the value for the given key         |
| `remove(Object key)`  | Removes the mapping for the specified key   |
| `containsKey(key)`    | Checks if the key exists                    |
| `containsValue(val)`  | Checks if the value exists                  |
| `size()`              | Returns the number of key-value pairs       |
| `clear()`             | Removes all mappings                        |

---

## Example Usage

```java
HashMap<String, Integer> scores = new HashMap<>();
scores.put("Alice", 90);
scores.put("Bob", 85);

System.out.println(scores.get("Alice")); // Output: 90
```

---

## Internal Working

- Uses a **hash table**.
- Each key's `hashCode()` determines its bucket.

### More on Internal Working

- **Hash Function:** When a key is added, its `hashCode()` is computed and processed (using bit manipulation) to determine the bucket index.
- **Buckets:** Internally, the HashMap maintains an array of buckets. Each bucket can store multiple entries in case of hash collisions.
- **Collision Handling:** If two keys have the same bucket index, they are stored in a linked list (or a red-black tree if the list grows beyond a threshold, typically 8 entries in Java 8+).
- **Resizing:** When the number of entries exceeds the load factor (default 0.75), the HashMap resizes (doubles the bucket array size) and rehashes all entries.
- **Performance:** Good hash functions distribute keys evenly, minimizing collisions and maintaining O(1) average time for get/put operations.
- **Null Handling:** HashMap allows one null key, which is always stored in bucket 0.


---

## Iterating Over HashMap

```java
for (Map.Entry<String, Integer> entry : scores.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

---

## When to Use HashMap

- When fast lookups, inserts, and deletes are required.
- When order of elements is not important.

---

## Limitations

- Not thread-safe (use `Collections.synchronizedMap()` or `ConcurrentHashMap` for concurrency).
- No ordering of keys or values.

---

## Related Classes

- `LinkedHashMap`: Maintains insertion order.
- `TreeMap`: Maintains sorted order of keys.

---

## References

- [Java Documentation: HashMap](https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html)
- [Oracle Java Tutorials: HashMap](https://docs.oracle.com/javase/tutorial/collections/interfaces/map.html)


# HashSet in Java

## Overview
A `HashSet` is a collection class in Java's `java.util` package that implements the `Set` interface. It stores unique elements and is backed by a hash table.

---

## Key Features

- **Unique Elements:** Does not allow duplicate elements.
- **Unordered:** Does not maintain insertion order.
- **Allows null:** Permits a single null element.
- **Non-synchronized:** Not thread-safe by default.
- **Fast operations:** Provides constant-time performance for basic operations (add, remove, contains).

---

## Declaration & Initialization

```java
import java.util.HashSet;

HashSet<String> set = new HashSet<>();
```

---

## Common Methods

| Method                | Description                                 |
|-----------------------|---------------------------------------------|
| `add(E e)`            | Adds the specified element                  |
| `remove(Object o)`    | Removes the specified element               |
| `contains(Object o)`  | Checks if the element exists                |
| `size()`              | Returns the number of elements              |
| `clear()`             | Removes all elements                        |
| `isEmpty()`           | Checks if the set is empty                  |

---

## Example Usage

```java
HashSet<Integer> numbers = new HashSet<>();
numbers.add(10);
numbers.add(20);
numbers.add(10); // Duplicate, will not be added

System.out.println(numbers.contains(20)); // Output: true
System.out.println(numbers.size());       // Output: 2
```

---

## Internal Working

- Backed by a **HashMap**.
- Each element is stored as a key in the underlying HashMap with a constant dummy value.
- Uses the element's `hashCode()` to determine storage location.
- Ensures uniqueness by checking for existing keys before adding.

---

## Iterating Over HashSet

```java
for (String item : set) {
    System.out.println(item);
}
```

---

## When to Use HashSet

- When you need to store unique elements.
- When order is not important.
- When fast add, remove, and lookup operations are required.

---

## Limitations

- Not thread-safe (use `Collections.synchronizedSet()` or `ConcurrentHashMap.newKeySet()` for concurrency).
- No ordering or sorting of elements.

---

## Related Classes

- `LinkedHashSet`: Maintains insertion order.
- `TreeSet`: Maintains sorted order of elements.

---

## References

- [Java Documentation: HashSet](https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html)
- [Oracle Java Tutorials: Set](https://docs.oracle.com/javase/tutorial/collections/interfaces/set.html)