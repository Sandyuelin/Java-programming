// coding is solving math problems...
// the guidance shows how to divide the tasks into (1)0101 (2) whether the same --> +-+-
// for me the difficult part is to find 0101
public class ThueMorse {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int a [] = new int [n];

        a[0]=0;
        a[1]= 1;
        for (int i = 2; i< n;i++){
            if (i % 2==0){
                a[i]= a[i/2];
            }
            else a[i]= 1-a[i/2];
        }

        for (int i = 0; i< n; i++){
            for (int j = 0; j < n; j++){
                if (a[i] == a[j]){
                    System.out.print("+" + " ");
                }
                if(a[i]!= a[j]){
                    System.out.print("-" + " ");
                }

            }
            System.out.println();
        }
    }
}
