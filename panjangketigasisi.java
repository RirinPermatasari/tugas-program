/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class panjangketigasisi {
    public static void main(String[] args){
        int a, b, c;
      Scanner nilai = new Scanner (System.in);
        System.out.println("Masukan Sisi 1");
        a =nilai.nextInt();
        System.out.println("Masukkan Sisi 2");
        b =nilai.nextInt();
        System.out.println("Masukkan Sisi 3)");
        c =nilai.nextInt();
        
        if((a == 0)||( b == 0)||(c == 0)){
                System.out.println("Bukan segitiga");
        }else{
        if ((a == b) &&(c ==a))
           System.out.println("Bukan Segitiga");
        if((a == b) || (a==c) || (b==c))
                System.out.println("Segitiga sama kaki");
        else
                System.out.println("Segitiga sembarang");
        }
    }
}