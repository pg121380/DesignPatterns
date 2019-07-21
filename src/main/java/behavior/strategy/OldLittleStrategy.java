package behavior.strategy;

public class OldLittleStrategy implements Strategy {
    @Override
    public double getPrice(int number) {
        return number * 0.9;
    }
}
