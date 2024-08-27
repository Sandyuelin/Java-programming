import java.util.ArrayList;
import java.util.List;
public class primeNumber {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        List<Integer> primeList = new ArrayList<>();
        for (int i = 2; i < num; i++){
            if (num % i == 0) {
                primeList.add(i);
                num = num/i;
            }
        }
        System.out.println(primeList);
    }
}

//int total = 0;
//do
//{
// System.out.print("Enter an integer:");
// Scanner in = new Scanner (System.in);
// int value = in.nextInt();
// total = total + value;
//}
//while ( total < 100);
//