package lava.io.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class ListEntries {
    private static final String DIRNAME = "/home/aputla/tmp";
    
    public static void main(String[] args) {
        File directory = new File(DIRNAME);
        String[] entries = directory.list(new FilenameFilter() {
            @Override
            public boolean accept(File current, String name) {
                if (name.startsWith(".")) {
                    return false;
                }
                return !new File(current, name).isDirectory();
            }
        });
        System.out.println(Arrays.asList(entries));
    }
}
