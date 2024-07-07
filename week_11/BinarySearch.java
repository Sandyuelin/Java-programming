public class BinarySearch {
    public static int search(String key, String [] a){
        return search(key,a,0,a.length);
    }
    public static int search(String key, String[] a, int lo, int hi){
        if (hi<= lo) return -1;
        int mid = lo + (hi-lo)/2;
        int cmp = a[mid].compareTo(key);
        // it assumes the comparison between the query key and the mid
        if (cmp >0) return search(key,a,lo,mid);
        else if (cmp<0) return search(key,a,mid+1,hi);
        else return mid;
    }
    // allowlist, exception filter
    public static void main(String[] args) {
        In in = new In(args[0]);
        String s = in.readAll();
        String[] words = s.split("\\s+");
        System.err.println("Done reading words");

        // prompt user to enter a word and check if it's there
        while (!StdIn.isEmpty()) {
            String key = StdIn.readString();
            if (search(key, words) < 0) StdOut.println(key);
        }
    }
}
