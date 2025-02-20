/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VISTA;

import MODELO.Class11;
import javax.swing.JOptionPane;


public class Main11 {


    public static void main(String[] args) {
        // TODO code application logic here
        //Datos de entrada, numero
        int numero;
        
        Class11 modelo = new Class11(); //Se crea una instancia
        
        //Se solicitan los datos
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a convertir: "));
        
        //Se llama al metodo y se envia el dato
        modelo.decimal_Binario(numero);
        modelo.invertirCadena();
        
        //Se imprime el resultado
        JOptionPane.showMessageDialog(null, "El numero entero: " + numero + " Convertido a binario es igual a: " + modelo.binario);
    }
    
}
