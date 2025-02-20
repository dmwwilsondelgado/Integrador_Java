/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class Class2 {
    //Variables de acceso privado
    private final int salarioMinimo = 1423500;
    
    //Metodo para validar
    public boolean aplicaAuxilio(int salario){
        //Condicion para validar si aplica
        if (salario <= (2 * salarioMinimo)) {
            return true;
        }
        return false;
    }
}
