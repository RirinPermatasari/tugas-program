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
public class Luasdankelilingsegitiga {
    public static void main(String[] args) {
      
        Scanner input = new Scanner (System.in);
        int R,S,Q, Keliling;
        int alas, tinggi,luas; 
        System.out.println("masukkan sisi R=()");
        R = input.nextInt();
        System.out.println("masukkan sisi S=()");
        S = input.nextInt();
        System.out.println("masukkan sisi Q=()");
        Q = input.nextInt();
        
        Keliling= R+S+Q ; 
        System.out.println("Keliling Segitiga =+ Keliling");
        
        System.out.println("menghitung Luas Segitiga()");
       
        System.out.println("masukkan alas=");
        alas =input.nextInt();
        System.out.println("masukkan tinggi");
        tinggi = input.nextInt();
        System.out.println("masukkan luas");
        luas=input.nextInt();
        luas =(alas*tinggi)/2;
        System.out.println("Luas Segitiga ="+ luas);
    }
    }
