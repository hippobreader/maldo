import java.util.*;;
public class Maldo_Lab_Exam_no1 {
    public static int findLongestConsecutiveSequence(int[] nums) {
        if (nums.length == 0) return 0;

        
        Arrays.sort(nums);

        int longestStreak = 1;
        int currentStreak = 1;

        for (int i = 1; i < nums.length; i++) {
            
            if (nums[i] == nums[i - 1] + 1) {
                currentStreak++;
            }
            
            else if (nums[i] != nums[i - 1]) {
                longestStreak = Math.max(longestStreak, currentStreak);
                currentStreak = 1;
            }
        }

        
        return Math.max(longestStreak, currentStreak);
    }
}

