/*
6. Una compañía de seguros abrió una nueva agencia y estableció un programa para captar
clientes, que consiste en lo siguiente: si el monto por el que se contrata el seguro es menor que
$5.000. 000 pagará el 3%, si el monto es mayor o igual a $5.000 000 y menor de 20.000.000
pagará el 2% y si el monto es mayor o igual a 20.000.000 el valor a pagar será el 1.5 % ¿Cuál
será el valor de la póliza?
 */
package VISTA;

import MODELO.Class6;
import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class Main6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables de entrada
        int valorSeguro;
        
        Class6 modelo = new Class6(); //Se crea una instancia
        
        //Se solicitan los datos
        valorSeguro = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor del seguro: "));
        
        //Se llama al metodo y se envian los datos
        modelo.calcularDescuento(valorSeguro);
        modelo.calcularValor(valorSeguro);
        
        //Se imprime el resultado
        JOptionPane.showMessageDialog(null, "El valor a pagar por el seguro es de: " + modelo.valorFinal);
    }
    
}
