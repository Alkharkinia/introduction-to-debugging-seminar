package debugtrie;

public class logical {

	public static double calculateGPA(int[] grades, int[] credits) {
        int totalCredits = 0;
        double totalPoints = 0.0;

        for (int i = 0; i < grades.length; i++) {
            totalCredits += credits[i];

            totalPoints += convertToGPA(grades[i]) * credits[i];
        }

        return totalPoints / totalCredits;
    }

    public static double convertToGPA(int grade) {
        if (grade >= 90) return 4.0;
        else if (grade >= 85) return 3.5;
        else if (grade >= 80) return 3.0;
        else if (grade >= 75) return 2.5;
        else if (grade >= 70) return 2.0;
        else if (grade >= 60) return 1.5;
        else if (grade >= 50) return 1.0;
        else return 0.0;
    }

    public static void main(String[] args) {
        int[] grades = {85, 75, 90};   // A, B, C
        int[] credits = {3, 4, 2};     // different course weights

        double gpa = calculateGPA(grades, credits);
        System.out.printf("Calculated GPA: %.2f", gpa);
    }

}
