import com.sun.xml.internal.ws.util.UtilException;
import exeptions.OperationException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        try {
            Calculate calculate = null;
            ConsoleData consoleData = new ConsoleData(new Scanner(System.in));
            if (consoleData.operation.equals(Plus.OPERATION_SIGN)) {
                calculate = new Calculate(new Plus(consoleData.a, consoleData.b));
            }
            if (consoleData.operation.equals(Minus.OPERATION_SIGN)) {
                calculate = new Calculate(new Minus(consoleData.a, consoleData.b));
            }
            if (consoleData.operation.equals(Multiply.OPERATION_SIGN)) {
                calculate = new Calculate(new Multiply(consoleData.a, consoleData.b));
            }
            if (consoleData.operation.equals(Divide.OPERATION_SIGN)) {
                calculate = new Calculate(new Divide(consoleData.a, consoleData.b));
            }
            calculate.printToConsole();
        }
        catch (OperationException | ArithmeticException e) {
            System.err.printf("Выполнение завершено с ошибкой: %s", e.getMessage());
        }
        catch (InputMismatchException e) {
            System.err.printf("Выполнение завершено с ошибкой: %s", "Значение должно быть числом");
        }

    }

}
