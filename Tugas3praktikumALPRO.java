/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3praktikumalpro;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Tugas3praktikumALPRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Umur ,TahunLahir; 
        Scanner masukan = new Scanner(System.in); 
        System.out.println("Masukkan Tahun lahir anda=()");
        TahunLahir = masukan.nextInt(); 
       
        Umur =  2021 - TahunLahir;
        System.out.println("umur Anda ialah = ()");
        
        // TODO code application logic here
    }
    
}
