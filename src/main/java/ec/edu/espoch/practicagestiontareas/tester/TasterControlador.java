/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.practicagestiontareas.tester;

import ec.edu.espoch.practicagestiontareas.Controlador.Controlador;
import ec.edu.espoch.practicagestiontareas.Modelo.Tarea;
import ec.edu.espoch.practicagestiontareas.Vista.Vista;

/**
 *
 * @author SO-LAB1-PC24
 */
public class TasterControlador {
    private Vista vista;
    private Controlador controlador;

    public void prueba(Tarea objTarea) {
        System.out.println("Titulo: " + objTarea.getTitulo());
        System.out.println("Descripcion: " + objTarea.getDescripcion());
        System.out.println("Estado: " + objTarea.getEstado());
    }
}

