/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.practicagestiontareas.Controlador;

import ec.edu.espoch.practicagestiontareas.Modelo.Tarea;
import ec.edu.espoch.practicagestiontareas.Vista.Vista;
import ec.edu.espoch.practicagestiontareas.tester.TasterControlador;

/**
 *
 * @author SO-LAB1-PC24
 */
public class Controlador {
    private Vista vista;
    private TasterControlador taster;

    public Controlador(Vista vista) {
        this.vista = vista;
        //this.taster = new taster;
    }
    
    public void agregarTarea(){
        try {
            TasterControlador tastercontrolador = new TasterControlador();
            Tarea objTarea = new Tarea();
            objTarea.setTitulo(this.vista.getTitulo());
            objTarea.setDescripcion(this.vista.getDescripcion());
            objTarea.setEstado(this.vista.getEstado());

            if (this.vista != null) {
                tastercontrolador.prueba(objTarea);
            }
            
        }catch (Exception e){
            
        }
 
            
        
       
    }
    
    
    
    
}
