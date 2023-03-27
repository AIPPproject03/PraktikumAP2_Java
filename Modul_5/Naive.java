package Modul_5;

public class Naive { 
	 public static void main(String [] args) { 
		    String str = "Irwin";
		    String pattern = "win";
		    int n = str.length();
		    int m = pattern.length();
		    boolean found = false;
		    
		    if(m == 0) {
		        System.out.println(" You haven't input anything");
		    } else {
		        for (int s = 0; s <= n - m; s++) {
		            int j;
		            for (j = 0; j < m; j++) {
		                if (str.charAt(s + j) != pattern.charAt(j)) {
		                    break;
		                }
		            }
		            if (j == m) {
		                System.out.println(" Pola Muncul Pada Indeks Ke-" + s);
		                found = true;
		            }
		        }
		        
		        if (!found) {
		            System.out.println(" Tidak ditemukan pola yang cocok.");
		        }
		    }
		}
	}
