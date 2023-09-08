
//11.4. Exercício 01: Crie uma lista de tarefas e envie a lista por email

package Cap11_Exercise01;

import org.apache.commons.mail.EmailException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cap11_Exercise01
{
    static final String END_APPLICATION = "QUIT";
    public static void main(String[] args) throws EmailException
    {
        Scanner imput = new Scanner(System.in);

        Print.textln("To-do list application for email send.");Print.trace();
        Print.text("To: "); String to = imput.nextLine();

        Print.trace();

        Print.text("Subject: "); String subject = imput.nextLine();

        Print.trace();

        Print.textln("Write your task list below. Write QUIT to exit.");
        ArrayList<String> todo_list = new ArrayList<String>();

        int i = 0;
        while(true)
        {
            System.out.print("task " + i + ": ");
            String task = imput.nextLine();

            Boolean end_aplication = task.equals(END_APPLICATION);
            if(end_aplication){
                break;
            }
            todo_list.add(task);
            i++;
        }
        imput.close();
        Print.trace();

        Print.textln("Task list finished.");

        String menssage = "";
        for(i = 0; i < todo_list.size(); i++){
            menssage = menssage + todo_list.get(i) + "\n";
        }
        Print.textln("Email written completed");

        Mail root = new Mail();
        root.send(to, subject, menssage);

        Print.textln("The email has been sent.");
        Print.trace();

        Print.textln("End application.");
    }
}

