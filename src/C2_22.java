import java.util.Scanner;

public class C2_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("1 ~ 99 사이의 정수를 입력하시오. >>> ");
        int a = scanner.nextInt();

        if (a / 10 % 3 == 0 && a % 3 == 0) {
            System.out.print("박수짝짝\n");
        } else {
            System.out.print("박수짝\n");
        }
    }
}
