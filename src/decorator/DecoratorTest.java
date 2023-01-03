package decorator;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class DecoratorTest {
    public static void main(String[] args) {
//        InputStream inputStream = new BufferedInputStream(new FileInputStream(new File()));
        FileStream fileStream = new FileStreamReader();
        fileStream.read();
    }
}
