import java.util.Scanner;

public class Cap07_Vetores_1Dimensao
{
    public static void main(String[] args)
    {
        System.out.println("Choose a flavor: ");
        String[] menu = new String[] {"Calabresa", "Tres Queijos", "Paulista", "Toscana"};

        for(int i = 0; i < menu.length; i++)
        {
            System.out.println(i + " - " + menu[i]);
        }

        System.out.println("---------------------");

        Scanner imput = new Scanner(System.in);
        Integer option = imput.nextInt();

        System.out.println("---------------------");

        Boolean test_option = option < menu.length;
        if(test_option)
        {
            System.out.println(menu[option]);
        }
        else
        {
            System.err.print("INVALID COMMAND!");
            System.exit(1);
        }

        imput.close();
    }
}
