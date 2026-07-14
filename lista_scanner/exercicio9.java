// package lista_scanner;
import java.util.Scanner;

public class exercicio9 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Type your first number: ");
        int num1 =sc.nextInt();
        System.out.println("Type your second number: ");
        int num2=sc.nextInt();
        System.out.println("Type your third number: ");
        int num3=sc.nextInt();
        int median= (num1+num2+num3)/3;
        System.out.println("The median of "+num1+", "+num2+" and "+num3+" is "+median);
    }
    
}
