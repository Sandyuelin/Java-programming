public class AddTwo{
    public static void main(String [] args){
        StdOut.print("Type the first integer");
        int x = StdIn.readInt();
        StdOut.print("Type the second");
        int y = StdIn.readInt();
        int sum = x+y;
        StdOut.println("There sum is "+ sum);
    }
}