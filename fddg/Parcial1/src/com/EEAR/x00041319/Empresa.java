package com.EEAR.x00041319;

import java.util.List;

public class Empresa {

//sdejfidsjifds
    private String nombre;
    List<Empleado> planilla;

    public void Empresa(String name){
        this.nombre =nombre;
    }
    /*ijim*/

    public String getNombre() {
        return nombre;
    }

    public List<Empleado> getPlanilla() {
        return planilla;
    }

    public void addEmpleado(Empleado datos){

        planilla.add(datos);

    }

    public void quitEmpelado(String Empleado){

        planilla.remove(Empleado);
    }

    //Prueba de pusheo.
}

