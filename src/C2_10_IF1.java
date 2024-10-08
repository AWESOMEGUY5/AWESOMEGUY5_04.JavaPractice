import java.util.Scanner;

public class C2_10_IF1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("점수를 입력하시오. : ");
        int score = scanner.nextInt();

        if (score >= 80) {
            System.out.printf("합격");
        }

        scanner.close();
    }
}
