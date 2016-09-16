package lava.nio.file.files;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class DoesFileExist {
    
    private static boolean doesFileExist(String filename) {
        Path path = FileSystems.getDefault().getPath(filename);
        return Files.exists(path);
    }
    
    public static void main(String[] args) {
        System.out.println(doesFileExist("src/lava/nio/file/files/DoesFileExist.java"));
        System.out.println(doesFileExist("src/lava/nio/file/files/DoesFileNotExist.java"));
    }
}
