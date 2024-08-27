public class max {
    public double oneDmax(double[] data){ // method
        double currentMax = data[0];
        int n = data.length;
        for (int i = 1; i<n; i++){
            currentMax = Math.max(currentMax, data[i]);
        }
        return currentMax;
    }
    public double twoDmax (double[][] data2D){ // method
        double currentMax = data2D[0][0];
        for (double [] i : data2D){
            for (double j : i){
                currentMax = Math.max(currentMax, j);
            }
        }
        return currentMax;
    }
    public static void main(String[] args){
        max maxFinder = new max();
        double[] data1D = {3.5, 7.2, 1.9, 4.6, 8.3};
        double[][] data2D = {
                {1.5, 2.8, 4.0},
                {5.6, 3.2, 6.1},
                {7.3, 8.4, 2.9}
        };
        System.out.println("Max value in 1D array: " + maxFinder.oneDmax(data1D));
        System.out.println("Max value in 2D array: " + maxFinder.twoDmax(data2D));

    }

}

// new way
// int data[] = new int[100];
// for (int element : data)