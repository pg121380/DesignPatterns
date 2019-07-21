package behavior.strategy;

public class YoungLittleStrategy implements Strategy {
    @Override
    public double getPrice(int number) {
        return number;
    }
}
