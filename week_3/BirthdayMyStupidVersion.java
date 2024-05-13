public class BirthdayMyStupidVersion {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] birthday = new int[trials];
        int count = 0;
        int sum = 0;
        for(int i = 0; i<50; i++){
            birthday[i] = (int) (n * Math.random());
            System.out.print(i+1 + " ");
            for (int j=0; j< trials; j++) {
                if (birthday[i] == birthday[j]) {
                    count++;
                }

                sum += count;
                double fraction = 1.0 * sum / trials;
                System.out.print(count + " ");
                System.out.print(fraction);
                if (fraction >= 0.5)
                    break;
            }
            System.out.println();
        }
    }
}
// in this version, i did not recognize the seperation of trials time and people in the room
// also, i did not use boolean to check whether one element is in the array
// the technique lies in the use of nesting: loop and while, providing accumulation of "how many people enter then get duplicate birthdays"