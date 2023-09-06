//9.3. Exercício 01: Método que informa necessidade de repor estoque

package Cap09_Exercise01;

public class Cap09_Exercise01
{
    public static void main(String[] args)
    {
        Product coxinha = new Product();
        coxinha.name = "coxinha de frango";
        coxinha.quantity_in_stock = 13;

        coxinha.print_stock_check();
    }

}
