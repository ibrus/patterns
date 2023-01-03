package factory;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Car toyota = factory.create("Toyota");
        Car mazda = factory.create("Mazda");
        Car bmw = factory.create("BMW");
        bmw.drive();
    }
}

