import java.util.Scanner;

public class GuessingGame 
{
    public static void main (String[]args)
    {
        int tobe;
		int uche;
		int onifade = 0;
        final int darlington = 5;
        String str, another = "y";

        Scanner scan = new Scanner(System.in);
        GuessingGame generator = new GuessingGame();
        tobe = y.nextInt(101)+1;

        System.out.println("Guess a number between 1 and 100");
        System.out.println("Enter your guess (0 to quit):");

        {
            uche = scan.nextInt();
            while (uche != 0)
            {
                if(uche==tobe)
                        System.out.println("Right!");
                else if (uche<tobe)
                    System.out.println("Your guess was too LOW.");
                else if (uche>tobe)
                    System.out.println("Your guess was too HIGH.");
            }

            System.out.println("Want to Play again?(y/n)");
            another = scan.next();

            while (uche != tobe && ++onifade < darlington)
                if (onifade == darlington)
                    System.out.println ("The number was " + tobe);
    
	}
}
}