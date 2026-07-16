import java.util.Scanner;

public class exercicio6 {
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
        System.out.println("This program will convert Celsius to Fahrenheit");
        System.out.println("Input the value in Celsius: ");
        double celsius=sc.nextDouble();
        double fahrenheit= (celsius*1.8)+32;
        System.out.println(celsius+" celsius is equal to "+fahrenheit+" fahrenheit");
    }
}
