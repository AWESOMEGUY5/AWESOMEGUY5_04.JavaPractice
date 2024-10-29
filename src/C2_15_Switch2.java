import java.util.Scanner;

public class C2_15_Switch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("커피 주문, 주문할 메뉴를 입력. : ");
        String order = scanner.next();
        int price = 0;

        switch (order) {
            case "에스프레소":
            case "카푸치노":
            case "카페라떼":
                price = 3500;
                break;
            case "아메리카노":
                price = 2000;
                break;
            default:
                System.out.printf("메뉴에 없습니다.");
        }
        if (price != 0)
            System.out.printf("%s는 %d 원입니다.", order, price);
        scanner.close();
    }
}
