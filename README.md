# IDBS-CART - Jump Array Validator

This repository provides a solution to the problem of determining whether it's possible to jump from the first index of an integer array to its last index, given that each number represents the maximum jump length at that position.

## Problem Statement

**Task**:  
You are given an integer array `nums`. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.  
Return True if you can reach the last index, or False otherwise.

**Examples**:  

- **Input**: `nums = [2,3,1,1,4]`  
  **Output**: `true`  
  **Explanation**: Jump 1 step from index 0 to 1, then 3 steps to the last index.

- **Input**: `nums = [3,2,1,0,4]`  
  **Output**: `false`  
  **Explanation**: You will always arrive at index 3 no matter what. Its maximum jump length is 0, which makes it impossible to reach the last index.

## Implementation

The solution is split into two main classes:

- `MainApplication`: This serves as the application entry point. It contains the main method to convert command-line string arguments into integer arrays and then applies the use case to determine if a jump to the last index is possible.
- `UseCaseImpl`: This implements the logic to check the possibility of a jump to the end of the array.

## Usage Example

To run the application and validate an integer array, provide space-separated integers as command-line arguments:

```bash
gradle shadowJar
java -jar .\build\libs\IDBS-CART-1.0-SNAPSHOT-all.jar  2 3 1 1 4
java -jar .\build\libs\IDBS-CART-1.0-SNAPSHOT-all.jar  3 2 1 0 4
```