public class Cap06_Interacao_WHILE {
    public static void main(String [] args)
    {
        int i = 0;
        while(i <= 10)
        {
            System.out.println(i);

            boolean stop = i ==  5;
            
            if(stop)
            {
                System.out.println("break");
                i++;
                break;
            }

           i++;
        }
    }
}
