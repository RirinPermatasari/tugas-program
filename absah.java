
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class absah {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int Nilai;
        System.out.println("Masukan nilai");
        Nilai= input.nextInt();
        
        if (Nilai>1 && Nilai<100){
            System.out.println("Nilai Absah");
        }
        else {
            System.out.println("Tidak Absah");
        }
    }
}
