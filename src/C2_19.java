import java.util.Scanner;

public class C2_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("금액을 입력하시오. >>>");
        int money = scanner.nextInt();

        if(money >= 50000) {
            int count = money / 50000;
            money %= 50000;
            System.out.printf("5만원 %d 매\n", count);
        }

        if(money >= 10000) {
            int count = money / 10000;
            money %= 10000;
            System.out.printf("1만원 %d 매\n", count);
        }

        if(money >= 5000) {
            int count = money / 5000;
            money %= 5000;
            System.out.printf("5천원 %d 매\n", count);
        }

        if(money >= 1000) {
            int count = money / 1000;
            money %= 1000;
            System.out.printf("1천원 %d 매\n", count);
        }

        if(money >= 500) {
            int count = money / 500;
            money %= 500;
            System.out.printf("500원 %d 매\n", count);
        }

        if(money >= 100) {
            int count = money / 100;
            money %= 100;
            System.out.printf("100원 %d 매\n", count);
        }

        if(money >= 50) {
            int count = money / 50;
            money %= 50;
            System.out.printf("50원 %d 개\n", count);
        }

        if(money >= 10) {
            int count = money / 10;
            money %= 10;
            System.out.printf("10원 %d 개\n", count);
        }
    }
}
