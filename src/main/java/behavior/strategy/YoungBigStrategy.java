package behavior.strategy;

public class YoungBigStrategy implements Strategy {
    @Override
    public double getPrice(int number) {
        return number * 0.8;
    }
}
