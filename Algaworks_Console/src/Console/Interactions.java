package Console;

import java.util.Scanner;

public class Interactions
{
    Scanner scanner = new Scanner(System.in);
    public Integer read_integer(String text){
        System.out.print(text);
        return scanner.nextInt();
    }
    public Double read_double(String text){
        System.out.print(text);
        return scanner.nextDouble();
    }
    public String read_text(String text){
        System.out.print(text);
        return scanner.nextLine();
    }
    public void scanner_close(){
        scanner.close();
    }
    public void textln(String text){
        System.out.println(text);
    }
    public void system_err(String text){
        System.err.println(text);
    }
    public void print_trace(){
        System.out.println("--------------------------------------------------");
    }
}