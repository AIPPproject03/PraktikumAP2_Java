package Modul_1;
import java.util.Scanner;

public class Soal_2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//----------------------VARIABLE------------------------//
		double gaji_bersih;
		double gaji_kotor;
		
		//---------------------MAIN PROGRAM---------------------//
		System.out.println("====================================");
		System.out.println("     PROGRAM MENGHITUNG GAJI 5%     ");
		System.out.println("====================================");
		System.out.println();
		System.out.print(" Masukan Gaji Kotormu : ");
		gaji_kotor = input.nextDouble();
		
		gaji_bersih = gaji_kotor - (gaji_kotor * 0.05);
		
		System.out.println();
		System.out.println(" Jadi, Gaji Bersihmu Setelah Dipotong 5% = "+gaji_bersih);	
	}

}
