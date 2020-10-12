/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practico8;

/**
 *
 * @author Fran Gonzalez
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Materia matematica = new Materia(101, "Matematica", 1);
        Materia ingles = new Materia(102, "Ingles I", 1);
        Materia lab1 = new Materia(103, "Laboratorio I", 1);
        
        Alumno lopmar = new Alumno(1001, "Lopez", "Martin");
        Alumno martbren = new Alumno(1002, "Martinez", "Brenda");
        
        
        System.out.println("Agregando materias para el alumno/a: " + lopmar.getApellido() + ", " + lopmar.getNombre());
        lopmar.agregarMateria(lab1);
        lopmar.agregarMateria(matematica);
        lopmar.agregarMateria(ingles);
        
        System.out.println("Agregando materias para el alumno/a: " + martbren.getApellido()+ ", " +martbren.getNombre());
        martbren.agregarMateria(lab1);
        martbren.agregarMateria(lab1);
        martbren.agregarMateria(matematica);
        martbren.agregarMateria(ingles);
        
        System.out.println("Materias por alumno");
        System.out.println(lopmar.getApellido() + ", " + lopmar.getNombre() + ": " + lopmar.cantidadMaterias());
        System.out.println(martbren.getApellido() + ", " + martbren.getNombre() + ": " + martbren.cantidadMaterias());
        
        
        
    }
    
}
