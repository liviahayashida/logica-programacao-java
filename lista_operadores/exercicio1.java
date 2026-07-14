// package lista_operadores;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Type your first number: ");
        int num1=sc.nextInt();
        System.out.println("Type your second number: ");
        int num2=sc.nextInt();
        System.out.println("the sum of "+num1+" and "+num2+" is "+(num1+num2));
        System.out.println("the substration is equal to "+(num1-num2));
        System.out.println("the multiplication is equal to "+(num1*num2));
        System.out.println("the division is equal to "+(num1/num2));
        System.out.println("the remainder of the division is equal to "+(num1%num2));
    }
    
}
