package facade;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FacadeTest {
    public static void main(String[] args) throws IOException {
        System.out.println(new Facade().readFromFile());
    }
}

class Facade{
    public StringBuilder readFromFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("temp.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        return stringBuilder;
    }
}