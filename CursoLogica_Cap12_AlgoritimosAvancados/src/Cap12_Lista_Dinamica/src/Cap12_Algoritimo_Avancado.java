package Cap12_Lista_Dinamica.src;

public class Cap12_Algoritimo_Avancado
{
    static final int INDEX_STUDENT_REMOVAL = 1;
    public static void main(String[] args)
    {
        Student_List student_list = new Student_List();

        Student student_0 = new Student();
        student_0.setName("Aslan");
        student_list.add(student_0);

        Student student_1 = new Student();
        student_1.setName("Noah");
        student_list.add(student_1);

        Student student_2 = new Student();
        student_2.setName("Logan");
        student_list.add(null);

        Student student_3 = new Student();
        student_3.setName("Tyler");
        student_list.add(student_3);

        Student student_4 = new Student();
        student_4.setName("Nathan");
        student_list.add(student_4);

        student_list.print_list();
        System.out.println("list size: " + student_list.size());
        System.out.println("--------------------------------------\nSort List: ");
        student_list.sort();
        student_list.print_list();

        System.out.println("--------------------------------------\nStudent Removal: ");
        student_list.student_removal(student_4);
        student_list.print_list();
        System.out.println("list size: " + student_list.size());
        System.out.println("Excluded student index: " + student_1.getName());

    }
}
