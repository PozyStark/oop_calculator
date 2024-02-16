public class Minus extends AOperation {

    public static final String OPERATION_SIGN = "-";

    public Minus(float a, float b) {
        super(a, b);
    }

    @Override
    public float getResult() {
        return this.getA() - this.getB();
    }

    @Override
    public String getOperationSign() {
        return OPERATION_SIGN;
    }
}
