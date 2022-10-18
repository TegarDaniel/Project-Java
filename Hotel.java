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
public class Hotel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String eksekutif = "5000000", premium = "4000000", regular = "3000000", ekonomi = "2000000", balrack = "1000000";
        System.out.println("Masukkan pilihan:");
        String pilihan = input.next();

        if (pilihan.equals("eksekutif")) {
            System.out.println("harga=" + eksekutif);
        } else if (pilihan.equals("premium")) {
            System.out.println("harga=" + premium);
        } else if (pilihan.equals("regular")) {
            System.out.println("harga=" + regular);
        } else if (pilihan.equals("ekonomi")) {
            System.out.println("harga=" + ekonomi);
        } else if (pilihan.equals(balrack)) {
            System.out.println("harga=" + balrack);
        }
    }
}
