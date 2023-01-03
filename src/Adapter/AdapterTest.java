package Adapter;

public class AdapterTest {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();
        carWash.washCar(new Audi());
        carWash.washCar(new AutoAdapter(new MyAuto()));
    }
}




