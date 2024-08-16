import java.util.Scanner;
public class metmulti {
    public static void main(String[] args) {
        int i, j, k, r1, c1, r2, c2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows of A:");
        r1 = sc.nextInt();
        System.out.println("Enter the number of columns of A:");
        c1 = sc.nextInt();
        System.out.println("Enter the number of rows of B:");
        r2 = sc.nextInt();
        System.out.println("Enter the number of columns of B:");
        c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible");
            return;
        }

        int[][] a = new int[r1][c1];
        int[][] b = new int[r2][c2];
        int[][] c = new int[r1][c2];

        System.out.println("Enter the matrix A:");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the matrix B:");
        for (i = 0; i < r2; i++) {
            for (j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                c[i][j] = 0;
                for (k = 0; k < c1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("The resulting matrix is:");
        for (i = 0; i < r1; i++) {
            for (j = 0; j < c2; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}
