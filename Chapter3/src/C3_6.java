import java.util.Scanner;

public class C3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("exit 입력 시 종료됩니다.");
        while (true) {
            System.out.print(">>> ");
            String text = scanner.nextLine();

            if (text.equals("exit")) {
                break;
            }
        }
        System.out.print("종료합니다...");
        scanner.close();
    }
}
