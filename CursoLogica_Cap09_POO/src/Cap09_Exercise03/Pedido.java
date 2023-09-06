package Cap09_Exercise03;

public class Pedido
{
    Integer code;
    Double subtotal;
    Double discount;

    void print(){
        Print.trace();
        Print.text_integer("Code: ", getCode());
        Print.text_double("Discount: ", getDiscount());
        Print.text_double("Subtotal: ", getSubtotal());
        Print.text_double("Total: ", getTotal());
    }
    Integer getCode(){
        return this.code;
    }
    void setCode(Integer code){
        this.code = code;
    }

    Double getSubtotal(){
        return this.subtotal;
    }
    void setSubtotal(Double subtotal){
        this.subtotal = subtotal;
    }

    Double getDiscount(){
        return this.discount;
    }
    void setDiscount(Double discount){
        this.discount = discount;
    }

    Double getTotal(){
        return getSubtotal() - getDiscount();
    }
}
