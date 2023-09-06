package Cap10_Exercise01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Methods
{
    static void write_in_file(String file, ArrayList<String> list) throws IOException {
        Path path = Paths.get(file);
        Files.write(path, list);
    }

    static void println(String text){
        System.out.println(text);
    }

}
