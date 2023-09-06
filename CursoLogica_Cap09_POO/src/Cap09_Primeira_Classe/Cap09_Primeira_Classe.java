package Cap09_Primeira_Classe;

public class Cap09_Primeira_Classe
{
    public static void main(String[] args)
    {
        Product car = new Product();
        car.name = "civic";
        car.price = 20000.0;
        car.amount = 1;

        print_product(car);
    }
    static void print_product(Product product){
        System.out.println(product.name);
        System.out.println(product.price);
        System.out.println(product.amount);
    }
}
