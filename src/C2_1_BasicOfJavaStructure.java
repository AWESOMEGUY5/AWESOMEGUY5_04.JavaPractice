public class C2_1_BasicOfJavaStructure {
    // 메소드, 클래스의 맴버 함수를 자바에서 메소드러고 한다.
    public static int sum(int n, int m) {
        return n + m;
    }

    // main() 키워드, 한 클래스에 하나만 들어갈 수 있으며 여러 클래스인 경우 실행을 시작할 클래스에만 들어간다.
    public static void main(String[] args) {
        // 변수 선언과 문장
        int i = 20;
        int s = sum(i, 20);
        char a = '?';

        //화면 출력
        System.out.println(a);
        System.out.println("Hello");
        System.out.printf("%d", s);
        System.out.print(a + "\n");
    }
}
