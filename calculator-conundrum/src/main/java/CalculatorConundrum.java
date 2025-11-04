class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {

        int result = 0;
        try {

            if (operation == null)
                throw new IllegalArgumentException("Operation cannot be null");

            switch (operation) {
                case "+":
                    result = operand1 + operand2;
                    break;
                case "-":
                    result = operand1 - operand2;
                    break;
                case "*":
                    result = operand1 * operand2;
                    break;
                case "/":
                    result = operand1 / operand2;
                    break;
                case "":
                    throw new IllegalArgumentException("Operation cannot be empty");
                default:
                    throw new IllegalOperationException("Operation '" + operation + "' does not exist");
            }
        } catch (ArithmeticException ae) {
            throw new IllegalOperationException("Division by zero is not allowed", ae);
        }

        return String.format("%d %s %d = %d", operand1, operation, operand2, result);
    }
}
