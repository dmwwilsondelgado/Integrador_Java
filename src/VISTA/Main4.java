/*
4. El banco Buena Paga ofrece diferentes tasas de interés anual para depósitos a término
dependiendo del tiempo por el que se hagan. Si el depósito es por un periodo menor o igual a
seis meses la tasa es del 8% anual; entre siete y 12 meses, 10%; entre 13 y 18, 12%; entre 19 y
24, 15%; y para periodos superiores a 24 meses el 18%. Se requiere un algoritmo para
determinar cuánto recibirá un cliente por un depósito, tanto por concepto de interés como en
total.
 */
package VISTA;

import MODELO.Class4;
import javax.swing.JOptionPane;


public class Main4 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Datos de entrada
        int monto, tiempo;
        
        Class4 modelo = new Class4(); //Se crea una instancia
        
        //Se solicitan los datos
        monto = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto total del deposito: "));
        tiempo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo del deposito: "));
        
        //Se llama a los metodos y se envian los datos
        modelo.calcularInteres(tiempo);
        modelo.multiplicar(monto, tiempo);
        
        //Se imprimen los resultados
        JOptionPane.showMessageDialog(null, "El total a pagar por intereses es de: " + modelo.totalInteres + "y el monto total con intereses es de: " + modelo.montoTotal);
    }
    
}
