package Responsi;

import java.util.Arrays;
import java.util.Scanner;

public class Responsi_1 {
	
//=================================( SOAL 1 )===================================//
	public static void bubbleSort(int[] arr) { // MENGURUTKAN SECARA MENAIK ATAU ASCENDING //
	    int n = arr.length;
	    for (int i = 0; i < n-1; i++) {
	        for (int j = 0; j < n-i-1; j++) {
	            if (arr[j] > arr[j+1]) {
	                // swap arr[j] and arr[j+1]
	                int temp = arr[j];
	                arr[j] = arr[j+1];
	                arr[j+1] = temp;
	            }
	        }
	    }
	}
	public static int binarySearch(int[] arr, int x, int l, int r) {
	    if (r >= l) {
	        int mid = l + (r - l) / 2;

	        if (arr[mid] == x) {
	            return mid;
	        }

	        if (arr[mid] > x) {
	            return binarySearch(arr, x, l, mid - 1);
	        }

	        return binarySearch(arr, x, mid + 1, r);
	    }

	    return -1;
	}
	public static void findPair(int arr[], int jumlah) {
	    int n = arr.length;
	    boolean found = false;
	    for (int i = 0; i < n; i++) {
	        int x = jumlah - arr[i];
	        int j = binarySearch(arr, x, i + 1, n - 1);

	        if (j != -1) {
	            System.out.println(" Pasangan Yang Ditemukan (" + arr[i] + ", " + arr[j] + ")");
	            found = true;
	        }
	    }
	    if (!found) {
        	System.out.println(" Tidak Ditemukan Pasangan Yang Cocok !");
        }
	}

//=================================( SOAL 2 )===================================//
	public static void printPath(int[] prev, int start, int end) {
        if (prev[end] == -1) {
            System.out.print(end + " ");
            return;
        }
        printPath(prev, start, prev[end]);
        System.out.print("--> " + end + " ");
    }
    
    public static void dijkstra(int start) {
        int[][] graph = new int[][] {
            /*0*/{0,4,0,0,0,0,0,8,0},
            /*1*/{4,0,8,0,0,0,0,11,0},
            /*2*/{0,8,0,7,0,4,0,0,2},
            /*3*/{0,0,7,0,9,14,0,0,0},
            /*4*/{0,0,0,9,0,10,0,0,0},
            /*5*/{0,0,4,14,10,0,2,0,0},
            /*6*/{0,0,0,0,0,2,0,1,6},
            /*7*/{8,11,0,0,0,0,1,0,7},
            /*8*/{0,0,2,0,0,0,6,7,0}
        };
        int n = graph.length;
        int[] distances = new int[n];
        int[] prev = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(distances, Integer.MAX_VALUE);
        Arrays.fill(prev, -1);
        distances[start] = 0;
        
        for (int i = 0; i < n - 1; i++) {
            int minDist = Integer.MAX_VALUE;
            int minNode = -1;
            for (int j = 0; j < n; j++) {
                if (!visited[j] && distances[j] < minDist) {
                    minDist = distances[j];
                    minNode = j;
                }
            }
            visited[minNode] = true;
            
            for (int j = 0; j < n; j++) {
                int edgeWeight = graph[minNode][j];
                if (edgeWeight > 0) {
                    int newDist = distances[minNode] + edgeWeight;
                    if (newDist < distances[j]) {
                        distances[j] = newDist;
                        prev[j] = minNode;
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (i != start) {
                System.out.print(" Jalur terpendek dari " + start + " ke " + i + ": ");
                printPath(prev, start, i);
                System.out.println(" Dengan Jarak = " + distances[i]);
            }
        }
    }
	
//=================================( MAIN MENU )===================================//
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        int menu;
        do {
        System.out.println("]=======================================[");
        System.out.println("]           PROGRAM RESPONSI            [");
        System.out.println("]=======================================[");
        System.out.println("][1] Implementasi Binary Search         [");
        System.out.println("][2] Shortest Path                      [");
        System.out.println("][3] Exit                               [");
        System.out.println("]=======================================[");
        System.out.print("] Choose : ");
        menu = input.nextInt();
        System.out.println();
        switch (menu) {
            case 1:
            System.out.print(" Masukkan Jumlah Elemen : ");
            int n = input.nextInt();
            int[] arr = new int[n];
            System.out.println(" Masukkan Elemen Array : ");
                for (int i = 0; i < n; i++) {
                	System.out.print(" ");
                    arr[i] = input.nextInt();
                }
              System.out.print(" Masukkan Jumlah Yang Dicari : ");
                int jumlah = input.nextInt();
                
                bubbleSort(arr);
                
                System.out.println();
                System.out.println(" Array Yang Telah Diurutan Secara Menaik : ");
                System.out.print(" [");
                for (int i = 0; i < n-1; i++) {
            	System.out.print(" "+arr[i]+",");
                }
            System.out.print(" "+arr[n-1]);
            System.out.println(" ]");
            System.out.println();
            findPair(arr, jumlah);
            break;
            case 2:
            System.out.print(" Titik Start Anda  (0,1,2,3,4,5,6,7,8) : ");
            int start = input.nextInt();
            dijkstra(start);
            break;
            case 3:
            break;
            default:
            System.out.println(" Invalid Instruction");
        }System.out.println();
        }while (menu != 3);
    }
}
