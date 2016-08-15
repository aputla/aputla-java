package lava.io.buffered_reader;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WriteToFile {
    
    private static final String FILENAME = "build/one.txt";
    
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath(FILENAME);
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8, StandardOpenOption.CREATE)) {
            writer.write("hello world\n");
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }         
    }
}
