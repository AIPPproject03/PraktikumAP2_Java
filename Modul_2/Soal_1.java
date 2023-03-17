package Modul_2;

public class Soal_1 {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3}, {4, 5, 6}};  // Matriks A
        int[][] B = {{7, 8, 9}, {10, 11, 12}};  // Matriks B
        int[][] C = new int[2][3];  // Matriks hasil penjumlahan
        int total = 0;  // Total dari hasil penjumlahan matriks

        // Penjumlahan dua matriks A dan B
        System.out.println(" Matriks A :");
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(" Matriks B :");
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+B[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(" Matriks hasil penjumlahan C :");
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(" "+C[i][j] +" ");
                total += C[i][j];
            }
            System.out.println();
        }
        System.out.println();
        // Menampilkan total dari hasil penjumlahan matriks
        System.out.println(" Total Nilai Matriks : "+total);
    }
}
