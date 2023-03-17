package Modul_3;
import java.util.Scanner;

/*          PROGRAM MODUL 3
              BY AIPP_PROJECT03
                 LEARN TO BE PRODUCTIVE
                     MAY OUR DREAMS COME TRUE
                        GBU :)                      **/

public class Soal_1 {
	
	public static void ProductTable(String[] mobil, int[] harga){
		System.out.println("|=================================|");
		System.out.println("|     Produk    |      Harga      |");
		System.out.println("|===============|=================|");
		
		for(int i = 0; i < mobil.length; i++) {
			String spasi ="";
			for(int x = 0; x < 13-mobil[i].length(); x++) {
				spasi = spasi + " ";
			}
			String merapikan_tabel = String.format("| %s%s | %,d,000",mobil[i],spasi,harga[i]).replace(",",".");
			System.out.println(merapikan_tabel);
		}
		
	}
	
	public static void SearchProduct(String[] mobil, int[] harga){
		Scanner input = new Scanner(System.in);
		String cari;
		boolean found = false;
		System.out.print(" Ingin Mencari Produk Apa : ");
		cari = input.next();
		for(int i = 0; i < mobil.length; i++){
			if (mobil[i].equalsIgnoreCase(cari)) {
				System.out.println(" Produk "+cari+" Ditemukan Pada Indeks : "+(i+1));
				found = true;
			}
		}
			if(!found){
				System.out.println(" Data Tidak Ditemukan");
			}
	}
	
	public static void UrutkanHarga(String[] mobil, int[] harga) {
		int cobaHarga = 0;
		String cobaMobil;
		
		for(int i = 0; i < mobil.length; i++) {
			for(int n = 1; n < mobil.length-i; n++) {
				if (harga[n-1] > harga[n]) {
					cobaHarga = harga[n-1];
					cobaMobil = mobil[n-1];
					harga[n-1] = harga[n];
					mobil[n-1] = mobil[n];
					harga[n] = cobaHarga;
					mobil[n] = cobaMobil;
				}
			}
		}
		ProductTable(mobil, harga);
	}
	
	public static void Cheap2(String[] mobil, int[] harga){
		UrutkanHarga(mobil, harga);
		String Harga_Termurah = String.format("%,d,000",harga[1]).replace(",",".");
		System.out.println(" Mobil Termurah Urutan Ke-2 : ");
		System.out.println(" Produk : "+mobil[1]);
		System.out.println(" Harga  : "+Harga_Termurah);
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] mobil = {"Jaguar","Lamborgini","Honda","Audi","Suzuki","Mazda","Daihatsu","Ford","Hyundai","Mitsubishi" };
		int [] harga = {1340000,34500000,350000,2000000,245000,500000,169000,789000,122900,278100};
		int menu;
		do {
		ProductTable(mobil, harga);
		System.out.println("|============================================|");
		System.out.println("|       PENCARIAN PRODUK DALAM INDEX         |");
		System.out.println("|============================================|");
		System.out.println("|[1] Pencarian Produk                        |");
		System.out.println("|[2] Urutkan Produk Dari Yang Termurah-Mahal |");
		System.out.println("|[3] Produk Termurah Ke-2                    |");
		System.out.println("|[4] Exit                                    |");
		System.out.println("|============================================|");
        System.out.print("| Choose : ");
        menu = input.nextInt();
        switch(menu) {
        case 1:
        SearchProduct(mobil, harga);
        break;
        case 2:
        UrutkanHarga(mobil, harga);
        break;
        case 3:
        Cheap2(mobil, harga);
        break;
        case 4:
        break;
        default:
        System.out.println(" Invalid Command");
        }
		}while( menu != 4);
	}

}
