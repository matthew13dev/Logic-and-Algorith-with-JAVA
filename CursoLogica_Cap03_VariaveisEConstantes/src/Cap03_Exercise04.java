import java.util.Scanner;

public class Cap03_Exercise04 {
    
    public static void main (String[]args)
    {
        Scanner imput = new Scanner(System.in);

        Double product_price = imput.nextDouble();
        Integer product_amount = imput.nextInt();

        Integer feels = 10;
        Double sub_total = product_amount * product_price;
        Double total = 0.0;

        if(product_amount >= feels)
        {
            total = sub_total * feels / 100;
            System.out.println(total);
        }
        else
        {
            total = sub_total;
            System.out.println(total);
        }
        
        imput.close();
    }
}
