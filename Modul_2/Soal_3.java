package Modul_2;
import java.util.Scanner;

public class Soal_3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Meminta input dari user
        System.out.print(" Masukkan Panjang Array : ");
        int n = input.nextInt();
        System.out.println();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
        	System.out.print(" Masukkan Bilangan-"+(i+1)+" : ");
            arr[i] = input.nextInt();
        }
        int option;
        int[] sortedArr = null;
        // Menambahkan pilihan untuk mengurutkan bilangan dari terkecil ke terbesar atau sebaliknya
        do {
        System.out.println("=============(MENU)==============");
        System.out.println(" [1] Ascending ");
        System.out.println(" [2] Descending");
        System.out.println(" [3] Exit");
        System.out.println("=================================");
        System.out.print(" Pilih : ");
        option = input.nextInt();
        switch (option) {
        case 1:
        sortedArr = divideAndConquerSortAscending(arr);
     // Menampilkan hasil sorting
        System.out.println(" Hasil sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.println(" "+sortedArr[i]+" ");
        }
        break;
        case 2:
        sortedArr = divideAndConquerSortDescending(arr);
     // Menampilkan hasil sorting
        System.out.println(" Hasil sorting : ");
        for (int i = 0; i < n; i++) {
            System.out.println(" "+sortedArr[i]+" ");
        }
        break;
        case 3:
        break;
        default:
        	System.out.println(" Invalid");   
        }
        }while(option != 3);
    }
    
    public static int[] divideAndConquerSortAscending(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        
        // Memecah array menjadi 2 bagian
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }
        
        // Mengurutkan setiap bagian
        left = divideAndConquerSortAscending(left);
        right = divideAndConquerSortAscending(right);
        
        // Menggabungkan kembali kedua bagian yang telah terurut
        int[] result = new int[arr.length];
        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[i + j] = left[i];
                i++;
            } else {
                result[i + j] = right[j];
                j++;
            }
        }
        while (i < left.length) {
            result[i + j] = left[i];
            i++;
        }
        while (j < right.length) {
            result[i + j] = right[j];
            j++;
        }
        
        return result;
    }
    
    public static int[] divideAndConquerSortDescending(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        
        // Memecah array menjadi 2 bagian
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }
        
     // Mengurutkan setiap bagian secara descending
        left = divideAndConquerSortDescending(left);
        right = divideAndConquerSortDescending(right);
        // Menggabungkan kembali kedua bagian yang telah terurut secara descending
        int[] result = new int[arr.length];
        int i = 0;
        int j = 0;
        while (i < left.length && j < right.length) {
            if (left[i] >= right[j]) {
                result[i + j] = left[i];
                i++;
            } else {
                result[i + j] = right[j];
                j++;
            }
        }
        while (i < left.length) {
            result[i + j] = left[i];
            i++;
        }
        while (j < right.length) {
            result[i + j] = right[j];
            j++;
        }
        
        return result;
    }
}
