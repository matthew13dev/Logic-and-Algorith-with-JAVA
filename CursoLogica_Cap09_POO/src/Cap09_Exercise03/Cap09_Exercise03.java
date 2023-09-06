// 9.7. Exercício 03: Exibindo os dados de um pedido
package Cap09_Exercise03;

public class Cap09_Exercise03
{
    public static void main(String[] args)
    {
        Pedido pedido_00 = new Pedido();

        pedido_00.setCode(00);
        pedido_00.setDiscount(10.0);
        pedido_00.setSubtotal(100.0);

        pedido_00.print();
    }
}
