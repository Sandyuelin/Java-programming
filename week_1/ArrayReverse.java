import java.util.Arrays;

//reverses the order of the values in a one-dimensional String array
//and then print the reversed array.
//Approach #01: create another array to hold the result.
//Approach #02: do not create another array as the above.
public class ArrayReverse {
    static void approachOne(String[] arr) {
        // your solution starts here
        int n = arr.length;
        String[] newArray = new String[n];
        for (int i = 0; i<n; i++){
            newArray[i] = arr[n-i-1];
        }
        System.out.println(Arrays.toString(newArray));
    }
    static void approachTwo(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n/2; i++) {
            String temp = arr[i];
            arr[i] = arr[n - i-1];
            arr[n-1-i]= temp;
        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args){
        String[] inputArray = {"April","May","June","July","August"};
        approachOne(inputArray);
        approachTwo(inputArray);

    }
}
