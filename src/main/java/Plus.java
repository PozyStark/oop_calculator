public class Plus extends AOperation {

    public static final String OPERATION_SIGN = "+";

    public Plus(float a, float b) {
        super(a, b);
    }

    @Override
    public float getResult() {
        return this.getA() + this.getB();
    }

    public String getOperationSign() {
        return OPERATION_SIGN;
    }
}
