package org.example.service;

import jakarta.persistence.EntityManager;
import org.example.entiity.Empleado;

import java.math.BigDecimal;
import java.time.LocalDate;

public class EmpleadoService {
    public void crearEmpleado(EntityManager em){
        em.getTransaction().begin();
        try{
            Empleado empleado = new Empleado();
            empleado.setNombre("Juan");
            empleado.setFechaIngreso(LocalDate.of(2021,1,1));
            empleado.setSalario(1125.0);
            em.persist(empleado);
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Ocurrio un error ->" + e.getMessage());
        }
    }

}
