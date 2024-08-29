# Problem 1 - Maximum sum contiguous subarray

## Problem Description

Find the maximum sum of a contiguous non-empty subarray within an array A of length N.

## Problem Constraints

- 1 <= N <= 1e6
- -1000 <= A[i] <= 1000

## Input Format

The first and the only argument contains an integer array, A.

## Output Format

Return an integer representing the maximum possible sum of the contiguous subarray.

## Example Input

**Input 1:**

A = \[1, 2, 3, 4, -10\]

**Input 2:**

A = \[-2, 1, -3, 4, -1, 2, 1, -5, 4\]

## Example Output

**Output 1:**

10

**Output 2:**

6

## Example Explanation

**Explanation 1:**

The subarray \[1, 2, 3, 4\] has the maximum possible sum of 10.

**Explanation 2:**

The subarray \[4, -1, 2, 1\] has the maximum possible sum of 6.

### Brute Force

Find the sum of all subarrays and then return the maximum of it.  

```java
public class Solution {
    public int maxSubArray(final int[] A) {
        int N = A.length;
        int max = A[0]; // or -infinity

        for(int i = 0; i < N; i++){
            for(int j = i; j < N; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += A[k];
                }
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
```
**Time complexity is O(N^3)**


# Optimal Approach

Store the prefix sum array so that you can find the sum of a range `i to j` using `ps[j] - ps[i-1]` for `i > 0`. Return the maximum sum of it.

```java
public class Solution {
    public int maxSubArray(final int[] A) {
        int N = A.length;
        int[] ps = new int[N];
        ps[0] = A[0];
        
        // Step 1: Construct the prefix sum array
        for (int i = 1; i < N; i++) {
            ps[i] = ps[i - 1] + A[i];
        }

        int max = A[0]; // Initialize max to the first element or -infinity

        // Step 2: Find the maximum subarray sum using the prefix sum array
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                int sum = (i > 0) ? ps[j] - ps[i - 1] : ps[j];
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
```
**Time complexity - O(N^2)**


# Best Approach - Kadane's Algorithm

It iterates through the array while maintaining a running sum of the current subarray. If the running sum becomes negative, it's reset to zero since a negative sum would decrease the potential maximum sum of any future subarray. The maximum sum encountered during the iteration is tracked and returned as the result.

```java
public class Solution {

    public int maxSubArray(final int[] A) {
        int sum = 0;
        int max = A[0];

        for(int i : A){
            sum += i;
            max = Math.max(sum, max);
            sum = (sum < 0) ? 0 : sum;
        }

        return max;
    }
}
```
**Time complexity - O(N)**
