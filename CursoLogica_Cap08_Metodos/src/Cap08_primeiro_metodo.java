import java.util.Scanner;

public class Cap08_primeiro_metodo
{
    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        print_trace();

        System.out.println("Enter a course below: ");

        String[] courses = new String[]{"Java", "MySql", "PHP-Laravel"};

        for(int i = 0; i < courses.length; i++)
        {
            System.out.println((i+1) + " - " + courses[i]);
        }
        Integer selected_course = imput.nextInt();

        print_trace();

        System.out.println("Enter a payment method below: ");

        String[] payment_method = new String[]{"In Cash", "On Credit"};

        for(int i = 0; i < payment_method.length; i++)
        {
            System.out.println((i+1) + " - " + payment_method[i]);
        }
        Integer selected_payment = imput.nextInt();

        print_trace();

        Boolean valid_course =  selected_course > 0 && selected_course <= courses.length;
        Boolean valid_payment = selected_payment > 0 && selected_payment <= payment_method.length;

        Boolean valited = valid_course && valid_payment;

        if (!valited)
        {
            System.err.println("Invalid Command");
            System.exit(1);
        }
        else
        {
            selected_course = selected_course - 1;
            selected_payment = selected_payment - 1;

            System.out.println("Course: " + courses[selected_course]);
            System.out.println("Payment method: " + payment_method[selected_payment]);
        }
        imput.close();
    }
    static void print_trace()
    {
        System.out.println("--------------------------------");
    }
}
