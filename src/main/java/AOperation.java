import com.sun.istack.internal.NotNull;
import exeptions.OperationException;

public abstract class AOperation {

    public static final String PLUS_OPERATION = "+";
    public static final String MINUS_OPERATION = "-";
    public static final String MULTIPLY_OPERATION = "*";
    public static final String DIVIDE_OPERATION = "/";

    private float a;
    private float b;

    public AOperation(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public abstract float getResult();

    public abstract String getOperationSign();

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }
}
