public class TwentyQuestions {
    public static void main(String[] args){
        // generate a number and answer questions
        int secret = 1+ (int) (Math.random()* 1000000);

        StdOut.println("Im thinking of a number");
        StdOut.println("between 1 and 1000000");
        int guess = 0;
        while (guess != secret){
            StdOut.print("Whats your guess?");
            guess = StdIn.readInt();
            if (guess< secret) StdOut.println("Too low");
            else if (guess> secret) StdOut.println("Too high");
            else StdOut.println("You win");
        }
    }
}
