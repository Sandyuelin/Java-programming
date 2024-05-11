package week_2;
// by thinking in mathematical way, change --> win : 2/3 ; dont change --> win: 1/3
// but this is cs, it requires real game simulation
public class MonteHall {
    public static void main (String[] args){
        int trials = Integer.parseInt(args[0]);
        int win = 0;
        for (int i = 1; i < trials; i++) {
            int prize = (int) (3*Math.random());
            int choice = (int) (3*Math.random());
            int reveal;
            do{
                reveal = (int)(3*Math.random());
            } while ((reveal == choice) || (reveal== prize));

            int other = 3 - reveal -choice;
            if (other == prize) win++;
        }
        System.out.println("Fraction of games won = " + 1.0*win/trials);
    }
}
