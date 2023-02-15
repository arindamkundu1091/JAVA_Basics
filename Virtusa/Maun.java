import java.util.*;

class Clock {
}

class Clockwise extends Clock {
    int[][] mat1;
    int m, n, r;

    Clockwise(int m, int n, int r, int[][] mat1input) {
        this.m = m;
        this.n = n;
        this.r = r;
        this.mat1 = mat1input;
    }

    void rotation() {
        while (r > 0) {
            mat1 = rotate(m, n, mat1);
            r -= 1;
        }
        System.out.println("Clockwise");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(mat1[i][j] + " ");
            System.out.print("\n");
        }
    }

    int[][] rotate(int m, int n, int mat[][]) {
        int row = 0, col = 0;
        int prev, curr;
        while (row < m && col < n) {

            if (row + 1 == m || col + 1 == n)
                break;
            prev = mat[row + 1][col];
            for (int i = col; i < n; i++) {
                curr = mat[row][i];
                mat[row][i] = prev;
                prev = curr;
            }
            row++;
            for (int i = row; i < m; i++) {
                curr = mat[i][n - 1];
                mat[i][n - 1] = prev;
                prev = curr;
            }
            n--;
            if (row < m) {
                for (int i = n - 1; i >= col; i--) {
                    curr = mat[m - 1][i];
                    mat[m - 1][i] = prev;
                    prev = curr;
                }
            }
            m--;
            if (col < n) {
                for (int i = m - 1; i >= row; i--) {
                    curr = mat[i][col];
                    mat[i][col] = prev;
                    prev = curr;
                }
            }
            col++;
        }
        return mat;
    }
}

class Anticlockwise extends Clock {
    int[][] mat2;
    int r;
    int top, left;
    int bottom, right;
    int prev, curr;

    Anticlockwise(int[][] mat2input, int r) {
        mat2 = mat2input;
        this.r = r;
    }

    void rotation() {
        mat2 = rotate();
        System.out.println("Anti clockwise");
        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2.length; j++)
                System.out.print(mat2[i][j] + " ");
            System.out.print("\n");
        }
    }

    int[][] rotate() {
        for (int z = 0; z < r; z++) {
            top = 0;
            left = 0;
            this.bottom = mat2.length - 1;
            this.right = mat2[0].length - 1;
            while (left < right && top < bottom) {
                prev = mat2[top + 1][right];
                for (int i = right; i > left - 1; i--) {
                    curr = mat2[top][i];
                    mat2[top][i] = prev;
                    prev = curr;
                }
                top += 1;
                for (int i = top; i < bottom + 1; i++) {
                    curr = mat2[i][left];
                    mat2[i][left] = prev;
                    prev = curr;
                }
                left += 1;
                for (int i = left; i < right + 1; i++) {
                    curr = mat2[bottom][i];
                    mat2[bottom][i] = prev;
                    prev = curr;
                }
                bottom -= 1;
                for (int i = bottom; i > top - 1; i--) {
                    curr = mat2[i][right];
                    mat2[i][right] = prev;
                    prev = curr;
                }
                right -= 1;
            }
        }
        return mat2;
    }
}

class MatrixRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix1 = new int[m][n];
        int[][] matrix2 = new int[m][n];
        sc.nextLine();
        while (sc.hasNextLine()) {
            for (int i = 0; i < m; i++) {
                String[] line = sc.nextLine().trim().split(" ");
                for (int j = 0; j < line.length; j++) {
                    matrix1[i][j] = Integer.parseInt(line[j]);
                }
            }
            break;
        }
        int r = sc.nextInt();
        sc.close();
        System.arraycopy(matrix1, 0, matrix2, 0, matrix1.length);
        Clockwise clockwise = new Clockwise(m, n, r, matrix1);
        Anticlockwise anticlockwise = new Anticlockwise(matrix2, r);
        clockwise.rotation();
        anticlockwise.rotation();
        // System.out.println("Anti clockwise");
        // for (int i = 0; i < m; i++) {
        // for (int j = 0; j < n; j++)
        // System.out.print(res2[i][j] + " ");
        // System.out.print("\n");
        // }
    }
}