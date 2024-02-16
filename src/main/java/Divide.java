public class Divide extends AOperation {

    public static final String OPERATION_SIGN = "/";

    public Divide(float a, float b) {
        super(a, b);
    }

    @Override
    public float getResult() throws ArithmeticException{
        float result = this.getA() / this.getB();
        if (Float.valueOf(result).isInfinite()) {
            throw new ArithmeticException("Dividing by zero");
        }
        if (Float.valueOf(result).isNaN()) {
            throw new ArithmeticException("Dividing zero by zero");
        }
        return result;
    }

    @Override
    public String getOperationSign() {
        return OPERATION_SIGN;
    }
}
