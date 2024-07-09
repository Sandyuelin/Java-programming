public class StrawStack {
    // instance variables
    private String[] a;
    private int N = 0;
    // constructor
    public StrawStack(int max)
    {a = new String [max];}
    // methods
    public boolean isEmpty()
    {return (N ==0);}
    public void push(String item)
    {a[N++] = item;}
    public String pop()
    {return a[--N];}
    public int size()
    {return N;}
    // test client
    public static void main(String[] args){
        int max = Integer.parseInt(args[0]);
        StrawStack stack = new StrawStack(max);
        while (!StdIn.isEmpty()){
            String item = StdIn.readString();
            if (item.equals("-"))
                StdOut.print(stack.pop());
        }
        StdOut.println();
    }

}
