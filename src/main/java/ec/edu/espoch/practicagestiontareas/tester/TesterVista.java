/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.practicagestiontareas.tester;

import ec.edu.espoch.practicagestiontareas.Vista.Vista;

/**
 *
 * @author SO-LAB1-PC20
 */
public class TesterVista {
    
    private Vista vista;

    public TesterVista(Vista vista) {
        this.vista = vista;
    }
    
    public void prueba (){
    
        try {
            System.out.println("Titulo " + vista.getTitulo());
            System.out.println("Descripcion " + vista.getDescripcion());
             System.out.println("Estado " + vista.getEstado());
        } catch (Exception e) {
        }
    
    
    
    }
    
    
    
    
}
