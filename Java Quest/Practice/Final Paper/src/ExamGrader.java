public class ExamGrader {
    public void gradeExam(int score) {
        try {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Invalid score. Score must be between 0 and 100.");
            }
            if (score >= 70) {
                System.out.println("Congratulations! You passed the exam with a score of " + score);
            } else {
                System.out.println("Sorry, you failed the exam with a score of " + score);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Exam grading completed");
        }
    }
 
    public static void main(String[] args) {
        ExamGrader grader = new ExamGrader();
        grader.gradeExam(85);
        grader.gradeExam(55);
        grader.gradeExam(120);
    }
}
