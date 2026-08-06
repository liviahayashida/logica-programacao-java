import java.util.Scanner;
import java.util.ArrayList;

public class exercicio1 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for(int i=0; i<5; i++){
            System.out.println("Type a number: ");
            numbers.add(sc.nextInt());
        }
        System.out.println("The numbers are: ");
        for(int i=0; i<5; i++){
            System.out.print(numbers.get(i) + " ");
        }
        sc.close();
    }
}
