public class Multiply extends AOperation {

    public Multiply(float a, float b) {
        super(a, b);
        this.setOperationSign("*");
    }

    @Override
    public float getResult() {
        return this.getA() * this.getB();
    }

}
