package lava.io.file;

import java.io.File;
import java.nio.file.FileSystems;

public class CreateDirectory {
    public static void main(String[] args) {
        File directory = FileSystems.getDefault().getPath("/home/aputla/tmp/delete_it").toFile();
        directory.mkdirs();
    }
}
