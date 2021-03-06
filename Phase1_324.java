package phase1_324;

public class Phase1_324 {

    static int INF = 10000;//Impossible value of the weight matrix and the  distance matrix 

    public static void main(String[] args) {

//weight matrix for weighted graph
        int matrix[][] = {
            {0, 10, INF, INF, INF, 5, INF, INF, INF, INF},
            {INF, 0, 3, INF, 3, INF, INF, INF, INF, INF},
            {INF, INF, 0, 4, INF, INF, INF, 5, INF, INF},
            {INF, INF, INF, 0, INF, INF, INF, INF, 4, INF},
            {INF, INF, 4, INF, 0, INF, 2, INF, INF, INF},
            {INF, 3, INF, INF, INF, 0, INF, INF, INF, 2},
            {INF, INF, INF, 7, INF, INF, 0, INF, INF, INF},
            {INF, INF, INF, 4, INF, INF, INF, 0, 3, INF},
            {INF, INF, INF, INF, INF, INF, INF, INF, 0, INF},
            {INF, 6, INF, INF, INF, INF, 8, INF, INF, 0}
        };
        //floyd Algorithm 
        for (int k = 0; k < matrix.length; k++) {
            if(k==matrix.length-1){
                System.out.println("The distance matrix:");//last print
            }else { System.out.println("Weight matrix in iteration ("+(k+1)+") :");//eatch print
            }
            printSolution(matrix);
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[i][j] = Math.min(matrix[i][j], matrix[i][k] + matrix[k][j]);

                }
            }

        }
    }

    //print matrix
    static void printSolution(int[][] matrix) {
        
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix.length; ++j) {
                if (matrix[i][j] == INF) {
                    System.out.printf("%3s ", "INF ");
                } else {
                    System.out.printf("%-4d ", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }

}
