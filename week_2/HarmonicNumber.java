/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

package week_2;

public class HarmonicNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 1; i < n + 1; i++) {
            sum += 1.0 / i; // 1 / i = 0 since integer division truncates fractional part

        }
        System.out.println("Harmonic number is : " + sum);


    }
}
