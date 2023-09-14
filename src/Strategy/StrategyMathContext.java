package Strategy;

public class StrategyMathContext {
    private MathStrategy mathStrategy;

    public void setMathStrategy(MathStrategy mathStrategy) {
        this.mathStrategy = mathStrategy;
    }

    public int executeMathStrategy(int a, int b){
        return this.mathStrategy.execute(a, b);
    }
}
