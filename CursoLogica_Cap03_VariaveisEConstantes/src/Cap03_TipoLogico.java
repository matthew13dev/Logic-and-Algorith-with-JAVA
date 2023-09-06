import java.util.Scanner;

public class Cap03_TipoLogico
 {
    public static void main(String[]args){
        
        Scanner imput = new Scanner(System.in);

        System.out.print("Entera age: ");
        Integer age = imput.nextInt();

        Integer toDrive = 20;

        if(age >= toDrive)
        {
            System.out.println("To drive is true!");
        }
        else
        {
            System.out.println("not drive!");
        }


    imput.close();
    }
}