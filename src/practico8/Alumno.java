/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico8;

import java.util.HashSet;

/**
 *
 * @author Fran Gonzalez
 */
public class Alumno {
    
    private int legajo;
    private String apellido;
    private String nombre;
    
    private HashSet<Materia> materias = new HashSet<>();
    
    

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarMateria(Materia m){
        if (materias.add(m)){
            System.out.println("Se agrego la materia " + m.getNombre() + " al alumno");
        }
        else
            System.out.println("ERROR: Ya se encuentra registrada la materia " + m.getNombre() + " para el alumno");
    }
    
    public int cantidadMaterias(){
        return materias.size(); 
    }
    
}
