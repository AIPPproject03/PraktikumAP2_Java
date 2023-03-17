/*                                               
                                                     
       ORIGINAL PROJECT BY :
       
       AIPP_PROJECT03
       Aippirwin A.K.A TINUS
       
       COPYRIGHT 2023
                                                     
                                                              */

package Modul_4;
public class Soal_1{
	public static void main(String[] args) {
		
		/*  Graph :
		 *            A            
		 *          / |\ \                 
		 *       (9)  (12)\
		 *       /    | \  \         
		 *      B--(4)|--C (15)                  
		 *     / \    |  |\  \
		 *    |   \   |  |(10)\     
		 *   (2)   |(11) |   \ |      
		 *    |    |  | (5)   G      
		 *    |   (3) | /    /      
		 *    D    |  |/  (14)
		 *    |(2) |  |   / 
		 *   (7) \  \ |  /         
		 *    |   ---\| /         
		 *    F--(6)---E           
		 *                         
		 *                          **/
		
	int graph[][] = new int[][] {/*A*/{0,9,12,0,11,0,15},/*B*/{9,0,4,2,3,8,0},/*C*/{12,4,0,0,5,0,10},/*D*/{0,2,0,0,2,7,0},
		                        /*E*/{11,3,5,2,0,6,14},/*F*/{0,8,0,7,6,0,0},/*G*/{15,0,10,0,14,0,0}};
	
	int pilih[] = new int[7];
	int min = 999;
	int u = 0;
	int v = 0;
	int total = 0;
	
	for (int i = 0; i < 7; i++) {
		pilih[i] = 0;
		for (int j = 0; j < 7; j++) {
			if (graph [i][j] == 0) {
				graph[i][j] = 999;
			}
		}
	}
	pilih[0]=1;
	
	for (int con = 0; con < 6; con++) {
		min = 999;
		for (int i = 0; i < 7; i++) {
			if (pilih[i] == 1)
				for (int j = 0; j < 7; j++) {
					if (pilih[j] == 0) {
						if (min > graph[i][j]) {
							min = graph[i][j];
							u = i;
							v = j;
						}
					}
				}
		}
		pilih[v] = 1;
		total = total+min;
		System.out.println(" Sumber : "+u+"---->"+v+" = "+min);
	}
	    System.out.println(" Jadi, Nilai Minimum Spanning Tree Ini Adalah : "+total);
	}
}