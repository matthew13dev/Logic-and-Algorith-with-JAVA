import java.util.Scanner;

public class Cap08_Recursividade
{
    public static void main(String[] args)
    {

        Scanner imput = new Scanner(System.in);
        print_trace();

        print_text("Enter a code course below: ");
        String[] courses = new String[]{"Java", "MySql", "PHP-Laravel"};

        print_array(courses);
        Integer selected_course = enter_value_user("Course selected: ",imput );

        test_select_menu(courses,selected_course);
        print_trace();

        print_text("Enter a payment method below: ");
        String[] payment_method = new String[]{"In Cash", "On Credit"};

        print_array(payment_method);
        Integer selected_payment = enter_value_user("Payment method selected: ", imput);

        test_select_menu(payment_method,selected_payment);
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
    static void print_text_continue_line(String text){
        System.out.print(text);
    }
    static void print_trace() {
        print_text("--------------------------------");
    }
    static void print_array(String[] array){
       print_array1(array,0);
    }

    static void print_array1(String[] array1, Integer i){
        print_text("[" + (i+1) + "] " + array1[i]);
        if(++i < array1.length) {
            print_array1(array1, i);
        }
    }
    static void system_exit() {
        System.err.println("Invalid Command");
        System.exit(1);
    }
    static void test_select_menu (String[] list, Integer number) {
        Boolean test = number > 0 && number <= list.length;
        if (!test) {
            system_exit();
        }
    }
    static Integer enter_value_user(String text,Scanner imput){
        print_text_continue_line(text);
        Integer number = imput.nextInt();

        return number;
    }
}
