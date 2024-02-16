public class Plus extends AOperation {

    public Plus(float a, float b) {
        super(a, b);
        this.setOperationSign("+");
    }

    @Override
    public float getResult() {
        return this.getA() + this.getB();
    }
}
