// package lista_condicoes;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input a number: ");
        int num=sc.nextInt();
        if (num%2==0){
            System.out.println("The number "+num+" is even");
        } else{
            System.out.println("The number "+num+" is odd");
        }
    }
}
