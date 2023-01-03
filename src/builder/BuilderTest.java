package builder;

public class BuilderTest {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.CarBuilder()
                .setName("Audi")
                .setColor("white")
                .setMaxSpeed(250)
                .build();
    }
}

class SportCar{
    private String name;
    private String color;
    private String engine;
    private int maxSpeed;


    private SportCar(CarBuilder builder){
        this.name = builder.name;
        this.color = builder.color;
        this.engine = builder.engine;
        this.maxSpeed = builder.maxSpeed;
    }

    static class CarBuilder{
        private String name;
        private String color;
        private String engine;
        private int maxSpeed;

        public CarBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public SportCar build(){
            return new SportCar(this);
        }
    }

}
