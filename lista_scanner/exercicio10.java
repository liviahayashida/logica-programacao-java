// package lista_scanner;
import java.util.Scanner;

public class exercicio10 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        //name
        System.out.println("Whats your name?");
        String name= sc.nextLine();
        //age
        System.out.println("How old are you?");
        int age= sc.nextInt();
        sc.nextLine();
        //city
        System.out.println("Where do you live?");
        String city= sc.nextLine();
        //output
        System.out.println("Hello "+name+"! Youre "+age+" years old and you live in "+city+"!");
    }
}
