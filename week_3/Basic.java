public class Basic {
    public static void main(String args[]){
        int [] a = {1,2,3,4};
        int [] b = {5,6,7,8};
        a = b;
        a[0] = 9;
        for (int i = 0; i<a.length;i++){
            System.out.println(b[i]);
        }
    }
}
// since b and a are the same, change in a equals to change in b