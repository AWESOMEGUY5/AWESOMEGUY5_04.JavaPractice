public class C2_07_LogicalOperator {
    public static void main(String[] args) {
        System.out.println('a' > 'b');
        System.out.println(3 >= 2);
        System.out.println(-1 < 0);
        System.out.println(4.2 <= 2);
        System.out.println(3 == 2);
        System.out.println(2 != 2);
        System.out.println(!(3 != 2));

        // 비교 연산 및 논리연산 복합
        System.out.println((3 > 2) && (3 < 4));
        System.out.println((3 != 2) || (3 < 4));
        System.out.println((3 != 2) ^ (3 > 4));

    }
}
