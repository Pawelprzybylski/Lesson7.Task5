public class Triangle {


    public static boolean checkingTriangleIsRectangular(double a, double b, double c) {
        if (Math.pow(c, 2) == Math.pow(a, 2) + Math.pow(b, 2)) {
            return true;
        } else {
            return false;
        }

    }

}