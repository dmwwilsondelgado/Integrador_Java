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
public class Class9 {
    public String relojDigital(){
        int horas = 1, minutos = 1, segundos = 1;
        for (horas = 1; horas <= 24; horas++) {
            for ( minutos = 1; minutos <= 59; minutos++) {
                for (segundos = 1; segundos <= 59; segundos++) {
                    System.out.println(horas+":"+ (minutos < 10 ? "0" + minutos : minutos) + ":"+ (segundos < 10 ? "0" + segundos : segundos));
                    if (horas == 12 && minutos == 59 && segundos == 59) {
                        JOptionPane.showMessageDialog(null, "SON LAS 12:59:59, CICLO TERMINADO");
                        return null;
                    }
                }
            }
        }
        return null;
    }
}   
