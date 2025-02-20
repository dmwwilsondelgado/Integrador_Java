/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VISTA;

import MODELO.Class10;
import javax.swing.JOptionPane;


public class Main10 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Datos de entrada, dos numeros
        int num1, num2;
        
        Class10 modelo = new Class10(); //Se crea una instancia
        
        //Se solicitan los datos
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2: "));
        
        //Se llama al metodo y se envian los datos
        double resultado = modelo.maximoComunDivisor(num1, num2);
        
        //Se imprimen los resultados
        JOptionPane.showMessageDialog(null, "EL MAXIMO COMUN DIVISOR DE LOS DOS NUMEROS ES: " + resultado);
    }
    
}
