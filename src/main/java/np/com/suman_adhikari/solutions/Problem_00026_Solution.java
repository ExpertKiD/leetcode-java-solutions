package np.com.suman_adhikari.solutions;

public class Problem_00026_Solution {
    /**
     * 26. Remove Duplicates from Sorted Array
     * <p>
     * Link: <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/">26. Remove Duplicates from Sorted Array</a>
     *
     * @param nums
     * @return int
     */
    public int removeDuplicates(int[] nums) {

        int k = 0;

        int currentValue = Integer.MIN_VALUE;


        for (int i = 0; i < nums.length; i++) {
            if (currentValue != nums[i]) {
                currentValue = nums[i];
                nums[k++] = currentValue;
            }
        }

        return k;

    }
}

