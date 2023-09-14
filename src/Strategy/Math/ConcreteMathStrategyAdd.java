package Strategy.Math;

public class ConcreteMathStrategyAdd implements MathStrategy {
    @Override
    public int execute(int a, int b) {
        return (a + b);
    }
}
