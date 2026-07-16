// package lista_condicoes;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type a year to check if its a leap year: ");
        int year=sc.nextInt();
        if (year%4==0 && year%100!=0 || year%400==0){ //se o ano for divisivel por 4 e nao for divisivel por 100 (ser um ano seculo) ou se for divisivel por 400 (ano seculo bissexto)
            System.out.println("The year is a leap year");
        } else {
            System.out.println("The year is not a leap year");
        }
    }
    
}
