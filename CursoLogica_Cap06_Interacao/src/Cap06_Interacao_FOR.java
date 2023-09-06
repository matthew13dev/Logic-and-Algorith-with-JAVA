public class Cap06_Interacao_FOR {
    public static void main(String[] args)
    {
        Integer products[] = new Integer[] {300, 400, 100};

        for(int i = 0; i <+ products.length; i = i + 1)
        {
            Integer product = products[i];
            System.out.println("Product code: " + product);

            if(product.equals(100))
            {
                System.out.println("Product encontrado: " + product);
                break;
            }
        }
    }
}
