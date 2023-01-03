package Adapter;

public class AutoAdapter implements Car{
    Auto auto;

    public AutoAdapter(Auto auto){
        this.auto = auto;
    }

    @Override
    public void wash() {
        auto.clean();
    }
}
