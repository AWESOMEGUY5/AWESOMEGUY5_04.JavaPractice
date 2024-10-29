public class C2_09_BitOperator {
    public static void main(String[] args) {
        short a = (short)0x55FF;
        short b = (short)0x00FF;

        System.out.printf("%04X\n", (short)(a & b));
        System.out.printf("%04X\n", (short)(a | b));
        System.out.printf("%04X\n", (short)(a ^ b));
        System.out.printf("%04X\n", (short)(~a));

        byte c = 20, d = -8;

        System.out.printf("%d\n", c << 2);
        System.out.printf("%d\n", c >> 2);
        System.out.printf("%d\n", d >> 2);
        System.out.printf("%X\n", d >>> 2);
    }
}
