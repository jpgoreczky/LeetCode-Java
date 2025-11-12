class Solution {
    public int[] twoSum(int[] nums, int target) {
        // 2 pointers
        // p1 starts at the beginning of the array and p2 starts at the end of the array

        // if the sume of p1 and p2 > target, move p2 left (smaller sum)
        // if the sum of p1 and p2 < target, move p1 right (bigger sum)

        // O(N*N)
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    break;
                } else if (nums[i] + nums[j] == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}


// you can create a hashmap to see if required number exists without searching and get the index of 
// it through value of the element in key - value pair
// O(1)

    //    HashMap<Integer, Integer> map = new HashMap<>();

    //    for (int i = 0; i < nums.length; i++) {
    //         if (map.containsKey(target - nums[i])) {
    //             return new int[] {i, map.get(target-nums[i])};
    //         }
    //         map.put(nums[i], i);
    //    }
    //    return new int[] {-1,-1};