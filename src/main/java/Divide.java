public class Divide extends AOperation {

    public Divide(float a, float b) {
        super(a, b);
        this.setOperationSign("/");
    }

    @Override
    public float getResult() {
        return this.getA() / this.getB();
    }


}
