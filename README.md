# Java Algorithms Project

This project contains implementations and tests for several common sorting and pattern matching algorithms written in Java. The algorithms include Bubble Sort, Quick Sort, Counting Sort, Z Algorithm, and Merge Sort.

## Algorithms Overview

### 1. Bubble Sort

**Description**: Bubble Sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

**Complexity**:
- Time: O(n^2) in the worst and average case.
- Space: O(1).

**Implementation**: Located in `src/main/java/BubbleSort.java`.

### 2. Quick Sort

**Description**: Quick Sort is an efficient sorting algorithm that uses a divide-and-conquer approach. It picks an element as a pivot and partitions the array around the pivot.

**Complexity**:
- Time: O(n log n) on average.
- Space: O(log n).

**Implementation**: Located in `src/main/java/QuickSort.java`.

### 3. Counting Sort

**Description**: Counting Sort is a non-comparative sorting algorithm that counts the occurrences of each element and uses this count to determine the position of each element in the output array.

**Complexity**:
- Time: O(n + k), where n is the number of elements in the input array and k is the range of input.
- Space: O(k).

**Implementation**: Located in `src/main/java/CountingSort.java`.

### 4. Z Algorithm

**Description**: The Z Algorithm is used for pattern matching in strings. It creates a Z-array for a string that tells how many characters from a given position match the prefix of the string.

**Complexity**:
- Time: O(n + m), where n is the length of the text and m is the length of the pattern.
- Space: O(n + m).

**Implementation**: Located in `src/main/java/ZAlgorithm.java`.

### 5. Merge Sort

**Description**: Merge Sort is a divide-and-conquer algorithm that divides the array into halves, sorts them, and then merges the sorted halves.

**Complexity**:
- Time: O(n log n) in all cases.
- Space: O(n).

**Implementation**: Located in `src/main/java/MergeSort.java`.

## Running Tests

Each algorithm has a corresponding test class located in the `src/test/java` directory. The tests use JUnit to verify the correctness of the implementations.

### How to Run the Tests

1. Ensure you have Maven and JDK 11 installed on your system.
2. Navigate to the root directory of your project where `pom.xml` is located.
3. Use the following command to run all tests:

   ```bash
   mvn clean test
