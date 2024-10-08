import java.util.Scanner;

public class C2_12_IF_ELSE1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char grade;

        System.out.print("성적을 입력하시오. : ");
        int score = scanner.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        } else if (score >= 60) {
            grade = 'B';
        } else {
            grade = 'F';
        }
        System.out.printf("학점은 %c 입니다.", grade);

        scanner.close();
    }
}
