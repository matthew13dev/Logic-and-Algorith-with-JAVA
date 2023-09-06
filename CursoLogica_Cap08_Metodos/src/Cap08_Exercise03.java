// 8.7. Exercício 03: Crie uma pequena calculadora de subtração e adição

import java.util.Scanner;

public class Cap08_Exercise03
{
    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        Integer first_number = value_user("Enter a first number to operation: ",imput);
        Integer second_number = value_user("Enter a second number to operation: ", imput);

        print_trace();
        print_text_outline("Select a operation of math below: ");

        String[] list = new String[]{"SUM", "SUBTRACTION"};
        for(int i = 0; i < list.length; i++)
        {
            System.out.println(i + " - " + list[i]);
        }
        Integer operation_math = value_user("Operation selected: ",imput);
        print_trace();

        Integer result = calc(first_number, second_number,operation_math);
        System.out.print("Result: " + result);

        imput.close();
    }
    static Integer calc (Integer first_number, Integer second_number, Integer operation){
        Integer total = 0;

        switch (operation)
        {
            case 0: total = addition(first_number,second_number);
                break;
            case 1: total = subtraction(first_number,second_number);
                break;
            default: system_exit();
        }
        return total;
    }
    static Integer subtraction (Integer number1, Integer number2){
        Integer sub = number1 - number2;
        return sub;
    }
    static Integer addition (Integer number1, Integer number2){
        Integer sum = number1 + number2;
        return sum;
    }
    static void system_exit(){
        System.err.print("Invalid Command!");
        System.exit(1);
    }
    static void print_trace(){
        print_text_outline("------------------------------------------");
    }
    static void print_text_inline(String text){
        System.out.print(text);
    }
    static void print_text_outline(String text){
        System.out.println(text);
    }

    static Integer value_user (String text, Scanner imput){

        print_text_inline(text);
        Integer number = imput.nextInt();
        return number;
    }
}
