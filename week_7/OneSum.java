public class OneSum {
    public static int count(int[] a){
        int n = a.length;
        int count = 0;
        for (int i = 0; i<n;i++){
            if(a[i]==0)count++;
        }
        return count;
    }
    public static void main(String[] args){
        int [] a = StdIn.readAllInts();
        int n = a.length;
        Stopwatch timer = new Stopwatch();
        int count = count(a);
        StdOut.println(timer.elapsedTime());
        StdOut.println(count);
    }
}
