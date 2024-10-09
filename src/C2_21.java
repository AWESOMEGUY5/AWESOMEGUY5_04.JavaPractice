import java.util.Scanner;

public class C2_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개를 입력하시오. >>>");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            System.out.print("삼각형이 됩니다.\n");
        } else {
            System.out.print("삼각형이 아닙니다.\n");
        }

        scanner.close();
    }
}
