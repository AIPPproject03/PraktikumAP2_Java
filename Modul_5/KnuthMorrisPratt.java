package Modul_5;

public class KnuthMorrisPratt {

	public static void KnuthMorrisPratt(String pat, String txt) {
	    int M = pat.length(); // Panjang Pattern
	    int N = txt.length(); // Panjang Text
	    int lps[] = new int[M]; // Array Untuk Menampung Nilai Lps
	    int j = 0; // index untuk pattern
	    boolean found = false;
	    computeLPSArray(pat, M, lps); // Kalkulasi Lps Array

	    int i = 0; // Index Untuk Text
	    while (i < N) {
	        if (pat.charAt(j) == txt.charAt(i)) { // Karakter Pada Pattern Dan Text Yang Sama
	            j++;
	            i++;
	        }
	        if (j == M) { // Pattern Ditemukan Pada Indeks (i-j)
	            System.out.println(" Pattern ditemukan pada index " + (i - j));
	            found = true;
	            j = lps[j - 1]; // Cari Pattern Selanjutnya Dengan Memanfaatkan Nilai lps
	        } else if (i < N && pat.charAt(j) != txt.charAt(i)) { // Karakter Pada Pattern Dan Text Yang Tidak Sama
	            if (j != 0)
	                j = lps[j - 1]; // Cari Pattern Selanjutnya Dengan Memanfaatkan Nilai lps
	            else
	                i = i + 1;
	        }
	    }
	    if (!found) { // Tidak Ada Pattern Yang Ditemukan
	        System.out.println(" The Pattern Is Not Found");
	    }
	}

	public static void computeLPSArray(String pat, int M, int lps[]) {
	    int len = 0; // Panjang Awalan Dan Akhiran Terpanjang Sebelumnya
	    int i = 1; // Index Untuk Menghitung lps
	    lps[0] = 0; // Nilai lps Untuk Karakter Pertama Selalu 0

	    while (i < M) {
	        if (pat.charAt(i) == pat.charAt(len)) { // Karakter Pada Awalan Dan Akhiran Terpanjang Sama
	            len++;
	            lps[i] = len;
	            i++;
	        } else {
	            if (len != 0) {
	                len = lps[len - 1]; // Cari Nilai lps Dengan Menggunakan Nilai lps Sebelumnya
	            } else {
	                lps[i] = len; // Karakter Pada Awalan Dan Akhiran Terpanjang Tidak Sama, Maka Nilai lps Sama Dengan 0
	                i++;
	            }
	        }
	    }
	}
	
	public static void main(String[] args) {
		String text   = "Saya mau makan";
		String search = "aka";
		
		KnuthMorrisPratt(search, text);

	}

}
