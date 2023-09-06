//Exercício 03: Cálculo de gastos familiar

import java.util.Scanner;

public class Cap04_Exercise03 {
    public static void main(String[] agrs)
    {
        Scanner imput = new Scanner(System.in);

        Double bill_amount = 0.0;

        System.out.println("Enter a  household expenses: ");

        System.out.println("---------------------------------");
        System.out.print("Electrecity bill: ");
        bill_amount += imput.nextDouble();

        System.out.println("---------------------------------");
        System.out.print("Water bill: ");
        bill_amount += imput.nextDouble();

        System.out.println("---------------------------------");
        System.out.print("Smartphone bill: ");
        bill_amount += imput.nextDouble();

        System.out.println("---------------------------------");
        System.out.print("MArktplace bill: ");
        bill_amount += imput.nextDouble();
        
        System.out.println("---------------------------------");
        System.out.println("Expenses Total: " + bill_amount);
        imput.close();
    }
}
