package lava.util.stream.stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesLinesExample {
    public static void main(String[] args) throws IOException {
        String filename = "./src/lava/utils/streams/FilesLinesExample.java";
        long count = Files.lines(Paths.get(filename), Charset.defaultCharset())
                         .count();
        System.out.println("count:" + count);
    }
}
