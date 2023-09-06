// 7.5. Exercício 02: Encontre a semana de maior faturamento.

public class Cap07_Exercise02
{
    public static void main(String[] args)
    {
        Double[] first_week = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
        Double[] second_week = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
        Double[] third_week = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
        Double[] fourth_week = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };

        Double[][] mount = new Double[][] { first_week, second_week, third_week, fourth_week };

        Double highest_weekly_revenue = 0.0;
        Integer winning_week = null;

        for(int i = 0; i < mount.length; i++)
        {
            Double[] week = mount[i];

            Double assistant_highest_weekly_revenue = 0.0;

            for(int j = 0; j < week.length; j++)
            {
                Double day = week[j];

                assistant_highest_weekly_revenue = assistant_highest_weekly_revenue + day;

            }

            Boolean test_week_billing = assistant_highest_weekly_revenue > highest_weekly_revenue;
            if(test_week_billing)
            {
                highest_weekly_revenue = assistant_highest_weekly_revenue;
                winning_week = i + 1;
            }
        }
        System.out.println("--------------------------");
        System.out.println(highest_weekly_revenue);
        System.out.println(winning_week);

    }
}
