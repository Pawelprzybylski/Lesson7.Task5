import org.junit.Assert;
import org.junit.Test;
public class TriangleTest {

    @Test
    public void shouldBeNotRectangularWhenAHigherThanSumAAndB() {
        //given
        double a = 10;
        double b = 4;
        double c = 3;
        //when
        boolean triangleVerification = Triangle.isRectangular(a, b, c);
        //then
        Assert.assertFalse(triangleVerification);
    }

    @Test
    public void shouldBeNotRectangularWhenBHigherThanSumCAndB() {
        //given
        double a = 4;
        double b = 10;
        double c = 3;
        //when
        boolean triangleVerification = Triangle.isRectangular(a, b, c);
        //then
        Assert.assertFalse(triangleVerification);
    }

    @Test
    public void shouldBeRectangular() {
        //given
        double a = 3;
        double b = 4;
        double c = 5;
        //when
        boolean triangleVerification = Triangle.isRectangular(a, b, c);
        //then
        Assert.assertTrue(triangleVerification);
    }

    @Test
    public void shouldBeNotRectangular() {
        //given
        double a = 4;
        double b = 4;
        double c = 4;
        //when
        boolean triangleVerification = Triangle.isRectangular(a, b, c);
        //then
        Assert.assertFalse(triangleVerification);
    }

}
