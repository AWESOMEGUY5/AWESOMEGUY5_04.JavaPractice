public class C1_01_Hello1 {
    public static int sum(int i, int j) {
        return i + j;
    }
    public static void main(String[] args) {
        final int TEN = 10;
        int i = 1, j = sum(i, TEN);
        char a = '?';
        String b = "Hello";

        System.out.println(a);
        System.out.println(b);
        System.out.println(TEN);
        System.out.println(j);
    }
}
