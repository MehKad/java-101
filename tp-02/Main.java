import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
                                                                        //Tableau avec des valeurs predefinit
        int[] A = {1,2,3,4};                                            //Declartion du tableau
        for(int v:A){
            System.out.println(v);
        }
                                                                        //Matrice avec des valeurs entrer par un utilisateur
        int[][] B = new int [3][3];                                     //Declaration de la matrice
        Scanner c = new Scanner(System.in);
        for (int i=0;i<B.length;i++){
            for(int j=0;j<B.length;j++){
                B[i][j] = c.nextInt();                                  //Scanf de la matrice
            }
        }
        for (int i=0;i<B.length;i++){
            for(int j=0;j<B.length;j++){
                System.out.println(B[i][j]);
            }
        }
        
    }
}
