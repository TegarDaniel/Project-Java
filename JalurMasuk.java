/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import java.util.Scanner;

/**
 *
 * @author moklet gaming 1
 */
public class JalurMasuk {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int jalurmasuk, golongan;
        System.out.print("Masukkan nama anda : ");
        nama = input.nextLine();
        System.out.println("Pilih Jalur Masuk anda");
        System.out.println("1. SBMPTN");
        System.out.println("2. SNMPTN");
        System.out.println("3. Mandiri");
        System.out.print("Masukkan jalur anda dalam angka : ");
        jalurmasuk = input.nextInt();
        switch (jalurmasuk) {
            case 1:
                System.out.println("Pilihan golongan pendapatan");
                System.out.println("1. A");
                System.out.println("2. B");
                System.out.println("3. C");
                System.out.print("Pilih golongan pendapatan anda dalam angka : ");
                golongan = input.nextInt();
                switch (golongan) {
                    case 1:
                        System.out.println("DSP sebesar Rp. 5.000.000");
                        System.out.println("SPP sebesar Rp. 500.000");
                        break;
                    case 2:
                        System.out.println("DSP sebesar Rp. 15.000.000");
                        System.out.println("SPP sebesar Rp. 1.000.000");
                        break;
                    case 3:
                        System.out.println("DSP sebesar Rp. 30.000.000");
                        System.out.println("SPP sebesar Rp. 2.000.000");
                        break;
                }
                break;
            case 2:
                System.out.println("Pilihan golongan pendapatan");
                System.out.println("1. A");
                System.out.println("2. B");
                System.out.println("3. C");
                System.out.print("Pilih golongan pendapatan anda dalam angka : ");
                golongan = input.nextInt();
                switch (golongan) {
                    case 1:
                        System.out.println("DSP sebesar Rp. 7.000.000");
                        System.out.println("SPP sebesar Rp. 500.000");
                        break;
                    case 2:
                        System.out.println("DSP sebesar Rp. 17.000.000");
                        System.out.println("SPP sebesar Rp. 1.000.000");
                        break;
                    case 3:
                        System.out.println("DSP sebesar Rp. 35.000.000");
                        System.out.println("SPP sebesar Rp. 2.000.000");
                        break;
                }
                break;
            case 3:
                System.out.println("Pilihan golongan pendapatan");
                System.out.println("1. A");
                System.out.println("2. B");
                System.out.println("3. C");
                System.out.print("Pilih golongan pendapatan anda dalam angka : ");
                golongan = input.nextInt();
                switch (golongan) {
                    case 1:
                        System.out.println("DSP sebesar Rp. 10.000.000");
                        System.out.println("SPP sebesar Rp. 1.000.000");
                        break;
                    case 2:
                        System.out.println("DSP sebesar Rp. 25.000.000");
                        System.out.println("SPP sebesar Rp. 2.000.000");
                        break;
                    case 3:
                        System.out.println("DSP sebesar Rp. 50.000.000");
                        System.out.println("SPP sebesar Rp. 3.000.000");
                        break;
                }
                break;
        }
        System.out.println("Terima kasih telah mengecek DSP dan SPP anda");
    }
}
