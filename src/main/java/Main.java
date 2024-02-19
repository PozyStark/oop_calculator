import com.sun.xml.internal.ws.util.UtilException;
import exeptions.OperationException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Выбирите операцию (+,-,*,/):");
            String operation = scanner.next();
            System.out.print("a=");
            String a = scanner.next();
            System.out.print("b=");
            String b = scanner.next();

            Calculator calculator = new Calculator(operation, a, b);
            System.out.printf("%f%s%f=%f",
                    calculator.getOperation().getA(),
                    calculator.getOperation().getOperationSign(),
                    calculator.getOperation().getB(),
                    calculator.getResult()
            );

        } catch (NullPointerException | NumberFormatException | OperationException | ArithmeticException e) {
            System.err.printf("Ошибка: %s", e.getMessage());
        }

    }

}
