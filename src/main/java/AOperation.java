public abstract class AOperation {

    private float a;
    private float b;
    private String operationSign;

    public AOperation(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public abstract float getResult();

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public String getOperationSign() {
        return operationSign;
    }

    public void setOperationSign(String operationSign) {
        this.operationSign = operationSign;
    }
}
