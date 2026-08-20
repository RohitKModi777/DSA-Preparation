# 🚀 5th Semester Data Structures & Algorithms (DSA) Booster

Welcome to the **5th Semester DSA Booster** repository! This repository contains clean, student-friendly Java implementations of core Data Structures and Algorithms problems across 5 essential categories: **Array**, **LinkedList**, **Maths**, **Stack**, and **String**.

Every solution is heavily documented with **problem titles, approach summaries, time/space complexities**, and step-by-step explanations written in a student-centric learning format.

---

## 📁 Repository Structure & Problem Index

### 1. 📊 Array Data Structure

| Problem Title | File Location | Approach / Technique | Time Complexity | Space Complexity |
| :--- | :--- | :--- | :--- | :--- |
| **Second Largest Element** | [`Array/SecondLargest.java`](./Array/SecondLargest.java) | Sorting & Backwards Iteration | $O(N \log N)$ | $O(1)$ |
| **Majority Element** | [`Array/majorityelement.java`](./Array/majorityelement.java) | Frequency Counting | $O(N^2)$ | $O(1)$ |
| **Max Subarray Sum** | [`Array/maxSubarraySum.java`](./Array/maxSubarraySum.java) | Subarray Sum Exploration | $O(N^2)$ | $O(1)$ |
| **Min & Max Element** | [`Array/minAndMaxArray.java`](./Array/minAndMaxArray.java) | ArrayList Sorting | $O(N \log N)$ | $O(N)$ |
| **Missing Number** | [`Array/missingNumber.java`](./Array/missingNumber.java) | Gauss Sum Formula $N(N+1)/2$ | $O(N)$ | $O(1)$ |
| **Move Zeros to End** | [`Array/move0toEnd.java`](./Array/move0toEnd.java) | Auxiliary Array Shift | $O(N)$ | $O(N)$ |
| **Remove Duplicates** | [`Array/removeDuplicates.java`](./Array/removeDuplicates.java) | HashSet & Linear Search | $O(N)$ / $O(N^2)$ | $O(N)$ |
| **Reverse Array** | [`Array/reverseArr.java`](./Array/reverseArr.java) | Two-Pointer In-Place Swapping | $O(N)$ | $O(1)$ |
| **Two Sum Problem** | [`Array/twoSum.java`](./Array/twoSum.java) | Pair Comparison | $O(N^2)$ | $O(1)$ |

---

### 2. 🔗 Linked List Data Structure

| Problem Title | File Location | Approach / Technique | Time Complexity | Space Complexity |
| :--- | :--- | :--- | :--- | :--- |
| **Delete Given Node** | [`LinkedList/DeleteGivenNode.java`](./LinkedList/DeleteGivenNode.java) | Copy Next Node & Bypass | $O(1)$ | $O(1)$ |
| **K-th Node from End** | [`LinkedList/kthNodefromend.java`](./LinkedList/kthNodefromend.java) | Length Count & Advance | $O(N)$ | $O(1)$ |
| **Detect Cycle** | [`LinkedList/llistcycle.java`](./LinkedList/llistcycle.java) | Floyd's Fast & Slow / HashSet | $O(N)$ | $O(1)$ / $O(N)$ |
| **Merge Two Sorted Lists** | [`LinkedList/mergeTwoSortedll.java`](./LinkedList/mergeTwoSortedll.java) | Dummy Node & Iterative Merge | $O(N + M)$ | $O(1)$ |
| **Middle Node & Reverse** | [`LinkedList/middleNode.java`](./LinkedList/middleNode.java) | Fast & Slow Pointer / 3-Pointer Reverse | $O(N)$ | $O(1)$ |
| **Linked List Traversal** | [`LinkedList/traversell.java`](./LinkedList/traversell.java) | Iterative Pointer Advance | $O(N)$ | $O(1)$ |

---

### 3. 🧮 Mathematics

| Problem Title | File Location | Approach / Technique | Time Complexity | Space Complexity |
| :--- | :--- | :--- | :--- | :--- |
| **Factorial & Fibonacci** | [`Maths/factorial.java`](./Maths/factorial.java) | Iterative & Recursive Approaches | $O(N)$ / $O(2^N)$ | $O(1)$ / $O(N)$ stack |
| **Greatest Common Divisor (GCD)**| [`Maths/gcd.java`](./Maths/gcd.java) | BigInteger Euclidean Algorithm | $O(\log(\min(A,B)))$ | $O(1)$ |

---

### 4. 📚 Stack Data Structure

| Problem Title | File Location | Approach / Technique | Time Complexity | Space Complexity |
| :--- | :--- | :--- | :--- | :--- |
| **Stack Implementation** | [`Stack/implusingArr.java`](./Stack/implusingArr.java) | Custom Array-Based Stack ADT | $O(1)$ per operation | $O(\text{Capacity})$ |
| **Valid Parentheses** | [`Stack/validParenthesis.java`](./Stack/validParenthesis.java) | LIFO Bracket Matching | $O(N)$ | $O(N)$ |

---

### 5. 🔤 String Algorithms

| Problem Title | File Location | Approach / Technique | Time Complexity | Space Complexity |
| :--- | :--- | :--- | :--- | :--- |
| **Anagram Check** | [`String/anagram.java`](./String/anagram.java) | Character Array Sorting | $O(N \log N)$ | $O(N)$ |
| **Palindrome String** | [`String/palindromeString.java`](./String/palindromeString.java) | StringBuilder Reverse Compare | $O(N)$ | $O(N)$ |
| **Reverse String** | [`String/reverseString.java`](./String/reverseString.java) | Two-Pointer & StringBuilder | $O(N)$ | $O(N)$ |

---

## 🛠️ How to Compile and Run Java Programs

### Prerequisites
Make sure you have JDK (Java Development Kit) installed on your system.

```bash
java -version
```

### Compiling and Running a File

1. Navigate to the project root folder.
2. Compile the desired `.java` file using `javac`:
   ```bash
   javac Array/SecondLargest.java
   ```
3. Run the compiled class file:
   ```bash
   java Array.SecondLargest
   # Or for package-less files:
   java Array/SecondLargest
   ```

---

## 🎓 Student Learning Tips

- **Understand the Logic First**: Read the header comments in each file before attempting to write code from scratch.
- **Trace Pointer Movements**: Draw linked list pointer connections on paper when studying `LinkedList/DeleteGivenNode.java` or `LinkedList/middleNode.java`.
- **Analyze Complexities**: Observe how brute force solutions compare with optimal approaches in terms of Time Complexity $O(...)$ and Auxiliary Space $O(...)$.

---

*Happy Coding & Best of Luck for 5th Semester Exams! 🚀*
