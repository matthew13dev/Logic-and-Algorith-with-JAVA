package Cap10_Exercise02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Methods
{
    static void write_file(String file_directory, ArrayList<String> line_text) throws  IOException{
        Path path = Paths.get(file_directory);
        Files.write(path,line_text);
    }

    static List<String> read_file(String file) throws IOException {
        Path path = Paths.get(file);
        return Files.readAllLines((path));
    }
    static void print_trace(){
        println_text("-----------------------------------------");
    }
    static void println_text(String text){
        System.out.println(text);
    }
}
