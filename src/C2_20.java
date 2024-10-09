import java.util.Scanner;

public class C2_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 3개를 입력하시오. >>> ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 < number2) {
            if (number2 < number3) {
                System.out.print("중간 값은 " + number2 + "\n");
            } else if (number1 < number3) {
                System.out.print("중간 값은 " + number3 + "\n");
            } else {
                System.out.print("중간 값은 " + number1 + "\n");
            }
        } else {
            if (number2 > number3) {
                System.out.print("중간 값은 " + number2 + "\n");
            } else if (number1 > number3) {
                System.out.print("중간 값은 " + number3 + "\n");
            } else {
                System.out.print("중간 값은 " + number1 + "\n");
            }
        }
        scanner.close();
    }
}

