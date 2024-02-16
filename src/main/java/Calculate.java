public class Calculate {

    private AOperation operation;

    public Calculate(AOperation operation) {
        this.operation = operation;
    }

    public void printToConsole() {
        System.out.printf("%.4f%s%.4f=%.4f", this.operation.getA(), this.operation.getOperationSign(), this.operation.getB(), this.operation.getResult());
    }
}
