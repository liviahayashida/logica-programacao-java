import java.util.Scanner;

public class exercicio5 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Type a number to see its multiplication table: \n");
        int num=sc.nextInt();
        for (int i=0 ; i<=10 ; i++){
            int result = i*num;
            System.out.println(num+" x "+i+" = "+result);
        }
    }
}
