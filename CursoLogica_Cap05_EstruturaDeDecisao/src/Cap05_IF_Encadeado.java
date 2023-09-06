import java.util.Scanner;

public class Cap05_IF_Encadeado {
    
    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter a your weigth: ");
        Double user_weight = imput.nextDouble();

        final Double max_light_weight = 60.0;
        final Double max_medium_weight = 90.0;
        final Double max_hard_weight = 120.0;
        final Double inapt = 50.0;

        Boolean weight_valid = user_weight >= inapt && user_weight <= max_hard_weight;

        Boolean light_weight = user_weight <= max_light_weight;
        Boolean medium_weight = user_weight <= max_medium_weight;
        
        if(weight_valid)
        {
            if(light_weight)
            {
                System.out.println("Light weight.");
            }
            else
            {
                if(medium_weight)
                {
                    System.out.println("Medium weight");
                }
                else
                {
                    System.out.println("Hard Weight.");
                }
            }
        }
        else
        {
            System.out.println("INAPT.");
        }
        imput.close();
    }
}
