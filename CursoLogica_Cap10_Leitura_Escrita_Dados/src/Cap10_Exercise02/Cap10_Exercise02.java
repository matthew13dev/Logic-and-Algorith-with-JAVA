//10.5. Exercício 02: Mostre a lista de tarefas para o usuário

package Cap10_Exercise02;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cap10_Exercise02
{
    static final String FILE_DIRETORY = "/tmp/task_list.txt";
    static final String END_APPLICATION = "QUIT";
    public static void main(String[] args) throws IOException
    {
        Methods.println_text("Application to write to-do list user.");
        Methods.println_text("write QUIT to end application.");
        Methods.print_trace();

        Scanner imput = new Scanner(System.in);
        ArrayList<String> todo_list = new ArrayList<String>();

        int i = 0;
        while(true)
        {
            System.out.print("task " + i + ": ");
            String text_line = imput.nextLine();

            Boolean end_aplication = text_line.equals(END_APPLICATION);
            if(end_aplication){
                break;
            }
            todo_list.add(text_line);
            i++;
        }
        Methods.write_file(FILE_DIRETORY, todo_list);

        imput.close();

        Methods.println_text("Your task list: ");
        Methods.print_trace();

        List<String> list = Methods.read_file(FILE_DIRETORY);

        for(i = 0; i < todo_list.size(); i++){
            String text_line = todo_list.get(i);
            Methods.println_text(text_line);
        }
    }
}
