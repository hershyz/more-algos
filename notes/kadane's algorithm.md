### Kadane's Algorithm
```java
    //Finding the max sum subarray:
    public int maxSubArray(int[] nums) {
        
        int max = nums[0];
        int curr = max;
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i] + curr, nums[i]);
            max = Math.max(curr, max);
        }
        
        return max;
    }
```

One pass through the entire arrray to find the subarray with the greatest sum. <br>
First assumes that the max sum is at the 0th element of the array. <br>
Either adds the next array element to the current sum, or starts the current sum over. <br>
Then, sets the max value to the current sum if the current sum is greater.
