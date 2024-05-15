public class Q4 {
    public static void main(String[] args){
        while(!StdIn.isEmpty()){
            int N = StdIn.readInt();
            int sum = 0;
            for (int i = 0; i< N; i++)
                if(!StdIn.isEmpty())
                    sum += StdIn.readInt();
            StdOut.println(sum+ " ");
        }
        StdOut.println();
    }

}
