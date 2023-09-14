package Strategy.Math;

public class ConcreteMathStrategySubtract implements MathStrategy{
    @Override
    public int execute(int a, int b) {
        return (a - b);
    }
}
