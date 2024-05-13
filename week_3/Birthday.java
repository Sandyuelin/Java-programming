// counts[peopleCount] keeps track of how many times we find a pair w the same birthday
// peopleCount means the number of people in the room
public class Birthday {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int[] counts = new int[n+1];// index 0 wont be used, write out of the first for loop
       // an array counts to store the count of people entering the room for each trial
        for(int t = 0; t<trials; t++){
            boolean[] birthdays = new boolean[n];
            // initialize an array to keep track of birthdays already seen
            int peopleCount = 0;
            // this is to count the number of people entering the room for this trial
            while (true){
                int birthday = (int)(Math.random()*n);
                if (birthdays[birthday]){// check if the birthday has been seen before
                    // if yes, increment the count of people and break out of the loop
                    counts[peopleCount]++;// eg: trials =1000; one random birthday, when peoplecount= 5; we have same birthday, then it increment 1
                    // another random birthday, happens again be found in 5 ppl, increment again
                    //the accumulation of counts over multiple trials is why counts[peopleCount] can be more than 1
                    break;
                }// if the boolean is false, we havent seen that birthday before, we mark the birthday as seen and increment the count of people, indicating that one more person has entered the room
                birthdays[birthday] = true;
                peopleCount++;
            }
        }
        double totalTrials = trials;
        double cumulativeProbability = 0;
        for (int i = 1; i <= n; i++) {
            cumulativeProbability += counts[i] / totalTrials;
            System.out.printf("%d\t%d\t%.6f\n", i, counts[i], cumulativeProbability);
            if (cumulativeProbability >= 0.5) {
                break;
            }
        }
    }
}
