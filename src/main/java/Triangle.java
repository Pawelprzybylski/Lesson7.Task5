public class Triangle {

    public static boolean isRectangular(double a, double b, double c) {
        if (a > b + c) {
            return checkRectangularCondition(b, c, a);
        } else if (b > a + c) {
            return checkRectangularCondition(a, c, b);
        } else {
            return checkRectangularCondition(a, b, c);
        }
    }

    private static boolean checkRectangularCondition(double a, double b, double c) {
        return (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2));
    }

}