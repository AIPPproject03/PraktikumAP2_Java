package Modul_1;
import java.util.Scanner;

public class Soal_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int pilih;
		do {
		System.out.println("=========================================");
		System.out.println("  PROGRAM PENGULANGAN DENGAN ANGKA 1-15    ");
		System.out.println("=========================================");
		System.out.println();
		System.out.println("=========================================");
		System.out.println(" 1) Pengulangan While");
		System.out.println(" 2) Pengulangan While Do");
		System.out.println(" 3) Pengulangan For");
        System.out.println(" 4) Exit");
		System.out.println("=========================================");
		System.out.print(" Pilih : ");
		pilih = input.nextInt();
		switch (pilih) {
		case 1:
			int a = 1 ;
			int total1 = 0 ;
			System.out.println("-----------<<[Pengulangan While]>>-----------");
			System.out.println();
			System.out.print(" Bilangan Yang Keluar : ");
			while( a <= 15) {
				System.out.print(+a+" ");
				total1 += a;
				a++;
			}
			System.out.println();
			System.out.println(" Total Semua Bilangan = "+total1);
			input.nextLine();
			
		break;
		case 2:
		int b = 1 ;
		int total2 = 0 ;
        System.out.println("-----------<<[Pengulangan Do While]>>-----------");
			System.out.println();
			System.out.print(" Bilangan Yang Keluar : ");
			do{
                System.out.print(" "+b);
                total2 += b;
                b++;
			} while (b <= 15);
			System.out.println();
			System.out.println(" Total Semua Bilangan : = "+total2);
			input.nextLine();
		break;
		case 3:
		int c = 1 ;
		int total3 = 0 ;
        System.out.println("-----------<<[Pengulangan For]>>-----------");
			System.out.println();
			for (int x = 15 ; c <= x; c++){
                System.out.print(" "+c);
                total3 += c;
			}
			System.out.println();
			System.out.println(" Total Semua Bilangan = "+total3);
			input.nextLine();
		break;
		case 4:
		break;
		default:
		System.out.println(" Invalid Command");
		}
		} while (pilih != 4);
	}

}
