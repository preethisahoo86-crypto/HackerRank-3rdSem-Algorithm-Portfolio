# HackerRank 3rd Semester Algorithm Portfolio

## Student Information

- **Name:** Preethi Sahoo
- **USN:** R25ER076
- **Program:** B.Tech in Computer Science and Engineering
- **Semester:** 3rd Semester
- **Programming Language:** Java
- **HackerRank Profile:** https://www.hackerrank.com/profile/preethisahoo86
- **GitHub Repository:** https://github.com/preethisahoo86-crypto/HackerRank-3rdSem-Algorithm-Portfolio

## Introduction

This repository contains my solutions to five mandatory HackerRank algorithmic problems completed as part of the 3rd Semester Computer Science and Engineering studio activity.

The problems cover arrays, sorting, searching, greedy algorithms, and algorithm efficiency. Each solution is implemented in Java and organized into a separate folder for clarity and easy evaluation.

## Problems Completed

| No. | Problem | Topic | Time Complexity | Auxiliary Space |
|---|---|---|---|---|
| 1 | Mini-Max Sum | Arrays / Implementation | O(N) | O(1) |
| 2 | Birthday Cake Candles | Arrays / Counting | O(N) | O(1) |
| 3 | Insertion Sort - Part 1 | Sorting | O(N) | O(1) |
| 4 | Binary Search | Searching | O(log N) | O(1) |
| 5 | Mark and Toys | Greedy / Sorting | O(N log N) | O(log N)* |

\* Auxiliary space for sorting may depend on the Java sorting implementation used.

---

## 1. Mini-Max Sum

### Problem Summary
Given five positive integers, calculate the minimum sum and maximum sum that can be obtained by summing exactly four of the five integers.

### Approach
The solution keeps track of the total sum and identifies the minimum and maximum values. The minimum sum is obtained by excluding the maximum value, while the maximum sum is obtained by excluding the minimum value.

### Important Steps
1. Calculate the total sum of all elements.
2. Find the minimum element.
3. Find the maximum element.
4. Calculate:
   - Minimum Sum = Total Sum - Maximum
   - Maximum Sum = Total Sum - Minimum

### Complexity
- **Time:** O(N)
- **Auxiliary Space:** O(1)

### Alternative Approach
The array can be sorted and the first four and last four elements can be summed. This takes O(N log N) time, so tracking minimum and maximum is more efficient.

### HackerRank
https://www.hackerrank.com/challenges/mini-max-sum/problem

---

## 2. Birthday Cake Candles

### Problem Summary
Given the heights of candles, determine how many candles have the maximum height.

### Approach
Traverse the array once while maintaining the maximum height and its frequency.

### Important Steps
1. Start with the maximum height as the first value.
2. Compare every value with the current maximum.
3. If a larger value is found, update the maximum and reset the count.
4. If the value equals the maximum, increase the count.

### Complexity
- **Time:** O(N)
- **Auxiliary Space:** O(1)

### Alternative Approach
Sort the array and count the occurrences of the last element. Sorting requires O(N log N) time, so a single traversal is more efficient.

### HackerRank
https://www.hackerrank.com/challenges/birthday-cake-candles/problem

---

## 3. Insertion Sort - Part 1

### Problem Summary
Insert the last element of an almost-sorted array into its correct position while shifting larger elements to the right.

### Approach
Store the last element as the value to be inserted. Compare it with elements before it and shift larger elements one position to the right until the correct position is found.

### Important Steps
1. Store the last element.
2. Compare it with the preceding elements.
3. Shift larger elements to the right.
4. Insert the stored element into its correct position.

### Complexity
- **Time:** O(N) for the required insertion operation
- **Auxiliary Space:** O(1)

### Alternative Approach
A complete insertion sort can be performed on the entire array, but that performs more operations than necessary for this specific problem.

### HackerRank
https://www.hackerrank.com/challenges/insertionsort1/problem

---

## 4. Binary Search

### Problem Summary
Given a sorted array and a target value, find the position of the target using binary search.

### Approach
Binary search repeatedly divides the search range into two halves. The middle element is compared with the target, and the search continues in the appropriate half.

### Important Steps
1. Set the left and right boundaries.
2. Calculate the middle position.
3. Compare the middle element with the target.
4. If equal, return the position.
5. If the target is smaller, search the left half.
6. Otherwise, search the right half.

### Complexity
- **Time:** O(log N)
- **Auxiliary Space:** O(1)

### Alternative Approach
Linear search can be used, but it requires O(N) time. Binary search is more efficient when the array is sorted.

### HackerRank
https://www.hackerrank.com/challenges/tutorial-intro/problem

---

## 5. Mark and Toys

### Problem Summary
Given prices of toys and a fixed amount of money, determine the maximum number of toys that can be purchased.

### Approach
Sort the toy prices in ascending order and purchase the cheapest toys first until the available budget is insufficient.

### Important Steps
1. Sort the prices.
2. Start with zero purchased toys.
3. Traverse the sorted prices.
4. Purchase a toy if its price is within the remaining budget.
5. Stop when the next toy cannot be purchased.

### Complexity
- **Time:** O(N log N)
- **Auxiliary Space:** Depends on the Java sorting implementation.

### Alternative Approach
A counting/frequency-based approach can reduce sorting overhead when the price range is small and known, but sorting is simple and appropriate for the general case.

### HackerRank
https://www.hackerrank.com/challenges/mark-and-toys/problem

---

## Algorithmic Techniques Learned

Through these problems, I practiced several fundamental algorithmic techniques:

- Array traversal
- Minimum and maximum tracking
- Counting frequencies
- Insertion and element shifting
- Binary search
- Sorting
- Greedy selection
- Big-O time and space complexity analysis

These techniques help in developing efficient solutions and understanding how algorithm choices affect program performance.

## Repository Structure

```text
HackerRank-3rdSem-Algorithm-Portfolio/
│
├── README.md
│
├── 01-Mini-Max-Sum/
│   └── solution.java
│
├── 02-Birthday-Cake-Candles/
│   └── solution.java
│
├── 03-Insertion-Sort-Part-1/
│   └── solution.java
│
├── 04-Binary-Search/
│   └── Solution.java
│
└── 05-Mark-and-Toys/
    └── Solution.java
