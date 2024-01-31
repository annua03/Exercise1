package exercise1;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author Annu Annu
 * @author Annu Annu Jan 31, 2024 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        
        hand[0] = new Card("Hearts", 1);
        hand[1] = new Card("Hearts", 2);
        hand[2] = new Card("Diamonds", 3);
        hand[3] = new Card("Hearts", 4);
        hand[4] = new Card("Hearts", 5);
        hand[5] = new Card("Hearts", 6);
        hand[6] = new Card("Spades", 7);
        
        System.out.println("Enter your guess");
        System.out.print("enter the value between 1 and 13: ");
        Scanner input = new Scanner(System.in);
        int uservalue = input.nextInt();
        System.out.print("enter your suit: ");
        Scanner input1 = new Scanner(System.in);
        String usersuit = input1.nextLine();
        
        for(int i = 0; i < hand.length; i++) {
            if ((hand[i].getSuit().equals(usersuit)) && (hand[i].getValue() == uservalue))
                {
                    printInfo();
                    break;
                }
            else
            {
                if(i == hand.length){
                System.out.println("Sorry, you didn't guess it right");  } 
            }
            
        }

    }
      

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Annu Annu 2024
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
