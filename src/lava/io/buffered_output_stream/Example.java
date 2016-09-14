package lava.io.buffered_output_stream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example {
    public static void main(String[] args) {
        try (BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream("textfile.txt"))) {
            stream.write("hello world".getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
