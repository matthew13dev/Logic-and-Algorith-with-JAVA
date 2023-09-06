package Cap09_Metodo_Instancia;

public class Client
{
    String first_name;
    String last_name;
    String email;
    String phone;
    String print_complete_name(){
        String complete_name = first_name + " " + last_name;
        return complete_name;
    }
    String obtain_ddd(){
        String ddd_phone = phone.substring(0, 2);
        return ddd_phone;
    }

}
