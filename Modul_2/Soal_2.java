package Modul_2;

import Modul_2.Soal_2_input;

public class Soal_2 {
    private String[] nik = new String[100]; 
    private String[] nama = new String[100]; 
    private int[] gapok = new int[100]; 
    public int n;

    public void setNIK (int i, String x) {
        this.nik[i] = x;
    }

    public void setNama (int i, String x) {
        this.nama[i] = x;
    }

    public void setGapok (int i, int x) {
        this.gapok[i] = x;
    }

    public float rerataGapok () {
        int sum = 0;
        for (int i=0; i<this.n; i++) {
            sum += this.gapok[i];
        }
        return sum/(float)this.n;
    }

    public void setJmlKaryawan(int x) {
        this.n = x;
    }

    public void tampilData () {
        System.out.println("==========================================");
        System.out.println(" NIK\t NAMA\t\tGAJI");
        System.out.println("==========================================");
        for (int i=0; i<this.n; i++) {
            System.out.println(String.format(" %-5s\t%-15sRp %-5s", nik[i], nama[i], gapok[i]));
        }
        System.out.println("==========================================");
        System.out.println("Rata-rata gaji pokok dari " + this.n + " karyawan adalah Rp " + this.rerataGapok());
    }

    public static void main(String[] args) {
        int n;
        Soal_2 dataKar = new Soal_2(); 
        System.out.print("Berapa jumlah karyawan: ");
        n = Soal_2_input.bacaInt();
        dataKar.setJmlKaryawan(n);
        for (int i=0; i<dataKar.n; i++) {
            System.out.println(" Karyawan ke-" + (i+1));
            System.out.print(" Masukan NIK        : "); 
            dataKar.setNIK(i, Soal_2_input.bacaString());
            System.out.print(" Masukan Nama       : ");
            dataKar.setNama(i, Soal_2_input.bacaString()); 
            System.out.print(" Masukan Gaji Pokok : ");
            dataKar.setGapok(i, Soal_2_input.bacaInt());
        }
        dataKar.tampilData();
    }
}
