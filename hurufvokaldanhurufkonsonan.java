
import java.util.Scanner;
import static jdk.nashorn.tools.ShellFunctions.input;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class hurufvokaldanhurufkonsonan {
    public static void main(String[] args) {
       char vokal;
       Scanner input = new Scanner(System.in);
        System.out.println("Masukan Huruf()");
        vokal = input.next().charAt(0);
        
        if(vokal=='a'|| vokal=='i'|| vokal =='u'||vokal=='e'||vokal=='o'){
            System.out.println("(Huruf vokal)");
            
    } 
    else{
            System.out.println("Huruf Konsonan");}
            
}
}
