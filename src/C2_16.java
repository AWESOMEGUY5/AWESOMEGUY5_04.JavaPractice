import java.util.Scanner;

public class C2_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("철수 >>");
        String a = scanner.next(); // 철수

        System.out.print("영희 >>");
        String b = scanner.next(); // 영희

        if(a.equals(b)) {
            System.out.print("비겼습니다.");
        }
        else if (a.equals("가위")) {
            if (b.equals("보")) {
                System.out.print("철수가 이겼습니다.");
            } else {
                System.out.print("영희가 이겼습니다.");
            }
        }
        else if (a.equals("바위")) {
            if (b.equals("보")) {
                System.out.print("철수가 이겼습니다.");
            } else {
                System.out.print("영희가 이겼습니다.");
            }
        }
        else {
            if (b.equals("바위")) {
                System.out.print("철수가 이겼습니다.");
            } else {
                System.out.print("영희가 이겼습니다.");
            }
        }
    }
}
