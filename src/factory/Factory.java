package factory;

public class Factory {

    public Car create(String carType){
        switch (carType){
            case "Toyota" : return new Toyota();
            case "BMW" : return new BMW();
            case "Mazda" : return new Mazda();
            default: return null;
        }
    }
}
