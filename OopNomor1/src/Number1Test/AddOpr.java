/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Number1Test;

/**
 *
 * @author ASUS
 */
public class AddOpr extends AbsNumberOpr{

    @Override
    protected void set_A(double a) {
        try {
        this.a=a;
        }catch (Exception e){
            System.out.println("Anda salah memasukkan input a");
        }
    }

    @Override
    protected void set_B(double b) {    
        try {
        this.b=b;
        }catch (Exception e){
            System.out.println("Anda salah memasukkan input b");
        }
    }
    
    @Override
    protected void set_C() {
        double c;
    }
    
    
    @Override
    protected double get_A() {
        return a;
    }

    @Override
    protected double get_B() {
        return b;
    }

    @Override
    protected double get_C() {
        double result= get_A() + get_B();
        return result;
    }

    @Override
    protected void view() {
        try {
        System.out.println("Hasil Penjumlahan antara " + get_A() + " dengan " + get_B() + "=" + get_C());
        } catch (Exception e){
            System.out.println("Maaf masih ada input yang salah");
        }

    }

    
  
}
