class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0; // edge case

        int longestStreak = 0;
    
        // hashset o(1) lookup
        HashSet<Integer> numSet = new HashSet<>();

        for (int num : nums) {  // o(n)
            numSet.add(num);
        }

        for (int num : numSet) { // o(1)
            if (!numSet.contains(num - 1)) {
                int currNum = num;
                int currStreak = 1;

                // count how long the streak is
                while (numSet.contains(currNum + 1)) {
                    currNum++;
                    currStreak++;
                }

                longestStreak = Math.max(longestStreak, currStreak);
            } 
            
        }

        
        return longestStreak;
    }
}