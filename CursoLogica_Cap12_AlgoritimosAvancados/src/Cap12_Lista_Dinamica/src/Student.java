package Cap12_Lista_Dinamica.src;

public class Student
{
    private String name;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
       return name;
    }

    boolean student_ahead(Student student){
        boolean valid_student = student != null;
        if(!valid_student)
        {
            return false;
        }
        return name.compareTo(student.name) > 0;
    }
}
