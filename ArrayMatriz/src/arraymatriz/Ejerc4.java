package arraymatriz;

public class Ejerc4 {

    public static void main(String[] args) {

        int[][] matrizA = new int[4][4];
        int[][] matrizB = new int[4][4];

        for (int i = 0; i < matrizA.length; i++) {

            for (int j = 0; j < matrizA.length; j++) {
                double numRandom = Math.random() * 10;
                matrizA[i][j] = (int) numRandom;
                System.out.print(matrizA[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("----------------");
        
        for (int i = 0; i < matrizB.length; i++) {

            for (int j = 0; j < matrizB.length; j++) {

                matrizB[i][j] = matrizA[j][i];
                System.out.print(matrizB[i][j]);
            }
            System.out.println("");
        }

    }

}
