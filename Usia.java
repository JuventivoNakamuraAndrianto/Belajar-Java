/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul11;
import java.util.Scanner;

/**
 *
 * @author JUVE
 */
public class Usia {
    public static void main(String[] args) {
        String nama1,nama2;
        int umur1,umur2;
     
     Scanner A = new Scanner(System.in);
     System.out.print("Masukan nama :");
     nama1 = A.next();
     System.out.print("Masukan umur :");
     umur1 = A.nextInt();
     
     Scanner B = new Scanner(System.in);
     System.out.print("Masukan nama :");
     nama2 = B.next();
     System.out.print("Masukan umur :");
     umur2 = B.nextInt();
     
     if (umur1 > umur2) {
         System.out.print(nama1+ "lebih besar dari" +nama2);
     }
     else {
     System.out.print(nama1+ "lebih kecil dari" +nama2);
    }
     
     
     
     
    }
}
