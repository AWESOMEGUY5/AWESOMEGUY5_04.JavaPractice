import java.util.Scanner;

public class C2_05_ArithmeticOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("정수 입력 : ");
        int time = scanner.nextInt();
        int hour = time / 3600;
        int minute = (time / 60) % 60;
        int second = time % 60;

        System.out.printf("%d 초는 %d 시간 %d 분 %d 초입니다.\n", time, hour, minute, second);

    }
}
