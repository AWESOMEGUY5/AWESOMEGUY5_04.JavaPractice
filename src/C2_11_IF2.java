import java.util.Scanner;

public class C2_11_IF2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("수를 입력하시오. : ");
        int number = scanner.nextInt();

        if (number % 3 == 0) {
            System.out.printf("3의 배수이다.");
        } else {
            System.out.printf("3의 배수가 아니다.");
        }

        scanner.close();
    }
}
