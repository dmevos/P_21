public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        Calculator calc = new Calculator();
//        System.out.println(
//                calc.newFormula()
//                        .addOperand(5)
//                        .addOperand(15)
//                        .calculate(Calculator.Operation.MULT)
//                        .result()
//        );

        //демонстрация
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.sum(10, 22));
        System.out.println(intsCalc.pow(2, 10));

        System.out.println(intsCalc.mult(3, 10));

    }
}