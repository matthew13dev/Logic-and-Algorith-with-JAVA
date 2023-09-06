// Dada a lista de números abaixo:

// Integer[] numeros = new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
// Toda vez que o módulo de um número por 3 for igual a zero, então esse número e divisível por 3.


public class Cap06_Exercise01 {

    static final Integer DIVIDER = 3;
    public static void main(String[] args)
    {
        Integer[] numbers = new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int i = 0; i < numbers.length; i = i + 1)
        {
            
            Integer number = numbers[i];
            Integer divisble_by_divider = number % DIVIDER;
            Boolean divisible_by_divider_test = divisble_by_divider.equals(0);

            if(divisible_by_divider_test)
            {
                System.out.println(number);
            }
        }
        System.out.println("End application");
    }
}
