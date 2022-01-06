/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pembayaranmahasiswa;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PembayaranMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int angkatan ;
Scanner input = new Scanner(System.in);
System.out.println("Masukkan Angkatan");
angkatan = input.nextInt();
if(angkatan <= 2018){
System.out.println("Biaya kuliah Semester ini = Rp 5.000.000");
}
else if(angkatan >= 2019 ){
String fakultas;
int x,y,biaya;
System.out.println("Masukkan Fakultas ");
fakultas = input.next();

if ("FTI".equalsIgnoreCase(fakultas) ||"Fakultas Teknik Informastika".equalsIgnoreCase(fakultas)){
System.out.println("Masukkan SKS tatap muka");
x = input.nextInt();
System.out.println("Masukkan SKS pratikum");
y = input.nextInt();

    if(x+y <= 24){
biaya = 2500000+(x*100000)+(y*150000);
System.out.println("Biaya Semester ini = Rp "+biaya);
}
else{
System.out.println("Jumlah SKS lebih dari 24");
}
    }
else if("FT".equalsIgnoreCase(fakultas) ||"Fakultas Teknik".equalsIgnoreCase(fakultas)){
System.out.println("Masukkan SKS tatap muka");
x = input.nextInt();
System.out.println("Masukkan SKS pratikum");
y = input.nextInt();
if(x+y <= 24){
biaya = 2250000+(x*100000)+(y*150000);
System.out.println("Biaya Semester ini = Rp "+biaya);
}
else{
System.out.println("Jumlah SKS lebih dari 24");
}
}
else if("FH".equalsIgnoreCase(fakultas) ||"Fakultas Hukum".equalsIgnoreCase(fakultas)){
System.out.println("Masukkan SKS tatap muka");
x = input.nextInt();
if(x <= 24){
biaya = 2275000+(x*100000);
System.out.println("Biaya Semester ini = Rp "+biaya);
}
else{
System.out.println("Jumlah SKS lebih dari 24");
}
}
else if("FE".equalsIgnoreCase(fakultas) || "FPSI".equalsIgnoreCase(fakultas)){
System.out.println("Masukkan SKS tatap muka");
x = input.nextInt();
if(x <= 24){
biaya = 2150000+(x*100000);
System.out.println("Biaya Semester ini = Rp "+biaya);
}
else{
System.out.println("Jumlah SKS lebih dari 24");
}
        }
}

}
    }
    

    

