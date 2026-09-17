package week_4_problems.practice;

public class Main3 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        boolean duplicate = false;

        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    duplicate = true;
                }
            }
        }

        System.out.println(duplicate);
    }
}