public class Cap05_Estrutura_IF
{
    public static void main(String[]args)
    {
        Double emprestimo = 4000.0;
        Double movimentacao_media = 2000.0;

        Boolean movimento_pelo_menos_metade_do_valor = (movimentacao_media) * 2 >=  emprestimo;
        Boolean conta_com_tempo_suficiente = true;
        Boolean nome_limpo = true;

        Boolean liberar_emprestimo = movimento_pelo_menos_metade_do_valor && conta_com_tempo_suficiente && nome_limpo;

        if(liberar_emprestimo)
        {
            System.out.println("YES. Pode liberar emprestimmo.");
        }else{
            System.out.println("NO. Emprestimo não liberado.");
        }
    }
}
