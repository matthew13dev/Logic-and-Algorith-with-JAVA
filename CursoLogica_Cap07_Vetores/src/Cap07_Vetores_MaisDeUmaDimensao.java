public class Cap07_Vetores_MaisDeUmaDimensao
{
    public static void main(String[] args)
    {

        Double[] january_billing = new Double[]{1500.0, 500.0, 2000.0};
        Double[] february_billing = new Double[]{1000.0, 5000.0, 3000.0};

        Double[][] year_billing = new Double[][]{january_billing, february_billing};
        Double[][][] decade_billing = new Double[][][]{year_billing};

        System.out.println(year_billing[0][1]);

        for(int z = 0; z < decade_billing.length; z++)
        {
            Double[][] year = decade_billing[z];
            System.out.println("Year: " + year);

            for(int i = 0; i < year_billing.length; i++)
            {
                System.out.println("Mount: " + (i+1));
                Double[] mount = year_billing[i];

                for(int j = 0; j < mount.length; j++ )
                {
                    Double day = mount[i];
                    System.out.println("Day " + (j+1) + ": " + day);
                }
            }
        }
    }
}
