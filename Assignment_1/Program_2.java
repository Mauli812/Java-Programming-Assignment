class Matrix {

    int m[][] = new int[2][2];

    // Constructor
    Matrix(int a, int b, int c, int d) {
        m[0][0] = a;
        m[0][1] = b;
        m[1][0] = c;
        m[1][1] = d;
    }

    // Transpose
    void transpose() {
        System.out.println("Transpose:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(m[j][i] + " ");
            }
            System.out.println();
        }
    }

    // Multiplication
    void multiply(Matrix m2) {

        int result[][] = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                result[i][j] = 0;

                for (int k = 0; k < 2; k++) {
                    result[i][j] += m[i][k] * m2.m[k][j];
                }
            }
        }

        System.out.println("Multiplication Result:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Program_2 {
        public static void main(String args[]) {

            Matrix  m1= new Matrix(1, 2, 3, 4);
            Matrix m2 = new Matrix(5, 6, 7, 8);

            m1.transpose();
            m1.multiply(m2);
        }
}