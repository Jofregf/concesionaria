
package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {
    
    ControladoraPersistencia controlPersistencia = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, 
            String patente, int puertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setPuertas(puertas);
        
        controlPersistencia.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
        return controlPersistencia.traerAutos();
    }

    public void borrarAuto(int idAuto) {
        controlPersistencia.borrarAuto(idAuto);
    }

    public Automovil traerAutos(int idAuto) {
        return controlPersistencia.traerAutos(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int puertas) {
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setPuertas(puertas);
        
        controlPersistencia.modificarAuto(auto);
    }
    
}
