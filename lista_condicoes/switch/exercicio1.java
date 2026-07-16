// package lista_switch;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type a number from 1-7 to check the day of the week: ");
        int day=sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Its Sunday");
                break;
            case 2:
                System.out.println("Its Monday");
                break;
            case 3:
                System.out.println("Its Tuesday");
                break;
            case 4:
                System.out.println("Its Wednesday");
                break;
            case 5:
                System.out.println("Its Thursday");
                break;
            case 6:
                System.out.println("Its Friday");
                break;
            case 7:
                System.out.println("Its Saturday!!!!");
                break;
            default:
                System.out.println("Invalid number");
                break;
        } 
    }
}
