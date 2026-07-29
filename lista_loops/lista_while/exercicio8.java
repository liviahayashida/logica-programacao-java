import java.util.Scanner;

public class exercicio8 {
    public static void main(String[]args){
        System.out.println("This program counts how many numbers you have entered \nInput 0 to stop");
        Scanner sc=new Scanner (System.in);
        System.out.println("Type a number: ");
        int num = sc.nextInt();
        int counter = 0;
        while (num!=0){
            counter+=1;
            System.out.println("You have "+counter+" numbers on your list. Your last number was: "+num);
            System.out.println("Type a number: ");
            num = sc.nextInt();
        }
    }
}