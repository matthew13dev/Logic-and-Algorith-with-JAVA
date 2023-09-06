import java.util.Scanner;

public class Cap08_Escolhendo_Bons_Nomes
{
    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        String selected_course = user_course(imput);
        print_trace();

        String selected_payment = user_payment(imput);
        print_trace();

        System.out.println("Course selected: " + selected_course);
        System.out.println("Payment method selected: " + selected_payment);

        imput.close();
    }
    static String user_course(Scanner imput){
        String[] courses = courses_menu_list();

        print_text_nextline("Enter a code course bellow: ");
        print_array(courses);

        print_text_continue_line("Course selected: ");
        Integer user_selection = user_selection_test(courses,imput);

        return courses[user_selection];
    }
    static Integer user_selection_test(String[] array, Scanner imput){
        Integer seletion_user = imput.nextInt();
        Boolean test = seletion_user >= 0 && seletion_user < array.length;
        if (!test) {
            system_exit();
        }
        return seletion_user;
    }
    static String user_payment(Scanner imput){
        String[] payment_methods = payment_mthod_menu_list();

        print_text_nextline("Enter a payment method: ");
        print_array(payment_methods);

        print_text_continue_line("Payment selected: ");
        Integer selection_user = user_selection_test(payment_methods,imput);

        return payment_methods[selection_user];
    }
    static String[] courses_menu_list(){
        String[] courses = new String[]{"Java", "Java-EE", "Spring"};
        return courses;
    }
    static String[] payment_mthod_menu_list(){
        String[] payment_method = new String[]{"In Cash", "On Credit"};
        return payment_method;
    }

    static void print_text_nextline(String text){
        System.out.println(text);
    }
    static void print_text_continue_line(String text){
        System.out.print(text);
    }
    static void print_trace() {
        print_text_nextline("--------------------------------");
    }
    static void print_array(String[] array){
        print_array(array, 0);
    }
    static void print_array(String[] array, Integer i){
        print_text_nextline("[" + i + "] " + array[i]);
        i++;
        if(i < array.length)
        {
            print_array(array,i);
        }
    }
    static void system_exit() {
            System.err.println("Invalid Command");
            System.exit(1);
    }
    static void test_select_user (String[] list, Integer number) {
        Boolean test = number >= 0 && number < list.length;
        if (!test) {
            system_exit();
        }
    }
}
