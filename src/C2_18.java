import java.util.Scanner;

public class C2_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두자리수 정수 입력(10 ~ 99) >>> ");
        int a = scanner.nextInt();

        if ((a / 10) == (a % 10)) {
            System.out.print("10의 자리와 1의 자리가 같습니다.");
        } else {
            System.out.print("10의 자리와 1의 자리가 다릅니다.");
        }
        scanner.close();
    }
}
