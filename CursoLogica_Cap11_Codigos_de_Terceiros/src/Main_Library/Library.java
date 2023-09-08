package Main_Library;

import Console.Interactions;

public class Library
{
    public static void main(String[] args)
    {
        Interactions console = new Interactions();

        console.textln("Test of Application.");

        Integer integer_number = console.read_integer("Enter a integer number: ");
        System.out.println("Your integer number: " + integer_number);

        Double double_number = console.read_double("Enter a double number: ");
        System.out.println("Your double number: " + double_number);

        console.textln("End of Applicaton.");
        console.scanner_close();
    }
}
