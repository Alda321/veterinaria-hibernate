package org.example.entiity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
@Entity
@Table(name = "employee")
public class Empleado {

    private long id;
    private String nombre;
    private LocalDate fechaIngreso;
    private Double salario;



}
