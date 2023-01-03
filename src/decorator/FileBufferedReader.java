package decorator;

public class FileBufferedReader extends FileDecorator {

    public FileBufferedReader(FileDecorator fileDecorator){
        super(fileDecorator);
    }
    @Override
    public void read() {
        fileDecorator.read();
        System.out.println("buffered read");
    }
}
