public class Solution {
    public int RemoveDuplicates(int[] nums) {
        var x = 1;
        for (int y = 1; y < nums.Length; y++) {
            if (nums[y] != nums[x - 1])
            {
                nums[x] = nums[y];
                x++;
            }
        }
        return x;
    }
}