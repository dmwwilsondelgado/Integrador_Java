/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MODELO;

import javax.swing.JOptionPane;

/**
 *
 * @author Propietario
 */
public class Class8 {
    public String[] libros;
    public void librosValidos(int presupuesto){
        if (presupuesto >= 35000) {
            libros = new String[]{"1. Calculo", "2. Fisica", "3. Programacion"};
        }else if (presupuesto >= 30000) {
            libros = new String[]{"1. Calculo", "2. Fisica"};
        }else if (presupuesto >= 25000){
            libros = new String[]{"1. Calculo", "2. Programacion"};
        }else if (presupuesto >= 15000) {
            libros = new String[]{"1. Fisica", "2. Programacion"};
        }else if (presupuesto >= 5000) {
            libros = new String[]{"1. Programacion"};
        }
    }
    
    public void imprimirArreglo() {
        StringBuilder sb = new StringBuilder();
        for (String elemento : libros) {
            sb.append(elemento).append("\n");
        }
        JOptionPane.showMessageDialog(null,"Puede realizar la compra de los siguientes libros: \n" + sb.toString(), "Libros", JOptionPane.INFORMATION_MESSAGE);
    }
}
