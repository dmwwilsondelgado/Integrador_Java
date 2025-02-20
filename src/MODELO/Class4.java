/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class Class4 {
    //Variables de salida se declaran publicas
    public double totalInteres, montoTotal;
    //Variable de acceso privado
    private double interes;
    
    //Metodo para calcular la tasa de interes
    public void calcularInteres(int tiempo){
        //Condicion
        if (tiempo <= 6) {
            interes = 8;
        }else if (tiempo >= 7 && tiempo <= 12) {
            interes = 10;
        }else if (tiempo >= 13 && tiempo <= 18) {
            interes = 12;
        }else if (tiempo >= 19 && tiempo <= 24) {
            interes = 15;
        }else{
            interes = 18;
        }
    }
    
    //Metodo para calcular el total del interes y el monto
    public void multiplicar(int monto, int tiempo){
        totalInteres = (monto * (interes/100)) * tiempo;
        montoTotal = monto + totalInteres;
    }
}
