public class Cap04_Operadores_Logicos {
    public static void main(String[]args)
    {
        Boolean carrinho_maior_100 = true;
        Boolean epoca_promocao = false;
        Boolean cliente_loja = true;
        Boolean pagameto_abista = true;

        Boolean aplicar_desconto = carrinho_maior_100 && (epoca_promocao || cliente_loja) && pagameto_abista;

        if(aplicar_desconto)
        {
            System.out.println("Sim! Desconto aplicado");
        }
        else
        {
            System.out.println("Não! Sem desconto disponivel");
        }
    }
}
