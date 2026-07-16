// package lista_condicoes;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Whats your age? ");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("You can vote");
        } else {
            System.out.println("You cant vote yet");
        }
    }
    
}
