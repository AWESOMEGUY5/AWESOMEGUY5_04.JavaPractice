import java.util.Scanner;

public class C2_13_NestedIF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학년을 입력하시오. : ");
        int year = scanner.nextInt();
        System.out.print("성적을 입력하시오. : ");
        int grade = scanner.nextInt();

        if (year < 4 && grade >= 60) {
            System.out.println("합격");
        } else if(year == 4 && grade >= 70) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
        scanner.close();
    }
}
