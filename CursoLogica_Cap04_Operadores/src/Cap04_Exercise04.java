//Exercício 04: Verificação da possibilidade de aposentadoria 

import java.util.Scanner;

public class Cap04_Exercise04 {

    static final Integer MINIMUN_AGE = 55;
    static final Integer MINIMUN_TIME = 25;
    public  static void main(String[]args)
    {
        Scanner imput = new Scanner(System.in);

        System.out.print(("Enter a your age: "));
        Integer user_age = imput.nextInt();

        System.out.print("Enter a time: ");
        Integer user_time = imput.nextInt();

        Boolean test_minimun_age = user_age >= MINIMUN_AGE;
        Boolean test_minimun_time = user_time >= MINIMUN_TIME;

        if(test_minimun_age && test_minimun_time)
        {
            System.out.println("YES! You are retiree.");
        }
        else
        {
            System.out.println("NOT. Your aren't retiree");
        }
        imput.close();
    }
}
