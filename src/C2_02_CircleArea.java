import static java.lang.Math.pow;

public class C2_02_CircleArea {
    public static void main(String[] args) {
        double radius = 10;
        double circleArea = pow(radius, 2) * Math.PI;

        System.out.printf("%g\n", circleArea);
    }
}
