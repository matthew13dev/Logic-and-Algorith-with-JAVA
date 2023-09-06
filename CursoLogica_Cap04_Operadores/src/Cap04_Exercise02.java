import java.util.Scanner;

public class Cap04_Exercise02 {
//Exercício 02: Cálculo de frete do produto

    static final Double FREIGHT_PRICE = 15.0;
    static final Double FREIGHT_FREE = 100.0;

    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        Double product_price = imput.nextDouble();

        Double total = 0.0;

        if(product_price <= FREIGHT_FREE)
        {
            total = product_price + FREIGHT_PRICE;
        }
        else
        {
            total = product_price;
        }

        System.out.println(total);

        imput.close();
    }
}
