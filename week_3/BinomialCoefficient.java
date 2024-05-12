public class BinomialCoefficient {
    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        double [][] a = new double [n+1][];// jagged or ragged arrays are arrays that are not rectangular, but have different sized entries
        for (int i = 0; i<=n; i++){// also a demo that two-dim arrays are not necessarily rectangular matrices
            a[i] = new double [i+1];
            a[i][0] = 0.0;
        }
        a[1][1] = 1.0;

        for (int i = 2; i<= n;i++){
            for (int k = 1;k<i;k++) {
                a[i][k] = (a[i-1][k]+ a[i-1][k-1])/2.0;
            }
        }// I encounter the error of "exception in thread main java.lang.arrayindexoutofboundsindexexception"数组越界异常
        //即是访问数组中不存在索引位置
        //The bug here is k cannot be i since it is index, if it appears equal to i, then the actual position is i+1
        //the most possible number is i, so there exists the error introduced aove
        for (int i = 0; i< n ;i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
