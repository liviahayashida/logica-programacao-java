package lista_scanner;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your name?");
        
        String name = sc.nextLine();
        System.out.println("Hey, "+name+"! Nice to meet you");
    }
}
