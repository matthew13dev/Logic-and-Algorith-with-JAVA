package Cap09_Encapsulamento;

public class Cap09_Encapsulamento
{
    public static void main(String[] args)
    {
        Client client_00 = new Client();
        client_00.setName("Matheus Henrique");
        client_00.setPhone("13996893769");

        System.out.println("Name: " + client_00.getName());
        System.out.println("Fist name: " + client_00.getFirst_name() + "\n" + "Last name: " + client_00.getLast_name());
    }
}
