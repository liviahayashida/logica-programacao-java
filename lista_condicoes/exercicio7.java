// package lista_condicoes;
import java.util.Scanner;

public class exercicio7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type a password to check if its valid: ");
        int testPassword=sc.nextInt();
        int password=1234;
        if (testPassword==password){
            System.out.println("Welcome back! You have successfully logged in");
        } else {
            System.out.println("Incorrect password, try again");
        }
    }
    
}
