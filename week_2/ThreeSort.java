public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        if (b < a) { // make a smaller than b
            int t = a;
            a = b;
            b = t;
        }
        if (c < a) { // make a smaller both b and c
            int t = a;
            a = c;
            c = t;
        }
        if (c < b) { // make b smaller than c
            int t = b;
            b = c;
            c = t;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
