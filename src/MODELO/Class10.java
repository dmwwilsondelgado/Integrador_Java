/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class Class10 {
    //Metodo para hallar el maximo comun divisor
    public double maximoComunDivisor(int num1, int num2) {
        double aux; //Variable que almacena el residuo de la division
        //Bucle hasta que el residuo sea igual a 0
        while (num2 != 0) {
            aux = num1 % num2; //Almacenamos el residuo
            num1 = num2;
            num2 = (int) aux;
        }
        return num1; //Retornamos el resultado final
    }
}

