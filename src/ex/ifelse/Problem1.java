package ex.ifelse;

public class Problem1 {

    public static void main(String[] args) {
        int score = 0;

        if (score >= 90) {
            System.out.println("score = " + score);
            System.out.println("학점은 A입니다.");
        } else if (score >= 80) {
            System.out.println("score = " + score);
            System.out.println("학점은 B입니다.");
        } else if (score >= 70) {
            System.out.println("score = " + score);
            System.out.println("학점은 A입니다.");
        } else {
            System.out.println("score = " + score);
            System.out.println("학점은 F입니다.");
        }
    }
}
