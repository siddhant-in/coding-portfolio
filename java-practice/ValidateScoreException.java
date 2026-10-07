import java.util.*;

class InvalidScoreException extends Exception {
    InvalidScoreException(String message) {
        super(message);
    }
}

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public void validateScore() throws InvalidScoreException {
        if (score < 0 && score > 100) {
            throw new InvalidScoreException("Invalid score " + score + " Score must be between 0 and 100.");
        }
    }

}

public class ValidateScoreException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name ");
        String name = sc.nextLine();
        System.out.print("Enter score: ");
        int score = sc.nextInt();

        Student student = new Student(name, score);
        try {
            student.validateScore();
            System.out.println("Score is valid");
        } catch (Exception e) {
            System.out.println("Exception caught :" + e.getMessage());
        } finally {
            System.out.println("Finally executed");
        }
    }
}
