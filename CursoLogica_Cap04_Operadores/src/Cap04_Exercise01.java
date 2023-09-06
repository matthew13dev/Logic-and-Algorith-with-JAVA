//Exercício 01: Calculadora simples

import java.util.Scanner;

public class Cap04_Exercise01
{
    public static void main(String[] args)
    {
            Scanner imput = new Scanner(System.in);

            Double first_number = imput.nextDouble();
            Integer operation = imput.nextInt();
            Double second_number = imput.nextDouble();

            Double result = 0.0;

            if(operation.equals(1))
            {
                result = first_number + second_number;
            }
            else if(operation.equals(2))
            {
                result = first_number - second_number;
            }
            else if(operation.equals(3))
            {
                result = first_number * second_number;
            }
            else if(operation.equals(4))
            {
                result = first_number - second_number;
            }
            else
            {
                System.out.println("Invalid Command!.");
            }

            System.out.println("Result: " + result);
            imput.close();
    }
}
