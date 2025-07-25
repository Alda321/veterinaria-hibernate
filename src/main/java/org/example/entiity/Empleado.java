package org.example.entiity;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table(name = "employee")
public class Empleado {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name= "nombre", length = 180, nullable = false)
    private String nombre;

    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;

    @Column(name = "salario")
    private Double salario;
    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Departamento departamento;

    public Empleado() {
    }

    public Empleado(LocalDate fechaIngreso, long id, String nombre, Double salario) {
        this.fechaIngreso = fechaIngreso;
        this.id = id;
        this.nombre = nombre;
        this.salario = salario;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
