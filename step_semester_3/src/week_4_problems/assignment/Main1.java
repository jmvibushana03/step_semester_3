package week_4_problems.assignment;
public class Main1 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int[] answer = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            answer[i] = 1;

            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    answer[i] = answer[i] * nums[j];
                }
            }
        }

        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}