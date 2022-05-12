public class Calculation {
    private final List integerList;

    public Calculation(List integerList) {
        this.integerList = integerList;
    }

    public boolean check(char operation) {
        if(operation == '+' || operation == '-' || operation == '*' || operation == '/') {
            return true;
        }
        else {
            throw new IllegalArgumentException("Unsupported operator!");
        }
    }

    public double calculate(char operation) {
        double result = 0;
        double firstOperand = integerList.element(0);
        double secondOperand = integerList.element(1);

        if(check(operation)) {
            switch (operation) {
                case '+': {
                    result = firstOperand + secondOperand;
                    break;
                }
                case '-': {
                    result = firstOperand - secondOperand;
                    break;
                }
                case '*': {
                    result = firstOperand * secondOperand;
                    break;
                }
                case '/': {
                    if (secondOperand == 0) {
                        throw new ArithmeticException("Division by 0 is not possible!");
                    } else {
                        result = Math.round((firstOperand / secondOperand) * 100.0) / 100.0;
                        break;
                    }
                }
            }
        }
        return result;
    }
}
