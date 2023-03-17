package Modul_1;
import java.util.Scanner;

public class Soal_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	 //------------------------VARIABLE------------------------//	
        double angka = 0;
        double angkatotal = 0;
        double rata2 = 0;
        
     //-----------------------MAIN PROGRAM---------------------//
        System.out.println("====================================");
		System.out.println("    PROGRAM MENGHITUNG RATA-RATA    ");
		System.out.println("====================================");
		System.out.println();
        System.out.print(" Berapa Jumlah Angka : ");
        int n = input.nextInt();
        for( int i = 0; i < n; i++ ){
            System.out.print(" Angka ke-" + (i+1) + ": ");
            angka = input.nextDouble();
            angkatotal += angka;
        }

        System.out.println("---------------------------");
        System.out.println(" Total Nilai KEseluruhan = "+angkatotal);
        System.out.println(" Jadi jika dirata-ratakan = "+(rata2 = angkatotal/n));
	}

}
