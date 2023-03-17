package Modul_4;

import java.util.Arrays;
import java.util.Scanner;

public class Soal_2 {

    static int V = 5; // jumlah vertex pada graf
    static int INF = Integer.MAX_VALUE; // nilai tak terhingga

    // Fungsi untuk mencari jalur terpendek dari source ke destination
    static void shortestPath(int graph[][], int source, int destination) {
        // Inisialisasi array jarak
        int[] dist = new int[V];
        Arrays.fill(dist, INF);
        dist[source] = 0;

        // Proses pencarian jalur terpendek menggunakan algoritma Bellman-Ford
        for (int i = 1; i < V; i++) {
            for (int u = 0; u < V; u++) {
                for (int v = 0; v < V; v++) {
                    if (graph[u][v] != 0 && dist[u] != INF && dist[u] + graph[u][v] < dist[v]) {
                        dist[v] = dist[u] + graph[u][v];
                    }
                }
            }
        }

        // Cek apakah terdapat siklus negatif
        for (int u = 0; u < V; u++) {
            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && dist[u] != INF && dist[u] + graph[u][v] < dist[v]) {
                    System.out.println("Graf mengandung siklus negatif!");
                    return;
                }
            }
        }

        // Cetak hasil jalur terpendek dari source ke destination
        System.out.printf("Jalur terpendek dari %d ke %d adalah: %d", source, destination, dist[destination]);
    }

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        int graph[][] = new int[][] { { 0, 6, 0, 0, 7 }, { 0, 0, 5, -4, 8 }, { 0, -2, 0, 0, 0 }, { 0, 0, 7, 0, 0 },
                { 0, 0, -3, 9, 0 } };

        int source; // vertex awal
        int destination; // vertex tujuan
        System.out.println("  Titik  ");
        System.out.println(" A --> 0 ");
        System.out.println(" B --> 1 ");
        System.out.println(" C --> 2 ");
        System.out.println(" D --> 3 ");
        System.out.println(" E --> 4 ");
        System.out.println();
        System.out.print(" Pilih Titik Awal   : ");
        source = input.nextInt();
        System.out.print(" Pilih Titik Tujuan : ");
        destination = input.nextInt();

        shortestPath(graph, source, destination);
    }
}
