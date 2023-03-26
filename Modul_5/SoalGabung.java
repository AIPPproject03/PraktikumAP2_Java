package Modul_5;

import java.util.Scanner;

/*    
[ TABEL ASCII ]     
0	0000	NUL	Null (tidak terlihat)
1	0001	SOH	Start of heading (tidak terlihat)
2	0002	STX	Start of text (tidak terlihat)
3	0003	ETX	End of text (tidak terlihat)
4	0004	EOT	End of transmission (tidak terlihat)
5	0005	ENQ	Enquiry (tidak terlihat)
6	0006	ACK	Acknowledge (tidak terlihat)
7	0007	BEL	Bell (tidak terlihat)
8	0008	BS	Backspace
9	0009	HT	Horizontal tabulation
10	000A	LF	Pergantian baris (Line feed)
11	000B	VT	Tabulasi vertikal
12	000C	FF	Pergantian baris (Form feed)
13	000D	CR	Pergantian baris (carriage return)
14	000E	SO	Shift out (tidak terlihat)
15	000F	SI	Shift in (tidak terlihat)
16	0010	DLE	Data link escape (tidak terlihat)
17	0011	DC1	Device control 1 (tidak terlihat)
18	0012	DC2	Device control 2 (tidak terlihat)
19	0013	DC3	Device control 3 (tidak terlihat)
20	0014	DC4	Device control 4 (tidak terlihat)
21	0015	NAK	Negative acknowledge (tidak terlihat)
22	0016	SYN	Synchronous idle (tidak terlihat)
23	0017	ETB	End of transmission block (tidak terlihat)
24	0018	CAN	Cancel (tidak terlihat)
25	0019	EM	End of medium (tidak terlihat)
26	001A	SUB	Substitute (tidak terlihat)
27	001B	ESC	Escape (tidak terlihat)
28	001C	FS	File separator
29	001D	GS	Group separator
30	001E	RS	Record separator
31	001F	US	Unit separator
32	0020	spasi	Spasi
33	0021	!	Tanda seru (exclamation)
34	0022	“	Tanda kutip dua
35	0023	#	Tanda pagar (kres)
36	0024	$	Tanda mata uang dolar
37	0025	%	Tanda persen
38	0026	&	Karakter ampersand (&)
39	0027	‘	Karakter Apostrof
40	0028	(	Tanda kurung buka
41	0029	)	Tanda kurung tutup
42	002A	*	Karakter asterisk (bintang)
43	002B	+	Tanda tambah (plus)
44	002C	,	Karakter koma
45	002D	–	Karakter hyphen (strip)
46	002E	.	Tanda titik
47	002F	/	Garis miring (slash)
48	0030	0	Angka nol
49	0031	1	Angka satu
50	0032	2	Angka dua
51	0033	3	Angka tiga
52	0034	4	Angka empat
53	0035	5	Angka lima
54	0036	6	Angka enam
55	0037	7	Angka tujuh
56	0038	8	Angka delapan
57	0039	9	Angka sembilan
58	003A	:	Tanda titik dua
59	003B	;	Tanda titik koma
60	003C	< 	Tanda lebih kecil
61	003D	=	Tanda sama dengan
62	003E	> 	Tanda lebih besar
63	003F	?	Tanda tanya
64	0040	@	A keong (@)
65	0041	A	Huruf latin A kapital
66	0042	B	Huruf latin B kapital
67	0043	C	Huruf latin C kapital
68	0044	D	Huruf latin D kapital
69	0045	E	Huruf latin E kapital
70	0046	F	Huruf latin F kapital
71	0047	G	Huruf latin G kapital
72	0048	H	Huruf latin H kapital
73	0049	I	Huruf latin I kapital
74	004A	J	Huruf latin J kapital
75	004B	K	Huruf latin K kapital
76	004C	L	Huruf latin L kapital
77	004D	M	Huruf latin M kapital
78	004E	N	Huruf latin N kapital
79	004F	O	Huruf latin O kapital
80	0050	P	Huruf latin P kapital
81	0051	Q	Huruf latin Q kapital
82	0052	R	Huruf latin R kapital
83	0053	S	Huruf latin S kapital
84	0054	T	Huruf latin T kapital
85	0055	U	Huruf latin U kapital
86	0056	V	Huruf latin V kapital
87	0057	W	Huruf latin W kapital
88	0058	X	Huruf latin X kapital
89	0059	Y	Huruf latin Y kapital
90	005A	Z	Huruf latin Z kapital
91	005B	[	Kurung siku kiri
92	005C	/	Garis miring terbalik (backslash)
93	005D	]	Kurung sikur kanan
94	005E	^	Tanda pangkat
95	005F	_	Garis bawah (underscore)
96	0060	`	Tanda petik satu
97	0061	a	Huruf latin a kecil
98	0062	b	Huruf latin b kecil
99	0063	c	Huruf latin c kecil
100	0064	d	Huruf latin d kecil
101	0065	e	Huruf latin e kecil
102	0066	f	Huruf latin f kecil
103	0067	g	Huruf latin g kecil
104	0068	h	Huruf latin h kecil
105	0069	i	Huruf latin i kecil
106	006A	j	Huruf latin j kecil
107	006B	k	Huruf latin k kecil
108	006C	l	Huruf latin l kecil
109	006D	m	Huruf latin m kecil
110	006E	n	Huruf latin n kecil
111	006F	o	Huruf latin o kecil
112	0070	p	Huruf latin p kecil
113	0071	q	Huruf latin q kecil
114	0072	r	Huruf latin r kecil
115	0073	s	Huruf latin s kecil
116	0074	t	Huruf latin t kecil
117	0075	u	Huruf latin u kecil
118	0076	v	Huruf latin v kecil
119	0077	w	Huruf latin w kecil
120	0078	x	Huruf latin x kecil
121	0079	y	Huruf latin y kecil
122	007A	z	Huruf latin z kecil
123	007B	{	Kurung kurawal buka
124	007C	|	Garis vertikal (pipa)
125	007D	}	Kurung kurawal tutup
126	007E	~	Karakter gelombang (tilde)
127	007F	DEL	Delete
128	0080	€	Euro sign
129	0081		
130	0082	‚	Single low-9 quotation mark
131	0083	ƒ	Latin small letter f with hook
132	0084	„	Double low-9 quotation mark
133	0085	…	Horizontal ellipsis
134	0086	†	Dagger
135	0087	‡	Double dagger
136	0088	ˆ	Modifier letter circumflex accent
137	0089	‰	Per mille sign
138	008A	Š	Latin capital letter S with caron
139	008B	‹	Single left-pointing angle quotation
140	008C	Œ	Latin capital ligature OE
141	008D		
142	008E	Ž	Latin captial letter Z with caron
143	008F		
144	0090		
145	0091	‘	Left single quotation mark
146	0092	’	Right single quotation mark
147	0093	“	Left double quotation mark
148	0094	”	Right double quotation mark
149	0095	•	Bullet
150	0096	–	En dash
151	0097	—	Em dash
152	0098	˜	Small tilde
153	0099	™	Trade mark sign
154	009A	š	Latin small letter S with caron
155	009B	›	Single right-pointing angle quotation mark
156	009C	œ	Latin small ligature oe
157	009D		
158	009E	ž	Latin small letter z with caron
159	009F	Ÿ	Latin capital letter Y with diaeresis
160	00A0		Spasi yang bukan pemisah kata
161	00A1	¡	Tanda seru terbalik
162	00A2	¢	Tanda sen (Cent)
163	00A3	£	Tanda Poundsterling
164	00A4	¤	Tanda mata uang (Currency)
165	00A5	¥	Tanda Yen
166	00A6	¦	Garis tegak putus-putus
167	00A7	§	Section sign
168	00A8	¨	Spacing diaeresis – umlaut
169	00A9	©	Tanda hak cipta (Copyright)
170	00AA	ª	Feminine ordinal indicator
171	00AB	«	Left double angle quotes
172	00AC	¬	Not sign
173	00AD		Tanda strip (hyphen)
174	00AE	®	Tanda merk terdaftar
175	00AF	¯	Spacing Macron (Macron)
176	00B0	°	Tanda derajat
177	00B1	±	Tanda kurang lebih (plus-minus)
178	00B2	²	Tanda kuadrat (pangkat dua)
179	00B3	³	Tanda kubik (pangkat tiga)
180	00B4	´	Acute accent
181	00B5	µ	Micro sign
182	00B6	¶	Pilcrow sign
183	00B7	·	Middle dot
184	00B8	¸	Spacing cedilla
185	00B9	¹	Superscript one
186	00BA	º	Masculine ordinal indicator
187	00BB	»	Right double angle quotes
188	00BC	¼	Fraction one quarter
189	00BD	½	Fraction one half
190	00BE	¾	Fraction three quarters
191	00BF	¿	Inverted question mark
192	00C0	À	Latin capital letter A with grave
193	00C1	Á	Latin capital letter A with acute
194	00C2	Â	Latin capital letter A with circumflex
195	00C3	Ã	Latin capital letter A with tilde
196	00C4	Ä	Latin capital letter A with diaeresis
197	00C5	Å	Latin capital letter A with ring above
198	00C6	Æ	Latin capital letter AE
199	00C7	Ç	Latin capital letter C with cedilla
200	00C8	È	Latin capital letter E with grave
201	00C9	É	Latin capital letter E with acute
202	00CA	Ê	Latin capital letter E with circumflex
203	00CB	Ë	Latin capital letter E with diaeresis
204	00CC	Ì	Latin capital letter I with grave
205	00CD	Í	Latin capital letter I with acute
206	00CE	Î	Latin capital letter I with circumflex
207	00CF	Ï	Latin capital letter I with diaeresis
208	00D0	Ð	Latin capital letter ETH
209	00D1	Ñ	Latin capital letter N with tilde
210	00D2	Ò	Latin capital letter O with grave
211	00D3	Ó	Latin capital letter O with acute
212	00D4	Ô	Latin capital letter O with circumflex
213	00D5	Õ	Latin capital letter O with tilde
214	00D6	Ö	Latin capital letter O with diaeresis
215	00D7	×	Multiplication sign
216	00D8	Ø	Latin capital letter O with slash
217	00D9	Ù	Latin capital letter U with grave
218	00DA	Ú	Latin capital letter U with acute
219	00DB	Û	Latin capital letter U with circumflex
220	00DC	Ü	Latin capital letter U with diaeresis
221	00DD	Ý	Latin capital letter Y with acute
222	00DE	Þ	Latin capital letter THORN
223	00DF	ß	Latin small letter sharp s – ess-zed
224	00E0	à	Latin small letter a with grave
225	00E1	á	Latin small letter a with acute
226	00E2	â	Latin small letter a with circumflex
227	00E3	ã	Latin small letter a with tilde
228	00E4	ä	Latin small letter a with diaeresis
229	00E5	å	Latin small letter a with ring above
230	00E6	æ	Latin small letter ae
231	00E7	ç	Latin small letter c with cedilla
232	00E8	è	Latin small letter e with grave
233	00E9	é	Latin small letter e with acute
234	00EA	ê	Latin small letter e with circumflex
235	00EB	ë	Latin small letter e with diaeresis
236	00EC	ì	Latin small letter i with grave
237	00ED	í	Latin small letter i with acute
238	00EE	î	Latin small letter i with circumflex
239	00EF	ï	Latin small letter i with diaeresis
240	00F0	ð	Latin small letter eth
241	00F0	ñ	Latin small letter n with tilde
242	00F0	ò	Latin small letter o with grave
243	00F0	ó	Latin small letter o with acute
244	00F0	ô	Latin small letter o with circumflex
245	00F0	õ	Latin small letter o with tilde
246	00F0	ö	Latin small letter o with diaeresis
247	00F0	÷	Division sign
248	00F0	ø	Latin small letter o with slash
249	00F0	ù	Latin small letter u with grave
250	00F0	ú	Latin small letter u with acute
251	00F0	û	Latin small letter u with circumflex
252	00F0	ü	Latin small letter u with diaeresis
253	00F0	ý	Latin small letter y with acute
254	00F0	þ	Latin small letter thorn
255	00F0	ÿ	Latin small letter y with diaeresis
 **/

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
	 static void RabinKarp(String pattern, String txt) {
		 int pat_long = pattern.length(); // Panjang Pattern 
		 int txt_long = txt.length();     // Panjang Text Utama
		 int i, j;                        // Inisialisasi Variabel i dan j
		 int hash_p = 0;                  // Nilai Hash Untuk Pattern
		 int hash_t = 0;                  // Nilai Hash Untuk Teks Utama
		 int h = 1;                       // Modulisasi Hash
		 int ASCII = 256;                 // Jumlah Karakter Pada ASCII
		 int prime = 101;                 // Bilangan Prima Untuk Perhitungan Modulisasi
		 
		 // Hitung Modulisasi h
		 for (i = 0; i < pat_long - 1; i++) {
		 h = (h * ASCII) % prime;
		 }
		// Hitung Nilai Hash Untuk Pattern And Text
		 for (i = 0; i < pat_long; i++) {
		 hash_p = (ASCII * hash_p + pattern.charAt(i)) % prime;
		 hash_t = (ASCII * hash_t + txt.charAt(i)) % prime;
		 }
		 // Cari Kecocokan
		 for (i = 0; i <= txt_long - pat_long; i++) {
		    if (hash_p == hash_t) {
		      for (j = 0; j < pat_long; j++) {
		         if (txt.charAt(i + j) != pattern.charAt(j))
		         break;
		        }
		         if (j == pat_long)
		           System.out.println(" Pattern ditemukan pada posisi : " + i);
		        }
		         if (i < txt_long - pat_long) {
		           hash_t = (ASCII * (hash_t - txt.charAt(i) * h) + txt.charAt(i + pat_long)) % prime;
		         if (hash_t < 0)
	               hash_t = (hash_t + prime);
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
		String text = "Saya lagi makan";
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
		RabinKarp(search, text);
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

