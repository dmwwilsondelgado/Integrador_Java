/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class Class3 {
    //Variables de salida se declaran publicas
    public int promedio;
    public double notaDefinitiva;
    
    //Metodo para hallar el promedio de los 2 parciales
    public void promediarParciales(int nota1, int nota2){
        promedio = (nota1 + nota2) / 2;
    }
    
    //Metodo para validar si aplica al examen
    public boolean aplicaExamen(){
        return promedio >= 2;
    }
    
    //Metodo para calcular la nota definitiva
    public void calcularNotaDefinitiva(int examenFinal, int nota1, int nota2){
        if (examenFinal < 2) {
            notaDefinitiva = examenFinal;
        }else{
            notaDefinitiva = (nota1 * 0.3) + (nota2 * 0.3) + (examenFinal * 0.4);
        }
    }
    
    //Metodo para validar si aprueba la asignatura
    public boolean validarAprobado(){
        return notaDefinitiva >= 3;
    }
    
    //Metodo para validar si puede habilitar la asignatura
    public boolean habilitar(int examenFinal){
        return examenFinal >= 2;
    }
}
