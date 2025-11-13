class Solution {
    public int lengthOfLongestSubstring(String s) {
        // input: string s
        // output: length of the longest substring
        // sliding window?

        // hashset? - add characters of string into a hashset, once a duplicate letter is found it return the number of letters (size of set) 
        // hashsets don't contain any duplicates

        //brute force - nested for loop iterating over the entire string

        int maxLength = 0;
        int len = s.length();
        int j = 0; // second pointer

        Set<Character> charSet = new HashSet<>();

        // i is the first pointer
        for (int i = 0; i < len; i++) {
            //  at the start the set is empty
            // if the current char isn't in the set, it adds it and keeps track of the length
            // while the current char is in the set, it'll remove the original duplicate char from the set
            // and increment the second pointer to the next index
            // until the set no longer has the duplicate characters in the set, it'll add the current char
            // into the set and the the first pointer increments from the for loop
            if (!charSet.contains(s.charAt(i))) {
                charSet.add(s.charAt(i));
                maxLength = Math.max(maxLength, i - j +1);
            } else {
                // hit a duplicate char
                while(charSet.contains(s.charAt(i))) {
                    charSet.remove(s.charAt(j));
                    j++;
                }
                charSet.add(s.charAt(i));
            }
        }
        return maxLength;
    }
}