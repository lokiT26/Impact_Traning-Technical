# Sorting in Java

Sorting is the process of arranging data in a particular order (ascending or descending). Java provides several algorithms for sorting arrays and collections. Here, we discuss four common sorting algorithms:

---

## 1. Selection Sort

**Concept:**  
Repeatedly selects the minimum element from the unsorted part and swaps it with the first unsorted element.

**Steps:**
1. Find the minimum element in the unsorted array.
2. Swap it with the first unsorted element.
3. Move the boundary of the sorted array one step forward.

**Java Example:**
```java
void selectionSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        int minIdx = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[j] < arr[minIdx]) {
                minIdx = j;
            }
        }
        int temp = arr[minIdx];
        arr[minIdx] = arr[i];
        arr[i] = temp;
    }
}
```

**Time Complexity:**  
- Best/Average/Worst: O(n²)

---

## 2. Insertion Sort

**Concept:**  
Builds the sorted array one element at a time by comparing each new element to those already sorted and inserting it at the correct position.

**Steps:**
1. Start from the second element.
2. Compare it with elements before it.
3. Shift larger elements one position to the right.
4. Insert the current element at the correct position.

**Java Example:**
```java
void insertionSort(int[] arr) {
    for (int i = 1; i < arr.length; i++) {
        int key = arr[i];
        int j = i - 1;
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}
```

**Time Complexity:**  
- Best: O(n)  
- Average/Worst: O(n²)

---

## 3. Bubble Sort

**Concept:**  
Repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

**Steps:**
1. Compare adjacent elements.
2. Swap if out of order.
3. Repeat for all elements until no swaps are needed.

**Java Example:**
```java
void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
}
```

**Time Complexity:**  
- Best: O(n) (optimized)  
- Average/Worst: O(n²)

---

## 4. Merge Sort

**Concept:**  
A divide-and-conquer algorithm that divides the array into halves, sorts each half, and merges them.

**Steps:**
1. Divide the array into two halves.
2. Recursively sort each half.
3. Merge the sorted halves.

**Java Example:**
```java
void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = (left + right) / 2;
        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
}

void merge(int[] arr, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;
    int[] L = new int[n1];
    int[] R = new int[n2];
    for (int i = 0; i < n1; i++)
        L[i] = arr[left + i];
    for (int j = 0; j < n2; j++)
        R[j] = arr[mid + 1 + j];
    int i = 0, j = 0, k = left;
    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k++] = L[i++];
        } else {
            arr[k++] = R[j++];
        }
    }
    while (i < n1) arr[k++] = L[i++];
    while (j < n2) arr[k++] = R[j++];
}
```

**Time Complexity:**  
- Best/Average/Worst: O(n log n)

---

## Summary Table

| Algorithm       | Time Complexity (Best) | Time Complexity (Worst) | Space Complexity | Stable |
|-----------------|-----------------------|-------------------------|------------------|--------|
| Selection Sort  | O(n²)                 | O(n²)                   | O(1)             | No     |
| Insertion Sort  | O(n)                  | O(n²)                   | O(1)             | Yes    |
| Bubble Sort     | O(n)                  | O(n²)                   | O(1)             | Yes    |
| Merge Sort      | O(n log n)            | O(n log n)              | O(n)             | Yes    |

---

**Tip:**  
For small or nearly sorted arrays, insertion sort is efficient. For large datasets, prefer merge sort.