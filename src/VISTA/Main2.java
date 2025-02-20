/*
2. Se requiere un algoritmo que decida si un empleado tiene derecho al auxilio de transporte. Se
conoce que todos los empleados que devengan un salario menor o igual a dos salarios mínimos
legales tienen derecho a este rubro.
 */
package VISTA;

import MODELO.Class2;
import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables de entrada
        int salario;
        
        Class2 modelo = new Class2(); //Se crea una instancia
        
        //Se solicitan los datos
        salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su salario: "));
        
        //Se llama al metodo y se envia el dato
        boolean aplica = modelo.aplicaAuxilio(salario);
        
        //Condicion si aplica
        if (aplica) {
            //Se imprime el resultado
            JOptionPane.showMessageDialog(null, "APLICA");
        }else{
            //Se imprime el resultado
            JOptionPane.showMessageDialog(null, "NO APLICA");
        }
    }
    
}