import java.util.Scanner;

public class exercicio9 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type a number or 0 to stop: ");
        int num = sc.nextInt();
        int sum = 0;
        while (num!=0){
            sum+=num;
            System.out.println("Type a number or 0 to stop: ");
            num = sc.nextInt();
        }
        System.out.println("The sum of your numbers is: "+sum);
    }
}
