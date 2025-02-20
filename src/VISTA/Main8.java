/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VISTA;

import MODELO.Class8;
import javax.swing.JOptionPane;


public class Main8 {
    public static void main(String[] args) {
        // TODO code application logic here
        //Datos de entrada
        int[] precios = {20000,10000,5000};
        int presupuesto;
        
        Class8 modelo = new Class8();
        
        String mensaje = String.format("""
            LIBROS DISPONIBLES: 
            1. Cálculo = %d
            2. Fisica = %d
            3. Programacion = %s
            """, precios[0], precios[1], precios[2]);
        
        JOptionPane.showMessageDialog(null, mensaje, "VENTA DE LIBROS", JOptionPane.PLAIN_MESSAGE);
        
        //Se solicitan los datos
        presupuesto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el presupuesto: "));
        
        //Se llama al metodo y se envian los datos
        modelo.librosValidos(presupuesto);
        if (modelo.libros != null) {
            modelo.imprimirArreglo();
        }else{
            JOptionPane.showMessageDialog(null, "No puede comprar ninguno");
        }

    }
    
}
