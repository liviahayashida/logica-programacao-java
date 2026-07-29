import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 1;

        while (counter <= 10) {
            int result = num * counter;
            System.out.println(num + "x" + counter + "=" + result);
            counter++;
        }

        sc.close();
    }
}