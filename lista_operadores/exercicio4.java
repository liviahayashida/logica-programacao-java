// package lista_operadores;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("Input the base of the rectangle");
        double base= sc.nextDouble();
        System.out.println("Input the height of the rectangle");
        double height= sc.nextDouble();
        System.out.println("The perimeter pf the rectangle is: "+((base+height)*2));
    }
    
}
