/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class Class11 {
    //Datos de salida se declaran publicos
    public String binario = "";
    
    private String auxiliar = "";
    public void decimal_Binario(int numero){
        do {            
           auxiliar +=  numero % 2 + "";
           numero /= 2;
        } while (numero > 0);
    }
    
    public void invertirCadena(){
        for (int i = auxiliar.length() - 1; i >= 0; i--) {
            binario += auxiliar.charAt(i);
        }
    }
}
