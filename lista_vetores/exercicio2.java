import java.util.Scanner;
import java.util.ArrayList;

public class exercicio2 {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Type a number or 0 to stop: ");
        int num = sc.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>();
        while (num != 0) {
            numbers.add(num);
            System.out.println("Type a number or 0 to stop: ");
            num = sc.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < numbers.size(); i++) {
            soma += numbers.get(i);
        }

        System.out.println("Sum = " + soma);
    
    sc.close();
    }
}