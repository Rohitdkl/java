import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        String fileName = "output.txt";
        String message = "Hello, world!";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(message);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }
}
