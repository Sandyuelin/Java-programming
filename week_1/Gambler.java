import java.util.Scanner;
public class Gambler {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      int stake = input.nextInt();
      int trials = input.nextInt();
      int goal = input.nextInt();
      int bets = 0;
      int wins = 0;
      for (int t = 0; t < trials; t++) {
        int cash = stake;
        while (cash > 0 && cash < goal) {
            bets++;
            if (Math.random() < 0.5) cash++;
            else cash--;
        }
        if (cash == goal)wins++;
    }
      System.out.println(100*wins/trials + "%wins");
    }

}
