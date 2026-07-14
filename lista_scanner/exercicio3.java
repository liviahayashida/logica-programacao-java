import java.util.Scanner;
// package lista_scanner;


public class exercicio3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        //number 1
        System.out.println("Type a number: ");
        int num1 = sc.nextInt();
        sc.nextLine();

        //number 2
        System.out.println("Type another number: ");
        int num2 = sc.nextInt();
        sc.nextLine();

        System.out.println("The sum of " + num1+" and "+num2+" is "+(num1+num2));
    }
    
}
