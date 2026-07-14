// package lista_scanner;
import java.util.Scanner;

public class exercicio11 {
    public static void main(String[]args){
    Scanner scanner =new Scanner(System.in);

    System.out.println("Whats your name?");
    String name = scanner.nextLine();

    System.out.println("How old are you?");
    int age = scanner.nextInt();
    scanner.nextLine();

    System.out.println("what do you like to do in your free time?");
    String hobby=scanner.nextLine();

    System.out.println("Hello, "+name+"! Youre "+age+" years old and you like to "+hobby+" in your free time!!!");
}
}