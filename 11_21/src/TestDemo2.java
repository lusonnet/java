import java.util.Scanner;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-11-21
 * Time: 19:12
 */
public class TestDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        int[][] arr = new int[a][b];
        for(int i = 0;i < a;i++){
            for (int j = 0; j < b; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        Matrix mat1 = new Matrix(arr,a,b);
        a = scanner.nextInt();
        b = scanner.nextInt();
        int[][] arr1 = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr1[i][j] = scanner.nextInt();

            }
        }
        Matrix mat2 = new Matrix(arr1,a,b);
        Matrix out = new Matrix();
        out = Matrix.multiply(mat1,mat2);
        Matrix.input(out);
    }

    public static class Matrix{
        int r,c;
        int[][] matrix;
        public Matrix(int[][] matrix,int r,int c){
            this.c = c;
            this.r = r;
            this.matrix = matrix;
        }
        public Matrix(){
        }

        public static Matrix multiply(Matrix m1,Matrix m2){
            Matrix mat = new Matrix(new int[m1.r][m2.c],m1.r,m2.c);
            for (int i = 0; i < m1.r; i++) {
                for (int j = 0; j < m2.c; j++) {
                    for (int k = 0; k < m1.c; k++) {
                        mat.matrix[i][j] += m1.matrix[i][k]*m2.matrix[k][j];
                    }
                }
            }
            return mat;
        }

        public static void input(Matrix mat){
            for (int i = 0; i < mat.r; i++) {
                for (int j = 0; j < mat.c; j++) {
                    System.out.print(mat.matrix[i][j]+" ");
                }
                System.out.println();
            }
        }
    }

}
