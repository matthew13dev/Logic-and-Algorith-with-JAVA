//Exercício 01: Verificar se a pessoa passou no concurso público

import java.util.Scanner;

public class Cap05_Exercise01 {

    public static void main(String[] args)
    {
        Scanner imput = new Scanner(System.in);

        System.out.print("Enter a math'note: ");
        Integer student_math_note = imput.nextInt();

        System.out.print("Enter a portuguese'note: ");
        Integer student_portuguese_note = imput.nextInt();

        final Integer total_note = 200;
        final Integer aprove_note = 150;

        final Integer minimum_math_note = 60;
        final Integer max_math_note = 100;

        final Integer minimum_portuguese_note = 60;
        final Integer max_portuguese_note = 100;

        Integer total_student_note = student_math_note + student_portuguese_note;
    
        Boolean math_note_test = (student_math_note >= minimum_math_note) && (student_math_note <= max_math_note);
        Boolean portuguese_note_test = (student_portuguese_note >= minimum_portuguese_note) && (student_portuguese_note <= max_portuguese_note);

        Boolean student_to_aprove_test = math_note_test && portuguese_note_test;

        Boolean max_valid_note = total_student_note <= total_note;
        Boolean min_valid_note = total_student_note >= aprove_note;

        if(max_valid_note)
        {
            if(min_valid_note)
            {
                if(student_to_aprove_test)
                {
                    System.out.println("YES. Student aproved.");
                }
                else
                {
                    System.out.println("NO. Studen aren't aproved..");
                }
            }
            else
            {
                System.out.println("NO. Sudent aren't aproved.");
            }
        }
        else
        {
            System.out.println("NOTE INVALID");
        }

        System.out.println("---------------------------------");
        System.out.println("Math: " + student_math_note);
        System.out.println("Portuguese: " + student_portuguese_note);
        System.out.println("TOTAL: " + total_student_note);
        imput.close();
    }
}
