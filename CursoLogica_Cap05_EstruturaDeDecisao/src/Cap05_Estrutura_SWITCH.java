import java.util.Scanner;

public class Cap05_Estrutura_SWITCH {
    
    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        System.out.println("Enter a mounth: ");
        Integer mounth = imput.nextInt();
        Double discount = 0.0;

        switch (mounth)
        {
            case 1: discount = 0.0;
                break;
            case 2: discount = 0.0;
                break;
            case 3: discount = 15.0;
                break;
            case 4: discount = 30.0;
                break;
            case 5: discount = 10.0;
                break;
            case 6: discount = 10.0;
                break;
            case 7: discount = 10.0;
                break;
            case 8: discount = 10.0;
                break;
            case 9: discount = 10.0;
                break;
            case 10: discount = 20.0;
                break;
            case 11: discount = 0.0;
                break;
            case 12: discount = 0.0;
                break;
            default: 
                System.err.println("Enter a valid mount!");
                System.exit(1);
        }

        System.out.println("Your disocunt is: " + discount);
        imput.close();
    }
}
