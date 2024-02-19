import exeptions.OperationException;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

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

    @Test(expected = OperationException.class)
    public void wrongOperationTest() throws OperationException {
        Calculator calculator = new Calculator("8", "5", "6");
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerTest() throws OperationException {
        Calculator calculator0 = new Calculator(null, "5", "6");
        Calculator calculator1 = new Calculator("+", null, "6");
        Calculator calculator2 = new Calculator("+", "5", null);
    }

    @Test(expected = ArithmeticException.class)
    public void arithmeticExceptionTest() throws OperationException {
        Calculator calculator0 = new Calculator("/", "5", "0");
        Calculator calculator1 = new Calculator("/", "0", "0");
    }

    @Test(expected = NumberFormatException.class)
    public void numberFormatExceptionTest() throws OperationException {
        Calculator calculator0 = new Calculator("/", "a", "0");
        Calculator calculator1 = new Calculator("/", "0", "b");
    }

    @Test
    public void calculatorTest() throws OperationException {
        Calculator calculator = new Calculator("+", "5", "6");
        Assert.assertEquals("Значение должно быть 11", 11,  calculator.getResult(), 0);
    }
}
