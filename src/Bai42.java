import java.util.Scanner;
public class Bai42 {
    // y a
    public static int[][] inputMatrix(Scanner sc){
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for(int i =0; i<matrix.length;i++){
            for(int j =0; j< matrix[0].length; j++){
                matrix[i][j]= sc.nextInt();
            }
        }return matrix;
    }
    public static void printMatrix(int[][] matrix){
        for(int i =0; i<matrix.length;i++){
            for(int j =0; j< matrix[0].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println("");
        }
    }
    //y b
    public static void findMax(int[][] matrix){
        int check = matrix[0][0];
        for(int i =0; i<matrix.length;i++){
            for(int j =0; j< matrix[0].length; j++){  
                if(check < matrix[i][j]){
                    check = matrix[i][j];
                }
            }
        }System.out.println(check);    
    }
    //y c
    public static void findSum2nd(int[][] matrix){
        int[] sum = new int[matrix[0].length];
        for(int i =0; i<matrix.length;i++){
            for(int j =0; j< matrix[0].length; j++){  
                sum[i] += matrix[j][i];
            }
        }
        int[] newSome = sum;
        int tmp = 0;
        for(int h =0; h< sum.length-1;h++){
            for(int k =0;k<sum.length-1;k++){
                if(newSome[k]>newSome[k+1]){
                    tmp = newSome[k];
                    newSome[k]= newSome[k+1];
                    newSome[k+1] = tmp;
                }
            }
        }
        for(int l =0; l< sum.length;l++){
            if(sum[l]== newSome[1]){
                System.out.println(l+1);
            }
        }
    }

    // y d
    public static void uTM(int[][] matrix){
        int[][] matrix1 = matrix;
        for(int i =0; i<matrix.length;i++){
            for(int j =0; j< i; j++){
                matrix[i][j]= 0;
            }
        }
        printMatrix(matrix1);
    }
    // y e
    public static boolean squareMatrix(int[][] matrix){
        if(matrix.length== matrix[0].length){
            return true;
        }return false;
    }
    // y f
    public static boolean identityMatrix(int[][] matrix){
        if(squareMatrix(matrix)){
            for(int i = 0; i<matrix.length; i++ ){
                for(int j =0; j<matrix[0].length;j++){
                    if(matrix[i][i]==1 && matrix[i][j]==0 && i!=j){
                        return true;
                    }
                }
            }
        }return false;
    }
    //y h
    public static void tMatrix(int[][] matrix){
        int[][] newMatrix = new int[matrix[0].length][matrix.length];
        for(int i =0; i<matrix.length;i++){
            for(int j =0; j< matrix[0].length; j++){ 
                newMatrix[j][i] = matrix[i][j];
            }
        }
        printMatrix(newMatrix);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = inputMatrix(sc);
        printMatrix(matrix);
        findMax(matrix);
        System.out.print("y c");
        findSum2nd(matrix);
        System.out.println("y e la "+squareMatrix(matrix));
        System.out.println("y f la "+identityMatrix(matrix));
        uTM(matrix);
        tMatrix(matrix);
    }
}
