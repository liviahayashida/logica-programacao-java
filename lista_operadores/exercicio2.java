// package lista_operadores;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input your fisrt grade: ");
        double grade1 =sc.nextDouble();
        System.out.println("Input your second grade: ");
        double grade2 =sc.nextDouble();
        System.out.println("Input your third grade: ");
        double grade3= sc.nextDouble();
        System.out.println("Input your fourth grade: ");
        double grade4=sc.nextDouble();
        double average= (grade1+grade2+grade3+grade4)/4;
        System.out.println("the average of your grades is: "+average);
    }
}
