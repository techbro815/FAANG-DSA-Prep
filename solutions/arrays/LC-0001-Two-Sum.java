// Core Idea: Use a map to store needed complement; if seen, return indices.
// Brute: Check all pairs -> O(n^2).
// Optimal: One-pass hash map -> O(n) time, O(n) space.
// Pattern: Hashing / One-pass lookup.

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> pos = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (pos.containsKey(need)) return new int[]{pos.get(need), i};
            pos.put(nums[i], i);
        }
        return new int[]{-1, -1}; // unreachable for valid inputs
    }
}
