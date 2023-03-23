package Modul_5;

import java.util.Scanner;

public class SoalGabung {
	
//--------------------ALGORITMA NAIVE-----------------------//
	 public static void Naive(String str, String pattern) 
	 { 
	 int n = str.length(); 
	 int m = pattern.length(); 
	 
	 for (int s = 0; s <= n - m; s++) { 
	 int j; 
	 for (j = 0; j < m; j++) 
	 if (str.charAt(s + j) != pattern.charAt(j)) 
	 break; 
	 if (j == m) 
	 System.out.println(" Pola Muncul Pada Indeks Ke-" + s); 
	 } 
	 }
//--------------------ALGORITMA RABIN KARP-----------------------//
	 public final static int d = 10;
	 static void RabinKarp(String pattern, String txt, int q) {
		 int m = pattern.length();
		 int n = txt.length();
		 int i, j;
		 int p = 0;
		 int t = 0;
		 int h = 1;
		 for (i = 0; i < m - 1; i++)
		 h = (h * d) % q;
		 
		// hitung nilai hash untuk pattern and text
		 for (i = 0; i < m; i++) {
		 p = (d * p + pattern.charAt(i)) % q;
		 t = (d * t + txt.charAt(i)) % q;
		 }
		 // Cari kecocokan
		 for (i = 0; i <= n - m; i++) {
		 if (p == t) {
		 for (j = 0; j < m; j++) {
		 if (txt.charAt(i + j) != pattern.charAt(j))
		 break;
		 }
		 if (j == m)
		 System.out.println(" Pattern ditemukan pada posisi : " + (i + 1));
		 }
		 if (i < n - m) {
		 t = (d * (t - txt.charAt(i) * h) + txt.charAt(i + m)) % q;
		 if (t < 0)
		 t = (t + q);
		 }
		 }
		 }
//--------------------ALGORITMA INFINITE STATE AUTOMATA-----------------------// 
	 static int NO_OF_CHARS = 256;
	 static int getNextState(String pat, int M, int state, char x) {
	     //Jika karakter c sama dengan karakter berikutnya di dalam pattern maka increment state
	     if (state < M && x == pat.charAt(state))
	         return state + 1;
	     // ns adalah variabel yang menyimpan hasil state berikutnya (next state)
	     int ns, i;
	     // berikutnya ns berisi awalan terpanjang
	     // yang juga merupakan akhiran dalam "pat [0..state-1] c" 
	     // Mulai dari kemungkinan nilai terbesar
	     // dan berhenti ketika Anda menemukan awalan yang akhiran
	     for (ns = state; ns > 0; ns--) {
	         if (pat.charAt(ns - 1) == x) {
	             for (i = 0; i < ns - 1; i++)
	                 if (pat.charAt(i) != pat.charAt(state - ns + 1 + i))
	                     break;
	             if (i == ns - 1)
	                 return ns;
	         }
	     }
	     return 0;
	 }
	 /* membangun tabel untuk merepresentasikikan fungsi automata dari suatu pola */
	 static void computeTF(String pat, int M, int TF[][]) {
	     int state;
	     char x;
	     for (state = 0; state <= M; ++state)
	         for (x = 0; x < NO_OF_CHARS; ++x)
	             TF[state][x] = getNextState(pat, M, state, x);
	 }
	 /*Mencetak kemunculan pola dalam text*/
	 static void InfiniteStateAutomata(String txt, String pat) {
		    int M = pat.length();
		    int N = txt.length();

		    int[][] TF = new int[M + 1][NO_OF_CHARS];

		    computeTF(pat, M, TF);

		    // process pencocokan teks ke pola.
		    int i, state = 0;
		    for (i = 0; i < N; i++) {
		        state = TF[state][txt.charAt(i)];
		        if (state == M)
		            System.out.println("Pattern found " + "at index " + (i - M + 1));
		    }
		}
//--------------------ALGORITMA KNUTH MORRIS PRATT------------------------//
		 public static void KnuthMorrisPratt(String pat, String txt)
		 {
		 int M = pat.length();
		 int N = txt.length();
		 // buat variabel lps[] untuk menangani 
		 // nilai awalan dan akhiran terpanjang untuk pattern/pola
		 int lps[] = new int[M];
		 int j = 0;
		 // pra pemrosesan pattern (kalkulasi array lps[])
		 computeLPSArray(pat, M, lps);
		 int i = 0; // index for txt[]
		 while (i < N) {
		 if (pat.charAt(j) == txt.charAt(i)) {
		 j++;
		 i++;
		 }
		 if (j == M) {
		 System.out.println("Pattern ditemukan pada "
		 + "at index " + (i - j));
		 j = lps[j - 1];
		 }
		 // ketidakcocokan pada pencocokan indeks J pattern
		 else if (i < N && pat.charAt(j) != txt.charAt(i)) {
		 if (j != 0)
		 j = lps[j - 1];
		 else
		 i = i + 1;
		 }
		 }
		 }
		 public static void computeLPSArray(String pat, int M, int lps[])
		 {	 
		 // panjang dari awalan(prefix) dan akhiran (suffix) 
		 //terpanjang sebelumnya
		 int len = 0;
		 int i = 1;
		 lps[0] = 0;
		 // Looping untuk kalkulasi lps[i] = 1 sampai M-1
		 while (i < M) {
		 if (pat.charAt(i) == pat.charAt(len)) {
		 len++;
		 lps[i] = len;
		 i++;
		 }
		 else
		 {	 
		 if (len != 0) {
		 len = lps[len - 1];
		 }
		 else {
		 lps[i] = len;
		 i++;
		 }
		 }
		 }
		 }

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Var Around Naive //
		String text = "Saya mau makan";
		String search;
		int menu;
		
		do {
		System.out.println(" _________________________________");
		System.out.println(" |=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|=|");
		System.out.println(" |                               |");
		System.out.println("[1] Naive                        |");
		System.out.println("[2] Rabin Karp                   |");
		System.out.println("[3] Infinite State Automata      |");
		System.out.println("[4] Knuth Morris Pratt           |");
		System.out.println("[5] EXIT                         |");
		System.out.println(" |_______________________________|");
		System.out.println(" [A][I][P][P][I][R][W][I][N][0][3]");
		System.out.println(" =================================");
		System.out.print(" Choose : ");
		menu = input.nextInt();
		switch (menu) {
		case 1:
		System.out.println(" Text : "+text);
		System.out.println();
		System.out.print(" Kata Yang Ingin Dicari : ");
		input.nextLine();
		search = input.nextLine();
		Naive(text, search);
		break;
		case 2:
		System.out.println(" Text : "+text);
		System.out.println();
		System.out.print(" Kata Yang Ingin Dicari : ");
		input.nextLine();
		search = input.nextLine();
		int q = 1;
		RabinKarp(search, text, q);
		break;
		case 3:
		System.out.println(" Text : "+text);
		System.out.println();
		System.out.print(" Kata Yang Ingin Dicari : ");
		input.nextLine();
		search = input.nextLine();
		InfiniteStateAutomata(text, search);
		break;
		case 4:
		System.out.println(" Text : "+text);
		System.out.println();
		System.out.print(" Kata Yang Ingin Dicari : ");
		input.nextLine();
		search = input.nextLine();
		KnuthMorrisPratt(search, text);	
		break;
		case 5:
		break;
		default:
		System.out.println(" Invalid Command");
		}
		}while (menu != 5);
	}
}
