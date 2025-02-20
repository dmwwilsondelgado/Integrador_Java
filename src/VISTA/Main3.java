/*
3. En la universidad Buena Nota se requiere un algoritmo para calcular la nota definitiva y decidir
si el estudiante aprueba o reprueba la asignatura. La nota final se obtiene a partir de dos notas
parciales y un examen final, donde el primer parcial equivale al 30%, el segundo parcial al 30%
y el examen final al 40%, y la nota mínima aprobatoria es 3.0. Si el promedio de los dos parciales
es menor a 2.0, el estudiante no puede presentar examen final y pierde la materia por bajo
promedio, en este caso la nota definitiva es el promedio de los parciales, si el promedio es igual
o superior a 2.0 puede presentar el examen final. Si la nota del examen final es inferior a 2.0,
se desconoce las notas parciales y la nota definitiva es la obtenida en el examen final. Si la nota
es igual o superior a 2.0 se calcula la nota definitiva aplicando los porcentajes mencionados a
los parciales y al final. Si la nota definitiva es igual o superior a 3.0 el estudiante aprueba la
asignatura; si es inferior a 3.0 pierde la materia; sin embargo, puede habilitarla, siempre y
cuando en el examen final obtenga nota mayor o igual a 2.0, en este caso la nota definitiva será
la que obtenga en la habilitación.
 */
package VISTA;

import MODELO.Class3;
import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class Main3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Variables de entrada
        int primerParcial, segundoParcial, examenFinal;
        
        Class3 modelo = new Class3(); //Se crea una instancia
        
        //Se solicitan los datos
        primerParcial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del primer parcial: "));
        segundoParcial = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del segundo parcial: "));    
        
        //Se llama al metodo y se envian los datos
        modelo.promediarParciales(primerParcial, segundoParcial);
        boolean aplicaExamen = modelo.aplicaExamen(); //Se almacena el retorno
        
        // Condicion si aplica al examen final
        if (aplicaExamen) {
            
            //Se solicita el dato
            examenFinal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota del examen final: "));
            
            //Se llama al metodo y se envian los datos
            modelo.calcularNotaDefinitiva(examenFinal, primerParcial, segundoParcial);
            
            //Se imprime el resultado
            JOptionPane.showMessageDialog(null, "Su nota definitiva es: " + modelo.notaDefinitiva);
            
            //Se almacena el retorno del metodo
            boolean aprobado = modelo.validarAprobado();
            
            //Condicion si aprueba la asignatura
            if (aprobado) {
                //Se imprime el resultado
                JOptionPane.showMessageDialog(null, "ESTADO: APROBADO");
            }else{
                //Se almacena el retorno del metodo
                boolean habilitado = modelo.habilitar(examenFinal);
                
                //Condicion para validar si puede habilitar la asignatura
                if (habilitado) {
                    //Se imprime el resultado
                    JOptionPane.showMessageDialog(null, "Puede habilitar la nota definitiva");
                }else{
                    //Se imprime el resultado
                    JOptionPane.showMessageDialog(null, "NO PUEDE habilitar la nota definitiva");
                }
            }
        }else{
            //Se imprime el resultado
            JOptionPane.showMessageDialog(null, "La nota definitiva es: " + modelo.promedio);
            JOptionPane.showMessageDialog(null, "ESTADO: NO APROBADO");

        }
    }
    
}
