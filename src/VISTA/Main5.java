/*
5. La distribuidora de motocicletas Rueda Floja ofrece una promoción que consiste en lo siguiente:
las motos marca Honda tienen un descuento del 5%, las de marca Yamaha del 8%y las Suzuki el
10%, las de otras marcas el 2%. Se requiere calcular el valor a pagar por una motocicleta.
 */
package VISTA;

import MODELO.Class5;
import javax.swing.JOptionPane;

public class Main5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Datos de entrada, valor de la moto, marca de la moto
        int valor;
        String marca;
        
        Class5 modelo = new Class5(); //Se crea una instancia 
        
        //Se solicitan los datos
        marca = JOptionPane.showInputDialog("Ingrese la marca de la moto: ");
        valor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de la moto: "));
        
        //Se llama al metodo y se envian los datos
        modelo.calcularDescuento(marca);
        modelo.multiplicar(valor);
        
        //Se imprimen los resultados
        JOptionPane.showMessageDialog(null, "El valor total de la moto es: " + modelo.valorFinal);
    }
    
}
