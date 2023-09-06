//10.3. Exercício 01: Crie uma lista de tarefas e salve a lista em um arquivo
package Cap10_Exercise01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cap10_Exercise01
{
    static final String END_APPLICATION = "quit";
    public static void main(String[] args) throws IOException
    {
        Scanner imput = new Scanner(System.in);
        ArrayList <String> todo_list = new ArrayList<String>();

        Methods.println("To-do List");
        Methods.println("Write quit to quit program.");

        String text = null;

        int i = 1;
        while(true)
        {
            System.out.print("Task " + i + " - ");
            text = imput.nextLine();

            if(text.equals(END_APPLICATION)) {
                break;
            }
            todo_list.add(text);
            i++;
        }
        imput.close();

        Methods.write_in_file("/tmp/todo-list.txt",todo_list);
        Methods.println("End application.");
    }
}
