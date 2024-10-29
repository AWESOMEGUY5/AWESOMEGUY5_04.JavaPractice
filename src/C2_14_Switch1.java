import java.util.Scanner;

public class C2_14_Switch1 {
    public static void main(String[] args) {
        char grade;

        System.out.print("학점을 입력하시오. : ");
        Scanner scanner = new Scanner(System.in);

        int score = scanner.nextInt();

        switch (score / 10) {
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.printf("학점은 %c 입니다.", grade);
        scanner.close();
    }
}
