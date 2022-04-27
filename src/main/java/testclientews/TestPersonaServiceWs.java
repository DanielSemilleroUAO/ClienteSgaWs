/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testclientews;

import clientews.servicio.Persona;
import clientews.servicio.PersonaServiceImplService;
import clientews.servicio.PersonaServiceWs;
import java.util.List;

/**
 *
 * @author adseglocdom
 */
public class TestPersonaServiceWs {
    public static void main(String[] args) {
        PersonaServiceWs personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
        System.out.println("Ejecutando servicio listar personas ws");
        List<Persona> personas = personaService.listarPersonas();
        
        for (Persona persona : personas) {
            System.out.println("Persona:" + persona.getNombre() + " " + persona.getApellido() + " " + persona.getEmail() + " " + persona.getTelefono() );
        }
    }
}
