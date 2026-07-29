
import java.util.Scanner;

public class exercicio7 {
    public void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Type a number: \nOr enter 0 to stop");
        int num = sc.nextInt();
        while (num !=0){
            System.out.println(num);
            System.out.println("Type a number: ");
            num = sc.nextInt();
        }
    }
}
