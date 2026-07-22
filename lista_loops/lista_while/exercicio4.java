// package lista_while;

import java.util.Scanner;

public class exercicio4 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
// password
        System.out.println("Type your password: ");
        int password = sc.nextInt();
// testing
        System.out.println("Welcome home, enter with the right password: ");
        int passwordAtempt = sc.nextInt();

        while (passwordAtempt!= password){
            System.out.println("Try again! Password is wrong");
            System.out.println("Welcome home, enter with the right password: ");
            passwordAtempt = sc.nextInt();
        }
        System.out.println("You got the right password");
        sc.close(); // close the scanner
    }
    
}
