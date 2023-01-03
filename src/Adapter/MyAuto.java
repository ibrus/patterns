package Adapter;

public class MyAuto implements Auto {
    @Override
    public void clean() {
        System.out.println("clean auto");
    }
}
