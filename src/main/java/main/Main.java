package main;

import java.util.Scanner;
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }
    private void run() {
        //test*();
    }

    private int[][] fillMatrix() {
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }
    private int[][] fillFullGraf(int m) {
        int[][] graf = new int[m][2];
        for (int i = 0; i < m; i++) {
            graf[i][0] = scanner.nextInt();
            graf[i][1] = scanner.nextInt();
        }
        return graf;
    }



    //PASS                          37                          !!!!!!!!!!!!!!!!!!!!!!!!!!
    private void testE() {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < k; i++) {
            int option = scanner.nextInt();
            if (option == 1) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                addEdge(u, v, matrix);
            }

            if (option == 2) {
                int u = scanner.nextInt();
                Vertex(u, matrix);
            }
        }
    }
    private void addEdge(int u, int v, int[][] matrix) {
        if (u == v) return;
        matrix[u - 1][v - 1] = 1;
        matrix[v - 1][u - 1] = 1;
    }
    private void Vertex(int u, int[][] matrix) {
        boolean status = false;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[u - 1][i] == 1) {
                System.out.print((i + 1) + " ");
                status = true;
            }
        }
        if (!status) {
            System.out.println();
        }
    }


    //PASS
    private void testI() {
        int[][] matrix = fillMatrix();
        int countIstok = 0;
        int[] istok = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            boolean statusIstok = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    statusIstok = false;
                    break;
                }
            }
            if (statusIstok) {
                istok[countIstok] = i + 1;
                countIstok++;
            }
        }
        System.out.print(countIstok + " ");
        for (int i = 0; i < countIstok; i++) {
            System.out.print(istok[i] + " ");
        }
        System.out.println();

        int countStock = 0;
        int[] stock = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            boolean statusStok = true;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    statusStok = false;
                    break;
                }
            }
            if (statusStok) {
                stock[countStock] = i + 1;
                countStock++;
            }
        }
        System.out.print(countStock + " ");
        for (int i = 0; i < countStock; i++) {
            System.out.print(stock[i] + " ");
        }
    }
    //PASS
    private void testJ() {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt() - 1;
            int v = scanner.nextInt() - 1;
            matrix[u][v] = 1;
            matrix[v][u] = 1;
        }
        boolean status = true;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    status = false;
                    break;
                }
            }
            if (!status) break;
        }
        if (status) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
    //PASS
    private void testС() {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] matrix = new int[n][m];
        int[][] graf = fillFullGraf(m);
        for (int i = 0; i < m; i++) {
            matrix[graf[i][0] - 1][i] = 1;
            matrix[graf[i][1] - 1][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    //PASS
    private void testM() {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] graf = fillFullGraf(m);
        int[][] matrix = new int[n][n];
        for (int i = 0; i < m; i++) {
            matrix[graf[i][0] - 1][graf[i][1] - 1] = 1;
            matrix[graf[i][1] - 1][graf[i][0] - 1] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    //PASS
    private void testH() {
        int[][] matrix = fillMatrix();
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            int count2 = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
                if (matrix[i][j] == 1) {
                    count2++;
                }
            }
            System.out.print(count + " " + count2);
            System.out.println();
        }
    }
    //PASS
    private void testG() {
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            int c = scanner.nextInt();
            int[] matrixTemp = new int[c];
            for (int j = 0; j < c; j++) {
                matrixTemp[j] = scanner.nextInt();
            }
            for (int j = 0; j < c; j++) {
                matrix[i][matrixTemp[j] - 1] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    //PASS
    private void testF() {
        int[][] matrix = fillMatrix();
        int[] massive = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) {
                    massive[count] = j + 1;
                    count++;
                }
            }
            System.out.print(count + " ");
            for (int j = 0; j < count; j++) {
                System.out.print(massive[j] + " ");
            }
            System.out.println();
        }
    }
    //PASS
    private void testB() {
        int[][] matrix = fillMatrix();
        int[] massive = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) massive[i] = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i][j] == 1 && massive[i] != massive[j]) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
    //PASS
    private void testL() {
        int[][] matrix = fillMatrix();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1 && i < j) {
                    int tempI = i + 1;
                    int tempJ = j + 1;
                    System.out.print(tempI + " " + tempJ);
                    System.out.println();
                }
            }
        }
    }
    //PASS
    private void testD() {
        int[][] matrix = fillMatrix();
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] == 1) {
                System.out.println("NO");
                return;
            }
            for (int j = 0; j < matrix.length; j++) {
                if (!(matrix[i][j] == matrix[j][i])) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }
    //PASS
    private void testK() {
        int[][] matrix = fillMatrix();
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][i] == 1) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
    //PASS
    private void testN() {
        int[][] matrix = fillMatrix();
        int[] otvet = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                sum = matrix[i][j] + sum;
            }
            otvet[i] = sum;
            System.out.println(otvet[i]);
        }

    }
    //PASS
    private void testA() {
        int[][] matrix = fillMatrix();
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] == 1) sum++;
            }
        }
        System.out.println(sum / 2);
    }
}