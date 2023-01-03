package decorator;

public class FileStreamReader implements FileStream{
    @Override
    public void read() {
        System.out.println("read file");
    }
}
