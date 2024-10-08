public class C2_06_AssignmentIncDecOperator {
    public static void main(String[] args) {
        int a = 3, b = 3, c = 3;

        // 대입 연산자
        a += 3;
        b *= 3;
        c &= 2;
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);

        int d = 3;

        // 증감 연산자
        a = d++;
        System.out.printf("a = %d, d = %d\n", a, d);

        a = ++d;
        System.out.printf("a = %d, d = %d\n", a, d);

        a = d--;
        System.out.printf("a = %d, d = %d\n", a, d);

        a = --d;
        System.out.printf("a = %d, d = %d\n", a, d);

    }
}
