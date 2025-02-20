/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package VISTA;

import MODELO.Class7;
import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class Main7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Datos de entradas, materiales disponibles y peso
        String[] materiales = {"Oro","Platino","Plata"};
        int peso, opcion;
        
        Class7 modelo = new Class7(); //Se crea una instancia
        
        //Se solicitan los datos
        opcion = JOptionPane.showOptionDialog(null,
        "¿Que material desea elegir?",
        "MATERIALES DISPONIBLES", JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE, null, materiales,
        materiales[0]);
        
        peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso del producto: "));
        
        //Se llaman a los metodos y se envian los datos
        modelo.calcularAumento(opcion);
        modelo.calcularValor(peso);
        
        //Se imprimen los resultados
        JOptionPane.showMessageDialog(null, "El valor del gramo del producto es: "  + modelo.aumento);
        JOptionPane.showMessageDialog(null, "El valor del producto es: "  + modelo.total);
    }
    
}
