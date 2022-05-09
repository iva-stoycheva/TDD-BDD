public class Calculation {

    final int MAX_SIZE = 5;
    private String[] strArray = new String[MAX_SIZE];

    private int size;

    public int size() {
        return size;
    }
    public void addOperand(String element) {
        strArray[size++] = element;
    }

    public void addOperation(String operation) {
        if(operation == "+" || operation == "-" || operation == "*" || operation == "/") {
            strArray[size++] = operation;
        }
        else {
            throw new IllegalArgumentException("Unsupported operator!");
        }
    }

    public double calculate() {
        double result = 0;
        double first = Integer.parseInt(String.valueOf(strArray[0]));
        double second = Integer.parseInt(String.valueOf(strArray[2]));

        switch (strArray[1]) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if(second == 0) {
                    throw new ArithmeticException("Division by 0 is not possible!");
                }
                else {
                    result = Math.round((first / second) * 100.0) / 100.0;
                    break;
                }
        }
        return result;
    }
}
