public class C2_03_TypeConversion {
    public static void main(String[] args) {
        byte b = 127;
        int i = 100;

        System.out.printf("%d", b + i);
        System.out.println(10 / 4);
        System.out.println(10 / 2.0);
        System.out.println(0x12340041);
        System.out.println((byte)(b + i));
        System.out.println((int)2.1 + 4.2);
        System.out.println((int)(2.1 + 4.2));
        System.out.println((int)2.1 + (int)4.2);
    }
}
