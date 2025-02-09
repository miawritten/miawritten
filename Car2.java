public class Car2 {
    String model;
    int year;
    Engine engine;
    Car2(String model, int year, String engineType) {
        this.model = model;
        this.year = year;
        this.engine = new Engine(engineType);
    }
    void start(){
        this.engine.start();
        System.out.println("The "+ this.model +" model is running.");
    }
}
