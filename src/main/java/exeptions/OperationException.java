package exeptions;

public class OperationException extends Exception {

    private final String operation;

    public OperationException(String message, String operation) {
        super(message);
        this.operation = operation;
    }

    public String getOperation() {
        return operation;
    }
}