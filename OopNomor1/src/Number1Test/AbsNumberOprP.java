/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number1Test;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public final class AbsNumberOprP {
    private final void printAll(AbsNumberOpr[] OB, double a, double b){
        try {
        System.out.println("");
        for(int i=0; i<OB.length; i++){
            OB[i].set_A(a);
            OB[i].set_B(b);
            OB[i].view();
            }
        }catch(Exception e){
            System.out.println("Tidak bisa menampilkan");
        }
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
//        final double a = 10.5;
//        final double b = 0;
            System.out.print("Masukkan nilai a: ");
            double a = input.nextDouble();
            System.out.print("Masukkan nilai b: ");
            double b = input.nextDouble();
        
        AbsNumberOpr[] OB = {   new AddOpr(),
                                new SubstractOpr(),
                                new MultipleOpr(),
                                new DivideOpr()
                            };
        
        AbsNumberOprP practice1 = new AbsNumberOprP();
        practice1.printAll(OB, a, b);
        } catch (Exception e){
            System.out.println("Tidak bisa menampilkan, cek data input");
        }      
    }

    
}
