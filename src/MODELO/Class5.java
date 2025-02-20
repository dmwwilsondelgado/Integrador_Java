/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class Class5 {
    //Variables de salida se declaran publicas
    public double valorFinal;
    //Variable de acceso privado
    private double descuento;
    
    //Metodo para calcular el descuento
    public void calcularDescuento(String marca){
        switch (marca) {
            case "honda":
                descuento = 5;
                break;
            case "yamaha":
                descuento = 8;
                break;
            case "susuki":
                descuento = 10;
                break;
            default:
                descuento = 2;
                break;
        }
    }
    
    //Metodo para hallar el valor final
    public void multiplicar(int valor){
        valorFinal = valor - (valor * (descuento / 100));
    }
}
