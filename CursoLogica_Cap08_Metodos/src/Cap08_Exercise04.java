// 8.9. Exercício 04: Exibir a tabuada de um número qualquer

import java.util.Scanner;

public class Cap08_Exercise04 {
    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);
        Integer number_user = enter_user_value("Enter a number: ", imput);

        print_result_tabuada(number_user);
        imput.close();
    }
    static void print_result_tabuada(Integer number){
        final Integer end_tabuada = 10;
        calc_tabuada(number,0, end_tabuada);
    }
    static void calc_tabuada(Integer number, Integer i, Integer j){
        Integer mult = number * i;
        System.out.println(number + "x" + i + " = " + mult);
        i++;
        if(i <= j)
        {
            calc_tabuada(number, i, j);
        }
    }
    static Integer enter_user_value(String text, Scanner scan){
        print_text(text);
        Integer number = scan.nextInt();
        print_trace();

        return number;
    }
    static void print_text(String text){
        System.out.print(text);
    }
    static void print_trace(){
        System.out.println("-------------------------------");
    }
}
