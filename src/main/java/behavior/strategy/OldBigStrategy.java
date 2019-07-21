package behavior.strategy;

public class OldBigStrategy implements Strategy {
    @Override
    public double getPrice(int number) {
        return number * 0.7;
    }
}
