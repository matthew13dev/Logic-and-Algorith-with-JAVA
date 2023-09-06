// Exercício 02: Calcule o bônus do funcionário(a)

import java.util.Scanner;

public class Cap05_Exercise02 {

    static final Double BILLING_GOAL_PERCENT = 0.8;
    static final Double AVERAGE_WAGE_PERCENT = 0.8;
    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter a billing goal: ");
        Double billing_goal = imput.nextDouble();

        System.out.print("Enter a acctual billing: ");
        Double actual_billing = imput.nextDouble();

        System.out.print("Enter a average wage: ");
        Double average_wage = imput.nextDouble();

        System.out.println("-----------------------------------");
        
        Double billing_goal_percent_calc = billing_goal * BILLING_GOAL_PERCENT;

        Boolean bonus_test = actual_billing >= billing_goal;
        Boolean bonus_percent_test = actual_billing < billing_goal && actual_billing >= billing_goal_percent_calc;

        if(bonus_test)
        {
            System.out.println("Bonus: " + average_wage);
        }
        else
        {
            if(bonus_percent_test)
            {
                Double percent_bonus = average_wage * AVERAGE_WAGE_PERCENT;
                System.out.println("Final bonus: " + percent_bonus);
            }
            else
            {
                System.out.println("Not bonus this year.");
            }
        }



        imput.close();
    }
}
