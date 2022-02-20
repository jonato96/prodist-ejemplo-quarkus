package com.programacion;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ServicioHolaImpl implements ServicioHola{
    @Override
    public String hola() {
        return "Hola desde Quarkus";
    }
}
