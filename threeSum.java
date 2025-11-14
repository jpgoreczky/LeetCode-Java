/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */
/*

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



Example: 
Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.

 */

class threeSum {
  public static void main(String[] args) {
    // 2 pointer
    // if we keep one number constant then it is like two sum problem
    // iterate through array nums


    int[] nums = {-1,0,1,2,-1,-4};

    int target = 0;

    Arrays.sort(nums);
    // [-4, -1, -1, 0, 1, 2]
    
    Set<List<Integer>> triplets = new HashSet<>(); // can't have duplicate triplets
    
    List<List<Integer>> res = new ArrayList<>();
    
    for (int i = 0; i < nums.length; i++){
      int j = i + 1;
      int k = nums.length - 1;
    
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
    
        if (sum == target) {
          triplets.add(Arrays.asList(nums[i], nums[j], nums[k]));
          j++;
          k--;
        } else if (sum < target) {
          j++;
        } else {
          k--;
        }
      }
    }
    res.addAll(triplets);

    System.out.println(res);
  }
}
