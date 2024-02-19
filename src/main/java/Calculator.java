import com.sun.istack.internal.NotNull;
import exeptions.OperationException;

public class Calculator {

    private AOperation operation;
    private float result;

    public Calculator(
            @NotNull String operation,
            @NotNull String a,
            @NotNull String b
    ) throws OperationException, NumberFormatException, NullPointerException, ArithmeticException {
        this.operation = getValidOperation(operation, Float.parseFloat(a), Float.parseFloat(b));
        this.result = this.operation.getResult();
    }

    private AOperation getValidOperation(String operation, float a, float b) throws OperationException {
        if (operation.equals(Plus.OPERATION_SIGN)) {
            return new Plus(a, b);
        }
        if (operation.equals(Minus.OPERATION_SIGN)) {
            return new Minus(a, b);
        }
        if (operation.equals(Multiply.OPERATION_SIGN)) {
            return new Multiply(a, b);
        }
        if (operation.equals(Divide.OPERATION_SIGN)) {
            return new Divide(a, b);
        }
        throw new OperationException("Операция не соответсвует списку допустимых");
    }

    public AOperation getOperation() {
        return operation;
    }

    public float getResult() {
        return result;
    }
}
