package org.example.Ejercicio2;

public class Persona {
    int sexo;  // 1 para masculino, 2 para femenino
    int edad;


    public Persona(int sexo, int edad) {
        this.sexo = sexo;
        this.edad = edad;
    }

    public String getSexo() {
        return sexo == 1 ? "M" : "F";
    }
}