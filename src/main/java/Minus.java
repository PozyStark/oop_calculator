public class Minus extends AOperation {

    public Minus(float a, float b) {
        super(a, b);
        this.setOperationSign("-");
    }

    @Override
    public float getResult() {
        return this.getA() - this.getB();
    }


}
