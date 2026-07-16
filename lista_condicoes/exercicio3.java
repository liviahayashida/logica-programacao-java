// package lista_condicoes;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your test score? (10-100)");
        int score=sc.nextInt();
        if (score>=70){
            System.out.println("You passed the test");
        } else{
            System.out.println("You failed the test");
        }
    }
}