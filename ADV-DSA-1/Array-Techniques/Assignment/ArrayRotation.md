
# Rotate Array to the Right

## Problem Description

Given an integer array `A` of size `N` and an integer `B`, return the same array after rotating it `B` times towards the right.

### Problem Constraints

- \( 1 \leq N \leq 10^5 \)
- \( 1 \leq A[i] \leq 10^9 \)
- \( 1 \leq B \leq 10^9 \)

## Solution

The goal is to rotate the array `B` times to the right, which means the last element moves to the front, and so on.

### Approach

Since rotating the array `N` times results in the same array (where `N` is the length of the array), we only need to rotate the array `B % N` times. 

The steps to solve the problem using a brute force method:
1. Create a new array to store the result.
2. Take the last `B` elements from the array `A` and fill them in the new array starting from index `0`.
3. Fill the rest of the new array with the remaining elements from the beginning of the original array.

### Code Implementation

```java
private static int[] bruteForce(int[] A, int B) {
    int N = A.length;
    // Optimize the rotation count using modulo
    B = B % N;

    // Create a new array to store the rotated result
    int[] ans = new int[N];
    int j = 0;

    // Copy the last B elements from the original array to the new array
    for (int i = N - B; i < N; i++, j++) {
        ans[j] = A[i];
    }

    // Copy the first N-B elements from the original array to the new array
    for (int i = 0; j < ans.length; i++, j++) {
        ans[j] = A[i];
    }

    // Return the rotated array
    return ans;
}
```

### Explanation

- **Step 1**: We first calculate `B % N` because rotating an array `N` times results in the same array, and rotating more than `N` times is equivalent to rotating it `B % N` times.
- **Step 2**: We create a new array of the same length as `A` to store the rotated elements.
- **Step 3**: The first part of the new array is filled with the last `B` elements of the original array.
- **Step 4**: The rest of the new array is filled with the remaining elements from the original array.
- **Step 5**: The rotated array is returned as the result.

### Time Complexity

- The time complexity of this brute-force approach is \(O(N)\), where `N` is the size of the array. This is because we are iterating through the array twice: once to copy the last `B` elements and once to copy the first `N-B` elements.

## space complexity

- O(N)
- if N is 10^9 , the RAM size is 4GB + 4GB = 8GB


# Optimized Rotate Array to the Right

## Problem Description

Given an integer array `A` of size `N` and an integer `rightRotation`, rotate the array `rightRotation` times to the right.

### Problem Constraints

- \( 1 \leq N \leq 10^5 \)
- \( 1 \leq A[i] \leq 10^9 \)
- \( 1 \leq rightRotation \leq 10^9 \)

## Optimized Solution

We can improve the brute-force approach by avoiding the use of additional space and instead modifying the array in-place. The optimized solution involves reversing parts of the array strategically to achieve the rotation.

### Approach

The core idea is to reverse the entire array, then reverse the first `rightRotation` elements and the remaining part of the array separately.

### Steps:
1. Reverse the entire array.
2. Reverse the first `rightRotation` elements.
3. Reverse the remaining part of the array.

### Code Implementation

```java
private static void optimized(int[] A, int rightRotation) {
    int N = A.length;
    // Optimize rotation count using modulo
    rightRotation = rightRotation % N;
    
    // Reverse the entire array
    reverse(A, 0, N - 1);
    
    // Reverse the first rightRotation elements
    reverse(A, 0, rightRotation - 1);
    
    // Reverse the remaining elements
    reverse(A, rightRotation, N - 1);
}

private static void reverse(int[] A, int l, int r) {
    for (int i = l, j = r; i < j; i++, j--) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}
```

### Explanation

- **Step 1**: We reverse the entire array. After this, the last element of the original array becomes the first element.
- **Step 2**: We reverse the first `rightRotation` elements so that they are in the correct order.
- **Step 3**: We reverse the remaining elements from index `rightRotation` to the end of the array, putting them in the correct order.

### Example

For an array `A = [1, 2, 3, 4, 5, 6, 7]` and `rightRotation = 3`, the steps would look like:
1. Reverse entire array: `[7, 6, 5, 4, 3, 2, 1]`
2. Reverse first 3 elements: `[5, 6, 7, 4, 3, 2, 1]`
3. Reverse remaining elements: `[5, 6, 7, 1, 2, 3, 4]`

Thus, the array is rotated 3 times to the right.

### Time Complexity

- The time complexity of this approach is \(O(N)\), where `N` is the size of the array, since we are performing three reversals on the array.
- The space complexity is \(O(1)\), as no extra space is used apart from a few variables for swapping during reversal.

