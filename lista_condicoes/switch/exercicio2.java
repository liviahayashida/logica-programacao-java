// package lista_switch;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose an option: \n1-sum \n2-subtract \n3-multiply \n4-divide");
        int option=sc.nextInt();
        System.out.println("Type your first number: ");
        int num1= sc.nextInt();
        System.out.println("Type your second number: ");
        int num2=sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Your sum is equal: "+(num1+num2));
                break;
            case 2:
                System.out.println("Your subtration is: "+(num1-num2));
                break;
            case 3:
                System.out.println("Your multiplication is: "+(num1*num2));
                break;
            case 4:
                System.out.println("Your division is: "+(num1/num2));
                break;
            default:
                System.out.println("Something went wrong, try again");
                break;
        }
    }
}
