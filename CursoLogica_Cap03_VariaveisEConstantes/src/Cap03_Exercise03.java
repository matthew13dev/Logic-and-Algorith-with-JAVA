import java.util.Scanner;

public class Cap03_Exercise03
{
    static final Integer NOTE_PASS = 60;
    public static void main(String[]args)
    {
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter a note: ");
        Integer note = imput.nextInt();

        Boolean pass = note >= NOTE_PASS;

        if(pass)
        {
            System.out.println("Pass");
        }
        else{
            System.out.println("Acess Delined!");
        }
        imput.close();
    }
}
