/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
   
class Main {
  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Biodata Mahasiswa ##");
    System.out.println("========================================");
    System.out.println();
     
    String nama, kelas, fakultas, tanggal_masuk, kota_asal, alamat;
  
    System.out.print("Nama mahasiswa: ");
    nama = input.nextLine();
     
    System.out.print("Kelas: ");
    kelas = input.nextLine();
     
    System.out.print("Fakultas: ");
    fakultas = input.nextLine();
     
    System.out.print("Tanggal Masuk: ");
    tanggal_masuk = input.nextLine();
     
    System.out.print("Kota Asal: ");
    kota_asal = input.nextLine();
     
    System.out.print("Alamat: ");
    alamat = input.nextLine();
     
    System.out.println();
     
    System.out.println("# Data Mahasiswa #");
    System.out.println("==================");
    System.out.println("Nama: "      + nama);
    System.out.println("Kelas: "       + kelas);
    System.out.println("Fakultas: "  + fakultas);
    System.out.println("Tanggal Masuk: "   + tanggal_masuk);
    System.out.println("Kota Asal: " + kota_asal);
    System.out.println("Alamat: "    + alamat);
  }
}
