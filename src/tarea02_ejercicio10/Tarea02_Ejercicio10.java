/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea02_ejercicio10;

/**
 *
 * @author mohat
 */
public class Tarea02_Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float x = (float) 4.5; 
        float y = (float) 3.0;
        int i = 2,  j = (int) (i * x);
        double dx = 2.0, dz = dx * y;
        byte bx = 5, by = 2, bz = (byte) (bx - by);
        short sx = 5, sy = 2, sz = (short) (sx * sy);
        char cx = '\u000F', cy = '\u0001';
        
        System.out.println("----- Conversiones entre enteros y coma flotante -----");
        System.out.println("Producto de int por float: j = i * x = " + j );
        System.out.println("Producto de float por double: dz = dx * y = " + dz);
        
        System.out.println("----- Operaciones con byte -----");
        System.out.println("byte: bx - by = " + bz);
        
        bx = -128; by = 1;
        System.out.println("byte: bx - by = " + bz);
        
        System.out.println("----- Operaciones con short -----");
        System.out.println("short: sx * sy = " + (sz) + " - 1" + "= 3");
        sx = 32767;
        System.out.println("short: " + sx + "1 = " + (sx + 1));
        
        System.out.println("------ Operaciones con char -----");
        
        // No entiendo exactamente que operaciones hay que realizar, sorry! 
        
    }
    
}
