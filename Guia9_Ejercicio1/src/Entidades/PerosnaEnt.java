/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Jesica
 */
public class PerosnaEnt {
    private String nombre;
    private String apellido;
    private int edad;
    private int dni;
    private perrosEnt perro;

    public PerosnaEnt() {
    }

    public PerosnaEnt(String nombre, String apellido, int edad, int dni, perrosEnt perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public perrosEnt getPerro() {
        return perro;
    }

    public void setPerro(perrosEnt perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "PerosnaEnt{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", perro=" + perro + '}';
    }
    
    
}
