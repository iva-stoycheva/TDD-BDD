import java.util.ArrayList;
import java.util.List;

public class Calculation {
    List<Integer> integerList = new ArrayList<Integer>();

    public int size() {
        return integerList.size();
    }
    public void addOperand(int element) {
        integerList.add(element);
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
        double firstOperand = Integer.parseInt(String.valueOf(integerList.get(0)));
        double secondOperand = Integer.parseInt(String.valueOf(integerList.get(1)));

        if(check(operation)) {
            switch (operation) {
                case '+':
                    result = firstOperand + secondOperand;
                    break;
                case '-':
                    result = firstOperand - secondOperand;
                    break;
                case '*':
                    result = firstOperand * secondOperand;
                    break;
                case '/':
                    if (secondOperand == 0) {
                        throw new ArithmeticException("Division by 0 is not possible!");
                    } else {
                        result = Math.round((firstOperand / secondOperand) * 100.0) / 100.0;
                        break;
                    }
            }
        }
        return result;
    }
}
