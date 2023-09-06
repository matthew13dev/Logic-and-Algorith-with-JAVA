// 7.3. Exercício 01: Cadastrando as tarefas do dia

import java.util.Scanner;

public class Cap07_Exercise01
{
    static final Integer TODO_LIST_SIZE = 3;

    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        System.out.println("Enter with five asks bellow: ");
        String[] tasks = new String[TODO_LIST_SIZE];

        for(int i = 0; i < tasks.length; i++)
        {
            System.out.print("Task " + i + ": ");
            tasks[i] = imput.nextLine();
        }

        System.out.print("--------------------------------");
        System.out.println("Your tasks: ");

        for(int i = 0; i < tasks.length; i++)
        {
            System.out.println(i + " - " + tasks[i]);
        }
        imput.close();
    }
}
