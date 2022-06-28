package leatcode;

public class TwoSum {
    public static void main(String[] args) {
       int[] nums = {2,7,11,15};
       int target = 9;

       int[] result = twoSum(nums, target);
       System.out.println(result[0]);
       System.out.println(result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        int sum = 0;
        int x = 0;
        int y = 0;

        for (int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                sum = target - nums[i];
                if(nums[j] == sum) {
                    result = new int[]{i, j};
                }
            }
        }


        return result;
    }
}
