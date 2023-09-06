package Cap10_Leitura_Arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Cap10_Leitura_Arquivos
{
    public static void main(String[] args) throws IOException
    {
        Path file = Paths.get("/tmp/todo-list.txt");
        List <String> text_line = Files.readAllLines(file);

        for(int i = 0; i < text_line.size(); i++){
            String text = text_line.get(i);

            System.out.println(text);
        }
    }
}
