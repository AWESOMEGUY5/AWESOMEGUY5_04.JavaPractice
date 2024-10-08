import java.util.Scanner;

public class C2_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오. >>>");
        int money = scanner.nextInt();

        System.out.println("5만원권 " + money / 50000 + "매");
        System.out.println("1만원권 " + money % 50000 / 10000 + "매");
        System.out.println("5천원권 " + money % 50000 % 10000 / 5000 + "매");
        System.out.println("1천원권 " + money % 50000 % 10000 % 5000 / 1000 + "매");
        System.out.println("500원 " + money % 50000 % 10000 % 5000 % 1000 / 500 + "개");
        System.out.println("100원 " + money % 50000 % 10000 % 5000 % 1000 % 500 / 100 + "개");
        System.out.println("50원 " + money % 50000 % 10000 % 5000 % 1000 % 500 % 100 / 50 + "개");
        System.out.println("10원 " + money % 50000 % 10000 % 5000 % 1000 % 500 % 100 % 50 / 10 + "개");
    }
}
