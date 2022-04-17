package fr.d28.test;

import java.util.Scanner;

public class Test {
    static int essais = 9;

    public static void main(String[] args) {
        System.out.println("Tu dois trouver le code secret, tu as " + essais + " essais");

        int codeSecret = (int) (Math.random() * 100);

        //create a scanner
         Scanner scanner = new Scanner(System.in);

         //ask the user to enter a number
         System.out.println("Entrez un nombre entre 0 et 100");

         while (true) {
             //read the user input
             int userInput = scanner.nextInt();
             essais = essais-1;
             if(userInput == codeSecret){
                 System.out.println("Bravo, tu as trouvé le code secret");
                 break;
             }
             else if(userInput < codeSecret){
                 System.out.println("Trop petit il te reste " + essais + " essais");
             }
             else if (userInput > codeSecret){
                 System.out.println("Trop grand, il te reste " + essais + " essais");

             }

             if(essais == 0){
                 System.out.println("Tu as perdu, le nombre était " + codeSecret);
                 break;
             }

         }






    }


}
