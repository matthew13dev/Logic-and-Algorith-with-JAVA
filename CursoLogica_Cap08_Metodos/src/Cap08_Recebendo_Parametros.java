import java.util.Scanner;

public class Cap08_Recebendo_Parametros
{
    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        print_trace();
        print_text("Enter a course below: ");

        String[] courses = new String[]{"Java", "MySql", "PHP-Laravel"};
        print_array1(courses);

        Integer selected_course = imput.nextInt();
        Boolean valid_course =  selected_course > 0 && selected_course <= courses.length;

        valid_process(valid_course);

        print_trace();
        print_text("Enter a payment method below: ");

        String[] payment_method = new String[]{"In Cash", "On Credit"};
        print_array1(payment_method);

        Integer selected_payment = imput.nextInt();
        Boolean valid_payment = selected_payment > 0 && selected_payment <= payment_method.length;

        valid_process(valid_payment);
        print_trace();

        selected_course = selected_course - 1;
        selected_payment = selected_payment - 1;

        print_text("Course: " + courses[selected_course]);
        print_text("Payment method: " + payment_method[selected_payment]);

        imput.close();
    }
    static void print_text(String text){
        System.out.println(text);
    }
    static void print_trace() {
        System.out.println("--------------------------------");
    }
    static void valid_process(Boolean test) {
        if(!test)
        {
            System.err.println("Invalid Command");
            System.exit(1);
        }
    }
    static void print_array1(String[] array1){
        for(int i = 0; i < array1.length; i++)
        {
            System.out.println("[" + (i+1) + "] " + array1[i]);
        }
    }
}


