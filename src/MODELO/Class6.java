/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class Class6 {
    
    //Variables de salida se declaran publicas
    public double valorFinal;
    //Variables de acceso privado
    private double descuento;
    
    //Metodo para calcular el descuento
    public void calcularDescuento(int seguro){
        //Condicion para los descuentos
        if (seguro < 5000000) {
            descuento = 3; //Variable se le asigna el descuento
        }else if (seguro >= 5000000 && seguro < 20000000) {
            descuento = 2;
        }else{
            descuento = 1.5;
        }
    }
    
    //Metodo para calcular el valor final a pagar
    public void calcularValor(double seguro){
        valorFinal = seguro * (descuento / 100); 
    }
}
