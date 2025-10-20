package Seminar;

public class DebugExampleQuestion {
    public static void main(String[] args) {
        int[] numbers = {11, 20, 30, 40, 51};
        double average = calculateAverage(numbers);
        System.out.println("Average: " + average);
    }

    public static double calculateAverage(int[] nums) {
        int sum = 0;

        for (int i = 0; i <= nums.length; i++) { 
            sum += nums[i];
        }

        double average = sum / nums.length; 
        return average;
    }
}
