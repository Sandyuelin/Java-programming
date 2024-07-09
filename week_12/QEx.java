
import java.util.LinkedList;
import java.util.Queue;
public class QEx {
    public static String[] readALlStrings() {
        Queue<String> q = new LinkedList<>();
        while (!StdIn.isEmpty()) q.add(StdIn.readString());// enqueue
        int N = q.size();
        String [] words = new String[N];
        for (int i = 0; i< N; i++) words[i] = q.poll();// dequeue
        return words;
    }
    public static void main (String[] args){
        String [] words = readALlStrings();
        for (int i = 0; i< words.length;i++)
            StdOut.println(words[i]);
    }
}
