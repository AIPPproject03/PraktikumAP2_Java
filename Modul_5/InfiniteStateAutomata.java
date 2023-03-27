package Modul_5;

public class InfiniteStateAutomata {

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
	     for (state = 0; state <= M; state++)
	         for (x = 0; x < NO_OF_CHARS; x++)
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
		            System.out.println(" Pattern found " + "at index " + (i - M + 1));
		    }
		}
	
	public static void main(String[] args) {
		String text   = "Irwin";
		String search = "win";
		InfiniteStateAutomata(text, search);

	}

}
