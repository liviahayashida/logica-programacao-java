// package lista_scanner;
import java.util.Scanner;

public class exercicio8 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Whats your name?");
        String name = sc.nextLine();
        System.out.println("Whats your job?");
        String job = sc.nextLine();
        System.out.println("Welcome, "+name+"! Youre a "+job+"!");
    }
    
}
