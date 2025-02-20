/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

/**
 *
 * @author Propietario
 */
public class Class1 {
    //Datos de entrada se declaran publicos
    public int horas = 0, tiempoTotal;
    
    //Metodo para validar el dato
    public boolean validar(int numero){
        return numero >= 1; //Retorna true si la condicion en verdadera si no, es false
    }
    
    //Metodo para calcular el tiempo total en minutos
    public void calcularTiempo(int tiempo, int preguntas, int estudiantes){
        tiempoTotal = preguntas * tiempo * estudiantes;
    }
    
    
    //Metodo para convertir el tiempo a horas y minutos
    public void convertir(){
        //Bucle para las horas
        while (tiempoTotal > 59) {            
            horas++;
            tiempoTotal -= 60;
        }
    }
}
