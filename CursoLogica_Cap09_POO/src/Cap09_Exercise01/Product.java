package Cap09_Exercise01;

public class Product {

    final Integer MINIMUN_QUANTITY_IN_STOCK = 10;
    String name;
    Integer quantity_in_stock;

    void print_stock_check(){
        System.out.println("Item: " + name);
        System.out.print("Need to restock: "+ stock_check());
    }
    Boolean stock_check(){
        Boolean test_stock_check = quantity_in_stock < MINIMUN_QUANTITY_IN_STOCK;
        if (test_stock_check)
        {
            return true;
        }
            return false;
    }
}
