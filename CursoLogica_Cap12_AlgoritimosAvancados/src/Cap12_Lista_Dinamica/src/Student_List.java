package Cap12_Lista_Dinamica.src;

public class Student_List
{
    static final int LIST_SIZE = 5;
    Student[] list = new Student[LIST_SIZE];

    int list_size = 0;

    Student get(int index){
        return list[index];
    }
    int size(){
        return list_size;
    }
    void add(Student student){

        Boolean max_size = list_size == list.length;
        if(max_size)
        {
            Student[] new_list = new Student[LIST_SIZE + list.length];
            for(int i = 0; i < list.length; i++)
            {
                new_list[i] = list[i];
            }
            list = new_list;
        }
        list[list_size] = student;
        list_size++;
    }
    void removal_index_student(int index){
        student_removal(list[index]);
    }
    void student_removal(Student student){
        for(int i = 0; i < list_size; i++) {
            Student student1 = list[i];

            Boolean test = (student1 != null) && student1.equals(student);
            if(test){
                remove_calc(i);
                break;
            }
            else
            {
                Boolean test1 = student1 == null && student == null;
                if(test1)
                {
                    remove_calc(i);
                    break;
                }
            }
        }
    }
    void remove_calc(int index){
        int initial_index = index + 1;
        for(int i = initial_index; i < list_size; i++){
            int final_index = i - 1;
            list[final_index] = list[i];
        }
        list_size--;
        list[list_size] = null;
    }
    void print_list(){
        for(int i = 0; i < size(); i++)
        {
            Student student = get(i);
            Boolean test = student != null;
            if(test){
                System.out.println("Student " + i + ": " + student.getName());
            }
            else
            {
                System.out.println("Student " + i + ":unnamed" );
            }
        }
    }
    void sort()
    {
        for(int i = 1; i < list_size; i++)
        {
            Student student_base_position = list[i];
            int index_position_base = i;

            boolean test = index_position_base > 0;
            while(test)
            {
                int index_previous_position = index_position_base - 1;
                Student previus_position_student = list[index_previous_position];

                boolean test_student_behind_after_of = previus_position_student == null
                        || previus_position_student.student_ahead(student_base_position);

                if(test_student_behind_after_of)
                {
                    list[index_position_base] = list[index_previous_position];
                    index_position_base--;
                }
                else
                {
                    break;
                }
                list[index_position_base] = student_base_position;
            }
        }

    }











}
