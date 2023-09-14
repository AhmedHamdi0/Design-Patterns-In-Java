package Strategy;

public class StrategyMain {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        StrategyMathContext strategyContext = new StrategyMathContext();

        strategyContext.setMathStrategy(new ConcreteMathStrategyAdd());
        int add = strategyContext.executeMathStrategy(5,2);
        System.out.println(add);

        strategyContext.setMathStrategy(new ConcreteMathStrategySubtract());
        int sub = strategyContext.executeMathStrategy(5,2);
        System.out.println(sub);

        strategyContext.setMathStrategy(new ConcreteMathStrategyMultiply());
        int mul = strategyContext.executeMathStrategy(5,2);
        System.out.println(mul);
    }
}