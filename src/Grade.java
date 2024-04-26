public class Grade {
    public char getLetterGrade(double score) {
        if (score >= 4.0) {

            return 'A';
        } else if (score >= 3.7) {
            return 'A';
        } else if (score >= 3.3) {
            return 'A';
        } else if (score >= 3.0) {
            return 'B';
        } else if (score >= 2.7) {
            return 'B';
        } else if (score >= 2.3) {
            return 'B';
        } else if (score >= 2.0) {
            return 'C';
        } else if (score >= 1.7) {
            return 'C';
        } else if (score >= 1.3) {
            return 'C';
        } else if (score >= 1.0) {
            return 'D';
        } else if (score >= 0.7) {
            return 'D';
        } else if (score >= 0.3) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static void main(String[] args) {
        Grade gradeCalculator = new Grade();
        double[] scores = {4.0, 3.7, 3.3, 3.0, 2.8, 2.5, 2.0, 1.7, 1.3,
                1.0, 0.7, 0.5, 0.0};
        for (double score : scores) {
            System.out.println("Score: " + score + " => Grade: " +
                    gradeCalculator.getLetterGrade(score));
        }
    }
}
