package com.Examen1.AGOH.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Repository;

import com.Examen1.AGOH.Models.Reserva;

@Repository
public class ReservaRepository {
    private List<Reserva> reservas = new ArrayList<Reserva>();
    private AtomicLong id = new AtomicLong();

    //agregamos la categoria al listado y la regresamos - POST
    public Reserva guardar(Reserva reserva){
        reserva.setId(id.incrementAndGet());
        reservas.add(reserva);
        return reserva;
    }

    //GET - todas las categorias
    public List<Reserva> obtenerTodas(){
        return reservas;
    }

    //GET - solo una categoria
    public Reserva obtenerPorId(Long id){
        //return null;
        return reservas.stream().filter(reserva -> reserva.getId().equals(id)).findFirst().orElse(null);
    }

    //DELETE
    public void eliminar(Long id){
        reservas.removeIf(reserva -> reserva.getId().equals(id));
    }

    //PUT
    public Reserva actualizar (Reserva reserva){
        eliminar(reserva.getId());
        reservas.add(reserva);
        return reserva;
    }
}
