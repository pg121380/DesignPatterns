package structural.decorate;

public class FlyCar extends SuperCar{
    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("飞");
    }

    @Override
    public void move(){
        super.move();
        this.fly();
    }
}
