package Cap09_Encapsulamento;

public class Client
{
    String first_name;
    String last_name;
    String phone;

    String getFirst_name(){
        return first_name;
    }
    void setFirst_name(String first_name){
        this.first_name = first_name;
    }
    String getLast_name(){
        return last_name;
    }
    void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    String getName(){
        return first_name + " " + last_name;
    }
    void setName (String name) {
        String[] full_name = name.split(" ");
        first_name = full_name[0];
        last_name = full_name[1];
    }
    String getPhone(){
        return this.phone;
    }
    void setPhone(String phone){
        this.phone = phone;
    }
}
