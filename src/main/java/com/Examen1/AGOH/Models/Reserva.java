package com.Examen1.AGOH.Models;

import java.util.Date;

public class Reserva {
    private Long id;
    private Date fechaLlegada;
    private Date fechaSalida;
    private String nombreCliente;
    private String tipoHabitacion;

    public Reserva(){}

    // Constructor
    public Reserva(Long id, Date fechaLlegada, Date fechaSalida, String nombreCliente, String tipoHabitacion) {
        this.id = id;
        this.fechaLlegada = fechaLlegada;
        this.fechaSalida = fechaSalida;
        this.nombreCliente = nombreCliente;
        this.tipoHabitacion = tipoHabitacion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(String tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }
    
}
