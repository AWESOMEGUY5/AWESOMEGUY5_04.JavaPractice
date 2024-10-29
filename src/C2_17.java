import java.util.Scanner;

public class C2_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원화를 입력하시오(단위 : 원) >>> ");
        int won = scanner.nextInt();

        System.out.printf("%d원은 $%.1f 입니다.", won, won / 1100.0);
        scanner.close();
    }
}
