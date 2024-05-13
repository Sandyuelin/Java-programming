public class DiscreteDistribution {
    public static void main(String[] args){
        int m = Integer.parseInt(args[0]);
        int [] a = new int [args.length-1];
        int [] sum = new int[args.length];// my first time knowing that what is args.length
        int s = 0;
        sum[0] = 0;
        for (int i = 0;  i< a.length; i++) {
            a[i] = Integer.parseInt(args[i+1]);
            s += a[i];
            sum[i+1] = s;
        }
        for (int j = 0; j < m; j++) {
                int r = (int) (s * Math.random());
                for (int index = 0; index< sum.length;index++) {
                    if (r>= sum[index]&& r < sum[index+1]) {
                        System.out.print(index+1 + " ");
                    }
                    }
                }
            }

}
