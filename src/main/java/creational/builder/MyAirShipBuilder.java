package creational.builder;

public class MyAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine buildEngine() {
        return new Engine("my Engine");
    }

    @Override
    public OrbitalModule buildOrbitalModule() {
        return new OrbitalModule("my OrbitalModule");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        return new EscapeTower("my EscapeTower");
    }
}
