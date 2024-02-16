public class Main {

    public static void main(String[] args) {
        Calculate calculate = new Calculate(new Minus(5, 6));
        calculate.printToConsole();
    }

}
