public class MatrixMultiplication {
    public static void main(String []args) {
            int M = Integer.parseInt(args[0]);
            int N = Integer.parseInt(args[1]);
            int P = Integer.parseInt(args[2]);
            int Q = Integer.parseInt(args[3]);
            if (N != P) {
                System.out.println("Error: Incompatible matrix dimensions.");
                return;
            }
            double[][] a = new double[M][N] ;
            double[][] b = new double[P][Q];
            double[][] c = new double[M][Q];

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < Q; j++) {
                    for (int k = 0; k < N; k++) {
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < Q; j++) {
                    System.out.print(c[i][j] + " ");


                }
            }


        }

}
