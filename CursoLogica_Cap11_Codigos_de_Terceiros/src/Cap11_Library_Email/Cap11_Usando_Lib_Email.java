package Cap11_Library_Email;


import org.apache.commons.mail.EmailException;

public class Cap11_Usando_Lib_Email
{
    public static void main(String[] args) throws EmailException
    {
       Mail root  = new Mail();
       root.send("user@email", "Hello Word", "Hello Word!");

        System.out.println("End Application");
    }
}

