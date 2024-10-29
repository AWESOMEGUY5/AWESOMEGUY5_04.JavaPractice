import java.util.Scanner;

public class C3_2 {
    public static void main(String[] args) {
        int count = 0, sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하고 마지막에 -1을 입력하시오.");

        int n = scanner.nextInt();
        while (n != -1) {
            sum = sum + n;
            count++;
            n = scanner.nextInt();
        }

        if (count == 0) {
            System.out.print("입력된 수가 없습니다.");
        } else {
            System.out.printf("정수의 개수는 %d 개이며 평균은 %f 입니다.", count, (double)sum/count);
        }
    }
}
