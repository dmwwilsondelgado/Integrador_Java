/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class Class7 {
    //Variables de salida se declaran publicas
    public int total, aumento;
    
    //Metodo para calcular el aumento
    public void calcularAumento(int material){
        
        switch (material) {
            case 0:
                aumento = 8;
                break;
            case 1:
                aumento = 5; 
                break;
            default:
                aumento = 3;
                break;
        }
    }
    
    //Metodo para calcular el valor final
    public void calcularValor(int peso) {
        total = aumento * peso;
    }
}
