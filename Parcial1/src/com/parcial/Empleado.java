package com.parcial;

import java.util.List;

public class Empleado {
    protected String nombre;
    protected String puesto;
    protected double salario;
    protected List<Documento> documentos;

    public Empleado(String nombre, String puesto, double salario){
        this.nombre=nombre;
        this.puesto=puesto;
        this.salario=salario;
    }
    public void addDocumentos(){

    }
    public void removeDocumento(){

    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
