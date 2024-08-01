public class MissingNumberFinder {

    public static int findMissingNumber(int[] nums) {
        int n = nums.length;
        // Calculate expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;
        
        // Calculate actual sum of numbers in the array
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        
        // The missing number is the difference between expected and actual sum
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        // Example usage
        int[] nums = {3, 0, 1};
        int missingNumber = findMissingNumber(nums);
        System.out.println("The missing number is " + missingNumber);
    }
}
