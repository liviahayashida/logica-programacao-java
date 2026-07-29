package lista_desafios;

import java.util.Scanner;

public class adivinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter with a word: ");
        String word = sc.nextLine();
        
        String attempt = "none";

        // Usamos !attempt.equals(word) em vez de attempt != word
        while (!attempt.equals(word)) {
            System.out.println("Whats your guess?");
            attempt = sc.nextLine();

            // Verificação (mensagem de erro)
            if (!attempt.equals(word)) {
                System.out.println("Its wrong.. try again\n");
            }
        }

        //final do loop
        System.out.println("YAYYY, you got it!");
        
        sc.close();
    }
}