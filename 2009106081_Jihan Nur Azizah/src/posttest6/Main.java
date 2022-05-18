/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest6;
import posttest5.*;
import posttest4.*;
import posttest3.*;
import posttest2.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException; 

/**
 *
 * @author GEFORCE_i5
 */
public class Main {
    static ArrayList<Kayu> Kayu = new ArrayList<Kayu>();
    static ArrayList<Bahanlemari> Bahanlemari = new ArrayList<>();
    static ArrayList<Catlemari> Catlemari = new ArrayList<>();
    
    public static void main(String[] args)throws Exception {
        
      while(true){
          menu();
      }
    }  
   public static void menu() throws IOException{
       InputStreamReader home = new InputStreamReader(System.in);
       BufferedReader input = new BufferedReader(home);
            System.out.println("");
            System.out.println("*****************TOKO MEUBEL******************");
            System.out.println("*****************************************************");
            System.out.println("1. Masukkan Data Barang Yang Ingin di Masukkan");
            System.out.println("2. Lihat Data Barang Lemari"); 
            System.out.println("3. Ubah Data Barang Lemari");
            System.out.println("4. Hapus Data Barang Lemari");
            System.out.println("5. Pesan Barang Lemari Yang Ingin Di Beli");
            System.out.println("6. EXIT");
            System.out.println("*****************************************************");
            System.out.println("Pilih[1-6] = ");
        int pilih = Integer.valueOf(input.readLine());
            switch (pilih){
            case 1:
                    input();
                    break;
            case 2:
                    tambah();
                    break;
            case 3:
                    udata();
                    break;
            case 4:
                    hdata();
                    break;
            case 5:
                    pesan();
                    break;
            case 6:
                    backmenu();
                    break;
            default:
                menu(); 
            } 
        }

public static void input() throws IOException{
            InputStreamReader tambah = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(tambah);
            
            String nama;
            int harga;
            int pilihan;
            
    System.out.println("1. Bahan Lemari");
    System.out.println("2. Cat Lemari");
    System.out.println("Masukan pilihan Yang Ingin Anda Pilih : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
        System.out.println("Masukan Nama Barang Lemari : ");
        nama = input.readLine();
        System.out.println("Masukan Harga Barang Lemari : ");
        harga = Integer.parseInt(input.readLine());
        System.out.println("Masukan Merek Barang Lemari: ");
        String merek = input.readLine();
        System.out.println("Masukan Bahan Barang Lemari : ");
        String bahan = input.readLine();
        Bahanlemari.add(new Bahanlemari(nama, harga, merek, bahan));
        } else {
        if (pilihan == 2) {
        System.out.println("Masukan Nama Barang Lemari: ");
        nama = input.readLine();
        System.out.println("Masukan Harga Barang Lemari: ");
        harga = Integer.parseInt(input.readLine());
        System.out.println("Masukan Jumlah Barang Lemari: ");
        String jumlah = input.readLine();
        System.out.println("Masukan Ukuran Barang Lemari: ");
        String ukuran = input.readLine();
        Catlemari.add(new Catlemari(nama, harga, jumlah, ukuran));
        }
        

}           
}

public static void tambah()throws IOException{    
    InputStreamReader tambah = new InputStreamReader(System.in);
    BufferedReader input = new BufferedReader(tambah);
    int pilihan;
    System.out.println("1. Bahan Lemari");
    System.out.println("2. Cat Lemari");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
                        for (int i = 0; i < Bahanlemari.size(); i++) {
                            System.out.println("Bahan Lemari ke - " + (i + 1));
                            Bahanlemari.get(i).display();
                        }
                    } else {
                        for (int i = 0; i < Catlemari.size(); i++) {
                            System.out.println("Cat Lemari ke - " + (i + 1));
                            Catlemari.get(i).display();
                        }
                    }

            }

public static void udata()throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    int pilihan;
    String nama;
    int harga;
    String rasa;
    String ukuran;
    tambah();
    System.out.println("1. Bahan Lemari");
    System.out.println("2. Cat Lemari");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    System.out.println("Ubah Data Barang Toko Meubel");
    if (pilihan == 1) {
                        System.out.println("Masukan Nama Barang Lemari : ");
                        nama = input.readLine();
                        for (Bahanlemari i : Bahanlemari) {
                            if (i.getNama().equals(nama)) {
                                System.out.println("Masukan Nama Barang Lemari baru : ");
                                i.setNama(input.readLine());
                                System.out.println("Masukan Harga Barang Lemari baru : ");
                                i.setHarga(Integer.parseInt(input.readLine()));
                                System.out.println("Masukan Merek Barang Lemari baru : ");
                                i.setmerek(input.readLine());
                                System.out.println("Masukan Bahan Barang Lemari baru : ");
                                i.setbahan(input.readLine());
                            }
                        }
                    } else {
                        System.out.println("Masukan Nama Barang Lemari : ");
                        nama = input.readLine();
                        for (Catlemari i : Catlemari) {
                            if (i.getNama().equals(nama)) {
                                System.out.println("Masukan Nama Barang Lemari baru : ");
                                i.setNama(input.readLine());
                                System.out.println("Masukan Harga Barang Lemari baru : ");
                                i.setHarga(Integer.parseInt(input.readLine()));
                                System.out.println("Masukan Jumlah Barang Lemari baru : ");
                                i.setjumlah(input.readLine());
                                System.out.println("Masukan Ukuran Barang Lemari baru : ");
                                i.setUkuran(input.readLine());
                            }
                        }
                    }
}

public static void hdata() throws IOException{
    tambah();
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader (tambah);
    int pilihan;
    int t;
    System.out.println("1. Bahan Lemari");
    System.out.println("2. Cat Lemari");
    System.out.println("Masukan pilihan : ");
    pilihan = Integer.parseInt(input.readLine());
    if (pilihan == 1) {
        System.out.println("Input Nomor Barang Lemari  Yang Ingin Anda Hapus = ");
        t = Integer.parseInt(input.readLine());
        t--;
    
        Bahanlemari.get(t).hdata();
        Bahanlemari.remove(t);
    } else {
    System.out.println("Input Nomor Barang Lemari Yang Ingin Anda Hapus = ");
    t = Integer.parseInt(input.readLine());
    t--;
    
    Catlemari.get(t).hdata();
    Catlemari.remove(t);

    }
}

public static void backmenu() throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader(tambah);
    
    int a;
    System.out.println("THANK YOU TELAH BERBELANJA DI TOKO MEUBEL");
    System.out.println("Tekan 1 lalu Tekan ENTER untuk melanjutkan");
    a = Integer.parseInt(input.readLine());
    menu();
    }

public static void pesan() throws IOException{
    InputStreamReader tambah = new InputStreamReader (System.in);
    BufferedReader input = new BufferedReader(tambah);
    
    int berapa;
    
    Pemesanan kayu = new Proses();
    
    Kasir jihan = new Kasir(kayu);
    
    System.out.println("Buat Pesanan Barang Bangunan");
    System.out.println("Mau Pesan Berapa Barang?");
    berapa = Integer.parseInt(input.readLine());
    jihan.pesanb();
    
}


}