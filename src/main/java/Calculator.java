public class Calculator {
    CalculatorService calculatorService;
    public Calculator(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    public double sum(double input1, double input2) {
        return calculatorService.sum(input1,input2);
    }

    public double difference(double input1, double input2) {
        return calculatorService.difference(input1,input2);
    }

    public double product(double input1, double input2) {
        return calculatorService.product(input1,input2);
    }

    public double division(double input1, double input2) {
        return calculatorService.division(input1,input2);
    }
}
