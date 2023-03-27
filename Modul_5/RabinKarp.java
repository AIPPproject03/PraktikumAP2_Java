package Modul_5;

import java.util.Scanner;

public class RabinKarp {
	public static int Cari(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        int p = 0; // Nilai Hash Untuk Pattern
        int t = 0; // Nilai Hash Untuk Text Utama
        int h = 1; // Nilai Modulus
        int d = 256; // Jumlah Yang Digunakan Untuk Menebak Jumlah Karakter Dalam ASCII
        int prime = 101; // Jumlah Bilangan Prima Yang Digunakan Untuk Menghitung Modulus
        int i, j;
 
        // Hitung Nilai Modulus (h = d^(m-1) % prime)
        for (i = 0; i < m - 1; i++) {
            h = (h * d) % prime;
        }
 
        // Hitung Hash Value Untuk Pattern Dan Text
        for (i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % prime;
            t = (d * t + text.charAt(i)) % prime;
        }
 
        // Cari Kecocokan Pattern Dalam Text
        for (i = 0; i <= n - m; i++) {
            if (p == t) {
                for (j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j))
                        break;
                }
                if (j == m)
                    return i; // Mengembalikan Nilai Jika Ada Pattern Yang Ditemukan Didalam Text
            }
            if (i < n - m) {
                t = (d * (t - text.charAt(i) * h) + text.charAt(i + m)) % prime;
                if (t < 0)
                    t = (t + prime);
            }
        }
        return -1; // Mengembalikan Nilai Jika Pattern Tidak Ditemukan Dalam Teks
    }
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		String text = "Saya mau makan";
		String search;
		System.out.println(" Text : "+text);
		System.out.println();
		System.out.print(" Kata Yang Ingin Dicari : ");
		search = input.nextLine();
		int index = Cari(text, search);
        if (index == -1) {
            System.out.println(" Pattern tidak ditemukan dalam teks.");
        } else {
            System.out.println(" Pattern ditemukan pada indeks: " + index);
        }
	}
	
}
