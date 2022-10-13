public class Main {
    public static void main(String[] args) {
        int[][] A = new int [11][11];                                     //Declaration de la matrice
        for (int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                A[i][j]=i*j;
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        
    }
}
