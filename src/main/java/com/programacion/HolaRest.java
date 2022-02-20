package com.programacion;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@ApplicationScoped
@Path("/hola")
public class HolaRest {
    @Inject
    private ServicioHola servicio;

    @GET
    public String hola(){
        return servicio.hola();
    }
}
