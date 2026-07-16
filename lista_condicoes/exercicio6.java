// package lista_condicoes;
import java.util.Scanner;

public class exercicio6 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type a number to check if its divisible by 3: ");
        int num=sc.nextInt();
        if (num%3==0){
            System.out.println("The number "+num+" is divisible by 3");
        } else {
            System.out.println("The number "+num+" is not divisible by 3");
        }
    }
}
