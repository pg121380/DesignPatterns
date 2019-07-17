package creational.builder;

public class MyAirShipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    @Override
    public AirShip directAirShip() {
        Engine engine = builder.buildEngine();
        EscapeTower escapeTower = builder.buildEscapeTower();
        OrbitalModule orbitalModule = builder.buildOrbitalModule();

        AirShip myship = new AirShip();
        myship.setEngine(engine);
        myship.setEscapeTower(escapeTower);
        myship.setOrbitalModule(orbitalModule);
        return myship;
    }

    public MyAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }
}
