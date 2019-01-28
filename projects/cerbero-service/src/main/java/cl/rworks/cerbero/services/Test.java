/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.rworks.cerbero.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 *
 * @author aplik
 */
@Path("/test")
public class Test {

    @GET
    @Path("/hello")
    @Produces("text/plain")
    public String hello() {
        return "Jersey Test REST Web Services ... pero como hombre";
    }

}
