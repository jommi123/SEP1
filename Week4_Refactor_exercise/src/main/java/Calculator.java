public class Calculator {

    public double calculate(Operation operation, double a, double b) {
        return switch (operation) {
            case ADD -> a + b;
            case SUBTRACT -> a - b;
            case MULTIPLY -> a * b;
            case DIVIDE -> {
                if (b == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero");
                }
                yield a / b;
            }
            default -> throw new IllegalArgumentException("Unsupported operation: " + operation);
        };
    }

    public enum Operation {
        ADD, SUBTRACT, MULTIPLY, DIVIDE, EXPONENT
    }

}