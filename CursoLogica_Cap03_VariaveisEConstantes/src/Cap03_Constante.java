import java.util.Scanner;

public class Cap03_Constante
{   
    static final Integer AGE_TO_DRIVE = 18;
    public static void main (String[] args)
    {
        Scanner imput = new Scanner(System.in);

        System.out.println("Enter a your age: ");
        Integer age = imput.nextInt();
        System.out.println("---------------------------------");
        if(age >= AGE_TO_DRIVE)
        {
            System.out.println("Pass to drive.");
        }
        else
        {
            System.out.println("Not drive.");
        }
        imput.close();
    }
}
