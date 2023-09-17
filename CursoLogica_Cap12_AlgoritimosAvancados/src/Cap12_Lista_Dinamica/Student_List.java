package Cap12_Lista_Dinamica;

public class Student_List
{
    static final int MAX_BASE_LIST_SIZE = 2;
    Student[] list = new Student[MAX_BASE_LIST_SIZE];
    int current_list_size = 0;
    Student get_student(int index){
        return list[index];
    }
    int get_size_list(){
        return current_list_size;
    }
    void print_list(){
        for(int i = 0; i < get_size_list(); i++)
        {
            Student student = get_student(i);
            Boolean test_valid_student = student != null;
            if(test_valid_student){
                System.out.println("Student " + i + ": " + student.getName());
            }
            else
            {
                System.out.println("Student " + i + ":unnamed" );
            }
        }
    }
    void student_add(Student new_student){

        Boolean test_max_size = current_list_size == list.length;
        if(test_max_size)
        {
            Student[] new_list = new Student[MAX_BASE_LIST_SIZE + list.length];
            for(int i = 0; i < list.length; i++)
            {
                new_list[i] = get_student(i);
            }
            list = new_list;
        }
        list[current_list_size] = new_student;
        current_list_size++;
    }
    void student_removal(Student student_to_remove){
        for(int i = 0; i < current_list_size; i++) {
            Student student = get_student(i);

            boolean test_student_to_remove = (student != null) && student.equals(student_to_remove);
            if(test_student_to_remove){
                remove_calc(i);
                break;
            }
            else
            {
                boolean test_null = student == null && student_to_remove == null;
                if(test_null)
                {
                    remove_calc(i);
                    break;
                }
            }
        }
    }
    void remove_calc(int index){
        int initial_index = index + 1;
        for(int i = initial_index; i < current_list_size; i++){
            int final_index = i - 1;
            list[final_index] = list[i];
        }
        current_list_size--;
        list[current_list_size] = null;
    }
    void sort_list() {
        for(int i = 1; i < get_size_list(); i++)
        {
            int index_position_base = i;
            Student student_base_position = get_student(i);

            boolean test = index_position_base > 0;
            while(test)
            {
                int index_previous_position = index_position_base - 1;
                Student previus_student_position = get_student(index_previous_position);

                boolean test_student_behind_previus = previus_student_position == null
                        || test_student_ahead(previus_student_position,student_base_position);

                if(test_student_behind_previus)
                {
                    list[index_position_base] = get_student(index_previous_position);
                    index_position_base--;
                }
                else {
                    break;
                }
                list[index_position_base] = student_base_position;
            }
        }

    }
    boolean test_student_ahead(Student student_previus, Student student_base){
        boolean valid_student = student_base != null;
        if(!valid_student)
        {
            return false;
        }
        return student_previus.getName().compareTo(student_base.getName()) > 0;
    }

}
