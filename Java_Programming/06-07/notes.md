# Sliding Window Technique

## Introduction
The **Sliding Window** is a commonly used algorithmic technique for problems involving arrays or lists. It is especially useful for finding subarrays or substrings that satisfy certain conditions.

---

## When to Use
- When you need to examine all contiguous subarrays/substrings of a given size.
- When the problem involves finding maximum/minimum sum, length, or other properties of subarrays.

---

## How It Works

1. **Initialize** two pointers (usually `start` and `end`) to represent the window's boundaries.
2. **Expand** the window by moving the `end` pointer.
3. **Shrink** the window by moving the `start` pointer as needed to maintain constraints.
4. **Update** the result (sum, length, etc.) as the window slides.

---

## Types

### 1. Fixed-size Sliding Window
- Window size remains constant.
- Example: Find the maximum sum of any subarray of size `k`.

### 2. Variable-size Sliding Window
- Window size changes based on constraints.
- Example: Find the smallest subarray with a sum ≥ `S`.

---

## Example: Maximum Sum Subarray of Size K

```java
int maxSum(int[] arr, int k) {
    int maxSum = 0, windowSum = 0;
    for (int i = 0; i < arr.length; i++) {
        windowSum += arr[i];
        if (i >= k - 1) {
            maxSum = Math.max(maxSum, windowSum);
            windowSum -= arr[i - k + 1];
        }
    }
    return maxSum;
}
```

---

## Advantages

- **Efficient:** Reduces time complexity from O(n²) to O(n) for many problems.
- **Simple:** Easy to implement and understand.

---

## Common Problems

- Longest substring without repeating characters
- Maximum sum subarray of size K
- Minimum window substring


---

# Greedy Algorithm

## Introduction

A **Greedy Algorithm** is an approach for solving problems by making the locally optimal choice at each step with the hope of finding a global optimum. Greedy algorithms do not always produce the optimal solution for all problems, but they are efficient and easy to implement for many scenarios.

---

## When to Use

- When a problem exhibits the **greedy-choice property** (a global optimum can be reached by selecting the local optimum).
- When the problem has **optimal substructure** (an optimal solution can be constructed from optimal solutions of its subproblems).
- Common in optimization problems, such as scheduling, resource allocation, and graph algorithms.

---

## How It Works

1. **Initialize** the solution set (often empty).
2. **Iterate** through the input, at each step:
    - Choose the best available option according to a certain criterion.
    - Add this choice to the solution set.
    - Update the state of the problem as needed.
3. **Repeat** until all elements are processed or a goal is reached.

---

## Example: Activity Selection Problem

Given a set of activities with start and end times, select the maximum number of non-overlapping activities.

```java
class Activity {
     int start, end;
     Activity(int s, int e) { start = s; end = e; }
}

int maxActivities(Activity[] activities) {
     Arrays.sort(activities, Comparator.comparingInt(a -> a.end));
     int count = 1, lastEnd = activities[0].end;
     for (int i = 1; i < activities.length; i++) {
          if (activities[i].start >= lastEnd) {
                count++;
                lastEnd = activities[i].end;
          }
     }
     return count;
}
```

---

## Advantages

- **Efficient:** Often has lower time complexity compared to other approaches like dynamic programming.
- **Simple:** Easy to implement and understand.

---

## Limitations

- **Not always optimal:** May not yield the best solution for all problems.
- **Requires problem-specific analysis:** Must prove that the greedy choice leads to an optimal solution.

---

## Common Problems

- Activity selection
- Fractional knapsack
- Huffman coding
- Coin change (for certain denominations)
- Minimum spanning tree (Prim's and Kruskal's algorithms)
- Dijkstra's shortest path algorithm


# Backtracking and Recursion

## Introduction

**Backtracking** is a general algorithmic technique for solving problems incrementally, one piece at a time, and removing solutions that fail to satisfy the constraints of the problem. It is often implemented using **recursion**, which allows the algorithm to explore all possible options and backtrack when a solution path fails.

---

## When to Use

- When the problem requires searching through all possible configurations or permutations.
- When constraints must be satisfied at each step (e.g., Sudoku, N-Queens).
- When you need to generate all solutions or find one feasible solution.

---

## How It Works

1. **Choose**: Select an option from the available choices.
2. **Explore**: Recursively proceed with the chosen option.
3. **Check**: If the current path leads to a solution, record or return it.
4. **Backtrack**: If the path fails, undo the last choice and try the next option.

This process continues until all possibilities are explored.

---

## Recursion in Backtracking

Recursion is a natural fit for backtracking because it allows the algorithm to branch and return to previous states easily. Each recursive call represents a decision point, and returning from the call undoes the last decision.

---

## Example: N-Queens Problem

Place N queens on an N×N chessboard so that no two queens threaten each other.

```java
void solveNQueens(int n) {
    List<List<String>> solutions = new ArrayList<>();
    char[][] board = new char[n][n];
    for (char[] row : board) Arrays.fill(row, '.');
    backtrack(board, 0, solutions);
}

void backtrack(char[][] board, int row, List<List<String>> solutions) {
    if (row == board.length) {
        solutions.add(construct(board));
        return;
    }
    for (int col = 0; col < board.length; col++) {
        if (isValid(board, row, col)) {
            board[row][col] = 'Q';
            backtrack(board, row + 1, solutions);
            board[row][col] = '.'; // backtrack
        }
    }
}

boolean isValid(char[][] board, int row, int col) {
    for (int i = 0; i < row; i++)
        if (board[i][col] == 'Q') return false;
    for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
        if (board[i][j] == 'Q') return false;
    for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++)
        if (board[i][j] == 'Q') return false;
    return true;
}

List<String> construct(char[][] board) {
    List<String> res = new ArrayList<>();
    for (char[] row : board) res.add(new String(row));
    return res;
}
```

---

## Advantages

- **Systematic Search:** Explores all possible solutions.
- **Flexible:** Can be adapted to a wide range of constraint satisfaction problems.
- **Elegant:** Recursive implementation is often concise and clear.

---

## Limitations

- **Inefficient for Large Inputs:** May have exponential time complexity.
- **Stack Overflow:** Deep recursion can lead to stack overflow errors.
- **Requires Pruning:** Without effective pruning, can be slow for complex problems.

---

## Common Problems

- N-Queens
- Sudoku solver
- Permutations and combinations
- Subset sum
- Word search in a grid
- Maze solving
