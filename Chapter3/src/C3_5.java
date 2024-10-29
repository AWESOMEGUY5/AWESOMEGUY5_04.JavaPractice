import java.util.Scanner;

public class C3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.print("정수를 5개 입력하세요. >>> ");
        for (int i = 0; i < 5; i++) {
            int n = scanner.nextInt();
            if (n <= 0) {
                continue;
            } else {
                sum += n;
            }
        }
        System.out.printf("양수의 합은 %d 입니다.\n", sum);
        scanner.close();
    }
}
