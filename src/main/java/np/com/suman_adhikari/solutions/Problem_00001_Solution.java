package np.com.suman_adhikari.solutions;

import java.util.HashMap;


public class Problem_00001_Solution {
    public static void main(String[] args) {
    }

    /**
     * Uses a HashMap for taking in compliments
     * Link: <a href="https://leetcode.com/problems/two-sum/description/">1. Two Sum</a>
     *
     * @param nums
     * @param target
     * @return int[]
     */
    public int[] twoSumWithHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> compliments = new HashMap<>();
        var result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int compliment = target - nums[i];

            if (compliments.containsKey(compliment)) {
                result = new int[]{
                        compliments.get(compliment), i
                };
                return result;
            }

            // put [number:index]
            compliments.putIfAbsent(nums[i], i);
        }


        return result;
    }
}
