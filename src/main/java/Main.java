import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculate calculate = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your operation (-,+,*,/):");
        String operation = scanner.next();

        System.out.print("a=");
        float a = scanner.nextFloat();
        System.out.print("b=");
        float b = scanner.nextFloat();

        if (operation.equals(Plus.OPERATION_SIGN)) {
            calculate = new Calculate(new Plus(a, b));
        }
        if (operation.equals(Minus.OPERATION_SIGN)) {
            calculate = new Calculate(new Minus(a, b));
        }
        if (operation.equals(Multiply.OPERATION_SIGN)) {
            calculate = new Calculate(new Multiply(a, b));
        }
        if (operation.equals(Divide.OPERATION_SIGN)) {
            calculate = new Calculate(new Divide(a, b));
        }

        if (calculate != null) {
            try {
                calculate.printToConsole();
            } catch (ArithmeticException e) {
                System.err.printf("Выполнение завершено с ошибкой: %s", e.getMessage());
            }

        }
    }

}
