// package lista_while;

public class exercicio3 {
    public static void main(String[]args){
        int counter = 1;
        int sum = 0;
        while (counter<101){
            System.out.println(counter);
            counter++;
            sum +=counter;
        }
        System.out.println("the sum of the numbers is: "+sum);
    }
}
