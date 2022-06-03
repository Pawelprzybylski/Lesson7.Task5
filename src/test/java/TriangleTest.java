import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
    @Test
    public void shouldTriangleIsRectangular() {
        //given
        double a = 3;
        double b = 4;
        double c = 5;
        //when
        boolean triangleVerification = Triangle.checkingTriangleIsRectangular(a, b, c);
        //then
        Assert.assertEquals(true, triangleVerification);
    }

    @Test
    public void shouldTriangleIsNonRectangular() {
        //given
        double a = 4;
        double b = 4;
        double c = 4;
        //when
        boolean triangleVerification = Triangle.checkingTriangleIsRectangular(a, b, c);
        //then
        Assert.assertEquals(false, triangleVerification);
    }

}
