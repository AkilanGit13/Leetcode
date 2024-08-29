## Problem 2 - Continuous Sum Query

There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin (according to their faith and ability) to some K beggars sitting next to each other.

Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
For the `ith` devotee, `B[i][0] = L, B[i][1] = R, B[i][2] = P`, given by the 2D array B.

### Problem Constraints

- 1 <= A <= 2 * 10<sup>5</sup>
- 1 <= L <= R <= A
- 1 <= P <= 10<sup>3</sup>
- 0 <= len(B) <= 10<sup>5</sup>

### Input Format

- The first argument is a single integer A.
- The second argument is a 2D integer array B.

### Output Format

Return an array (0-based indexing) that stores the total number of coins in each beggar's pot.

## Example Input

**Input 1:**

A = 5  
B = \[\[1, 2, 10\], \[2, 3, 20\], \[2, 5, 25\]\]

## Example Output

**Output 1:**

10 55 45 25 25

### Example Explanation

**Explanation 1:**

First devotee donated 10 coins to beggars ranging from 1 to 2. Final amount in each beggar's pot after the first devotee: \[10, 10, 0, 0, 0\]

Second devotee donated 20 coins to beggars ranging from 2 to 3. Final amount in each beggar's pot after the second devotee: \[10, 30, 20, 0, 0\]

Third devotee donated 25 coins to beggars ranging from 2 to 5. Final amount in each beggar's pot after the third devotee: \[10, 55, 45, 25, 25\]

### Brute Force

Initialize an empty array C of size A.  
For every devotee, add the amount from L to R in the array C.

**Time Complexity:**  
O(B.length * A)

```java
public class Solution {
    public int[] solve(int A, int[][] B) {
        int[] C = new int[A];

        for(int i = 0; i < B.length; i++){
            for(int j = B[i][0]-1; j < B[i][1]; j++){
                C[j] += B[i][2];
            }
        }
        return C;
    }
}
```

### Optimal Approach - Lazy Sum

- Initialize an empty array `C`.
- For every devotee, add the amount only in `C[L-1]` and subtract the same amount in `C[R]`.
- Finally prefix sum the array C.
  ![continuous sum query](https://github.com/user-attachments/assets/b9c01bf8-b6ed-4003-ac90-70c9450e897d)
**Time Complexity**  
O(B.length + A)

```java
public class Solution {
    public int[] solve(int A, int[][] B) {
        int[] C = new int[A];

        for(int i = 0; i < B.length; i++){
            int L = B[i][0], R = B[i][1], P = B[i][2];
            C[L-1] += P;
            if(R < A){
                C[R] -= P;
            }
        }

        for(int i = 1; i < A; i++){
            C[i] += C[i-1];
        }

        return C;
    }
}
```
