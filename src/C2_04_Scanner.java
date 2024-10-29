import java.util.Scanner;

public class C2_04_Scanner {
    public static void main(String[] args) {
        System.out.println("이름, 도시, 나이, 체중 독신 여부를 분리하여 입력하시오.");
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        System.out.print("이름 : " + name + ", ");

        String city = scanner.next();
        System.out.print("도시 : " + city + ", ");

        int age = scanner.nextInt();
        System.out.print("나이 : " + age + ", ");

        double weight  = scanner.nextDouble();
        System.out.print("도시 : " + weight + ", ");

        boolean isSingle = scanner.nextBoolean();
        System.out.print("도시 : " + isSingle + ", ");
        scanner.close();
    }
}
