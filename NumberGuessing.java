import java.util.*;
public class NumberGuessing{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        Random random = new Random();

        boolean playAgain = true;
        while (playAgain) {
            int number = random.nextInt(100 ) + 1 ; // geerate a random number between 1 to 100
            int attempts = 0;
            int guess = 0;

            System.out.println(" --- Number gussing game ---");
            System.out.println("Guess a number between 1 and 100");

            while ( guess != number ){
                System.out.println(" guess the number ");
                guess = sc.nextInt();
                attempts++;
                if(guess < number){
                    System.out.println("too low , try again ");

                }else if(guess  > number){
                     System.out.println("too high, try again");

                }else{
                    System.out.println("correct ");
                    System.out.println("you guessed the number in " + attempts + " attempts");
                }
                

            }
            System.out.println("do you want to play again ? (yes/no)");
            String response = sc.next();
            playAgain = response.equalsIgnoreCase("yes");





        }
        System.out.println("thank you for playing the number gussing game");
        sc.close();
    }
}