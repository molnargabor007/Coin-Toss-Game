import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.*;

public class CoinToss {

    private String YourTip;
    private int NumberOfTosses;

//    public CoinToss(String yourTip, int numberOfTosses) {
//        setYourTip(yourTip);
//        NumberOfTosses = numberOfTosses;
//    }

    public void setYourTip(String yourTip) {
        if (yourTip.toLowerCase().equals("heads") || yourTip.toLowerCase().equals("tails")) {
            this.YourTip = yourTip;
        } else {
            System.out.println("You can only choose HEADS or TAILS!!");
            this.YourTip = yourTip;
        }

    }

    public void setNumberOfTosses(int numberOfTosses) {
        this.NumberOfTosses = numberOfTosses;
    }

    public void tossACoin() {
        Random rand = new Random();
        int HEADS = 0;
        int TAILS = 0;
        for (int i = 1; i <= NumberOfTosses; i++) {
            int toss = Math.abs(rand.nextInt()) % 2;
            if (toss == 0) {
                System.out.println(i + ". toss : HEADS");
                HEADS++;
            } else {
                System.out.println(i + ". toss : TAILS");
                TAILS++;
            }
        }
        System.out.println();
        System.out.println("SCORES:");
        System.out.println("TAILS :" + TAILS);
        System.out.println("HEADS :" + HEADS);
        if (! (YourTip.toLowerCase().equals("heads") || YourTip.toLowerCase().equals("tails"))){
            System.out.println(YourTip.toUpperCase()+" :0");
            System.out.println("YOUR CHOICE IS INVALID YOU LOST!");
        }
        else if ((YourTip.equals("HEADS") && HEADS > TAILS) || (YourTip.equals("TAILS") && HEADS < TAILS)) {
            System.out.println("YOU WIN!");
        } else if (HEADS == TAILS) {
            System.out.println("IT'S A DRAW!");
        } else {
            System.out.println("YOU LOST!");
        }
        System.out.println();
        System.out.println("GAME OVER!");

    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        CoinToss game = new CoinToss();
        System.out.println("HEADS or TAILS? What is your Guess?");
        String YourTip = sc.nextLine().toUpperCase();
        game.setYourTip(YourTip);
        System.out.println("How Many tosses?");
        int n = sc.nextInt();
        game.setNumberOfTosses(n);
        game.tossACoin();

    }
}
