package Strategy.Math;

public class ConcreteMathStrategyMultiply implements MathStrategy{
    @Override
    public int execute(int a, int b){
        return a * b;
    }
}
