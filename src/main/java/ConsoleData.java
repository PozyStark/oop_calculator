import exeptions.OperationException;

import java.util.Scanner;

public class ConsoleData {

    private Scanner scanner;

    public String operation;
    public float a;
    public float b;

    public ConsoleData(Scanner scanner) throws OperationException {
        this.scanner = scanner;
        this.operation = getOperation();
        this.a = getA();
        this.b = getB();
        this.scanner.close();
    }

    private String getOperation() throws OperationException {

        System.out.print("Choose your operation (-,+,*,/):");
        String operation = this.scanner.next();
        AOperation.validateOperation(operation);
        return operation;
    }

    private float getA() {
        System.out.print("a=");
        return this.scanner.nextFloat();
    }

    private float getB() {
        System.out.print("b=");
        return this.scanner.nextFloat();
    }
}
