/*
1. Un profesor diseña un cuestionario con n preguntas, estima que para calificar cada pregunta
requiere m minutos. Si el cuestionario se aplica a x estudiantes, cuánto tiempo (horas y
minutos) necesita para calificar todos los exámenes. Se debe validar que los datos a ingresados
deben ser positivos y si ingresa valores negativos debe mostrar un mensaje al usuario y
culminar el algoritmo.
 */
package VISTA;
import MODELO.Class1;
import javax.swing.JOptionPane;

public class Main1 {
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Datos de entrada
        int numPreguntas, tiempoPregunta, totalEstudiantes;
        
        Class1 modelo = new Class1(); //Se crea una instancia
        
        //Se solicitan los datos
        numPreguntas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de preguntas: "));
        tiempoPregunta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tiempo de cada pregunta: "));
        totalEstudiantes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el total de estudiantes: "));
        
        //Se llaman a los metodos, se envian los datos y se guarda el retorno de los metodos
        boolean preguntas = modelo.validar(numPreguntas);
        boolean tiempo = modelo.validar(tiempoPregunta);
        boolean estudiantes = modelo.validar(totalEstudiantes);
        
        //Condicion que valida los datos
        if (preguntas && tiempo && estudiantes) {
            
            //Se llama al metodo y se envian los datos
            modelo.calcularTiempo(tiempoPregunta, numPreguntas, totalEstudiantes);
            modelo.convertir();
            
            //Se imprimen los resultados
            JOptionPane.showMessageDialog(null, "El tiempo requerido para calificar todos los examenes es de: " + modelo.horas + " horas y " + modelo.tiempoTotal + " minutos");
        }else{
            //Se imprime el error
            JOptionPane.showMessageDialog(null, "Debe ingresar valores positivos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
