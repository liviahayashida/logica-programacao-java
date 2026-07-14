// package lista_scanner;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type a number: ");
        int number = sc.nextInt();
        int tripleNumber= number*3;
        System.out.println("The triple of "+number+" is "+tripleNumber);
    }
}
