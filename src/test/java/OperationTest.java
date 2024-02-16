import org.junit.Assert;
import org.junit.Test;

public class OperationTest {

    @Test
    public void plusTest() {
        Plus plus = new Plus(5, 5);
        Assert.assertEquals("Значение должно равняться 10", 10, plus.getResult(), 0);
    }

    @Test
    public void minusTest() {
        Minus plus = new Minus(5, 5);
        Assert.assertEquals("Значение должно равняться 10", 0, plus.getResult(), 0);
    }

    @Test
    public void multiplyTest() {
        Multiply plus = new Multiply(5, 5);
        Assert.assertEquals("Значение должно равняться 10", 25, plus.getResult(), 0);
    }

    @Test
    public void divideTest() {
        Divide plus = new Divide(5, 5);
        Assert.assertEquals("Значение должно равняться 10", 1, plus.getResult(), 0);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZeroTest() {
        Divide plus = new Divide(1, 0);
        plus.getResult();
    }

    @Test(expected = ArithmeticException.class)
    public void divideZeroByZeroTest() {
        Divide plus = new Divide(0, 0);
        plus.getResult();
    }
}
