package Cap10_Escrita_Arquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Cap10_Escrita_Arquivos
{
    public static void main(String[] args) throws IOException
    {
        ArrayList <String> text = new ArrayList <String>();
        Scanner imput = new Scanner(System.in);

        for(int i = 0; i < 5; i++){
            System.out.print("Player " + i + ": ");
            String player_name = imput.nextLine();
            text.add(player_name);
        }

        Path file = Paths.get("/tmp/todo-list.txt");
        Files.write(file, text);

        System.out.println("End...");
    }
}
