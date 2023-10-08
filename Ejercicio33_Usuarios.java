package com.intermiedo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;

public class Ejercicio33_Usuarios {

    private String nombre ;
    private ArrayList<String> personas = new ArrayList<>();

    public Ejercicio33_Usuarios(String nombre) {
        this.nombre = nombre;
        personas.add(nombre);
        
    }
    public void eliminar() {
        Iterator<String> iterador = personas.iterator();

        while (iterador.hasNext()) {
            String persona = iterador.next();
            if (persona.equals(this.nombre)) {
                iterador.remove(); // Elimina el elemento actual del ArrayList
            }
        }
    }

    public void editar(String nuevoNombre) {
        ListIterator<String> iterador = personas.listIterator();
        while (iterador.hasNext()) {
            String persona = iterador.next();
            if (persona.equals(this.nombre)) {
                iterador.set(nuevoNombre); // Reemplaza el nombre existente con el nuevo nombre
            }
        }
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    @Override
    public int hashCode() {
        return Objects.hash(nombre, personas);
    }

    public ArrayList<String> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<String> personas) {
        this.personas = personas;
    }
    @Override
    public String toString() { // <------ Este metodo solo nos devolvera un dato
        return "{" +
                "Personas dentro del array =" + personas +
                '}';
    }





}
