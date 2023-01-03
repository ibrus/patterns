package decorator;

public abstract class FileDecorator implements FileStream{
    FileDecorator fileDecorator;

    public FileDecorator(FileDecorator fileDecorator){
        this.fileDecorator = fileDecorator;
    }

    public abstract void read();
}
