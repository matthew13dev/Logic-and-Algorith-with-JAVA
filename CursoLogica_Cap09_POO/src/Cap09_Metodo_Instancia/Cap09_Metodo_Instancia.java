package Cap09_Metodo_Instancia;

import java.io.PrintStream;

public class Cap09_Metodo_Instancia
{
    public static void main(String[] args)
    {
        Client cliente_00 = new Client();
        cliente_00.first_name = "Matheus";
        cliente_00.last_name = "Mendes";
        cliente_00.email = "matthew.dev@outlook.com";
        cliente_00.phone = "13996893769";

        System.out.println( "Cliente name: " + cliente_00.print_complete_name());
        System.out.print("DDD Phone: " + cliente_00.obtain_ddd());
    }
}
