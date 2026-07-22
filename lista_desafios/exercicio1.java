package lista_desafios;
// package lista_switch;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class exercicio1 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose an option: \n1- resgister \n2- update \n3- delete \n4- exit");
        int option = sc.nextInt();
            List<String> itemList = new ArrayList<>();
        switch (option){
            case 1:
                System.out.println("Type the item name: ");
                String newItem = sc.nextLine();
                itemList.add(newItem);
                System.out.println("Your item was registed in our system");
                break;
            case 2:
                System.out.println("Current list: "+itemList);
                System.out.println("Type the index, number, of the item to update: ");
                int updateIndex = sc.nextInt();
                sc.nextLine();
            case 3:
                System.out.println("Enter with the product you want to delete: ");
                



                
                break;
        
            default:
                break;
        }
    }
}
