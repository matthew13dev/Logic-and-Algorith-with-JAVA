import java.util.Scanner;

public class Cap03_AlterandoValorProduto
{
    public static void main(String[]args)
    {
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter a product price: ");
        Double product_price = imput.nextDouble();

        System.out.println("Enter a pay type: ");
        System.out.println("1: avista ");
        System.out.println("2: a prazo");
        Integer pay_type = imput.nextInt();

        Boolean pay_avista = pay_type.equals(1);
        Boolean pay_aprazo = pay_type.equals(2);

        Double fees = 0.0;
        Double total = 0.0;
        if(pay_avista)
        {
            total = product_price;
            System.out.println("pagamento avista: " + total);
        }
        else if (pay_aprazo)
        {
            fees = 1.1;
            total = product_price * fees;

            System.out.println("pagamento a prazo: " + total);

        }
        else
        {
            System.err.println("digito invalido!");
        }


    

        imput.close();
    }
}