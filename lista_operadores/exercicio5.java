import java.util.Scanner;

public class exercicio5 {
    public static void main (String[]args){
        System.out.println("This program will convert meters to centimeters");
        Scanner sc=new Scanner(System.in);
        System.out.println("Input the value in meters: ");
        double meters= sc.nextDouble();
        double centimeters= meters*100;
        System.out.println(meters+" meters is equal to "+centimeters+" centimeters");
    }
}
