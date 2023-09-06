// Exercício 03: Imprima o nome do dia da semana (domingo, segunda-feira, etc.)

import java.util.Scanner;

public class Cap05_Exercise03 {
    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter a weekday of 1 to 7; ");
        Integer weeekday = imput.nextInt();

        String day = "";
        switch(weeekday)
        {
            case 1: day = "Sunday"; 
                break;
            case 2: day = "Monday"; 
                break;
            case 3: day = "Tuesday"; 
                break;
            case 4: day = "Wednesday"; 
                break;
            case 5: day = "Thursday"; 
                break;
            case 6: day = "Friday"; 
                break;
            case 7: day = "Saturday"; 
                break;

            default:
                System.err.println("Invalid command!");
                System.exit(1);
        }
        System.out.println("-----------------------------------");
        System.out.println("WeekDay: " + day);
        imput.close();
    }
}
