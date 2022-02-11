public class Car {
    private EngineInterface engine;

    public Car(EngineInterface e) {
        engine = e;
    }

    public void start() {
        engine.start();
    }
    
}