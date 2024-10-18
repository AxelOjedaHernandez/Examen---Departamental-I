package com.Examen1.AGOH.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Examen1.AGOH.Models.Reserva;
import com.Examen1.AGOH.Repository.ReservaRepository;

// se crea una instancia
@Service
public class ReservaService {
    //requerimos repo (datos - listado) - categorias
    ReservaRepository reservasRepository;

    //constructor - cuando crea la instancia le pasa el repositorio
    public ReservaService(ReservaRepository ReservasRepository){
        this.reservasRepository = ReservasRepository;
    }

    //GET - todas las categorias
    public List<Reserva> getAllReservas(){
        return reservasRepository.obtenerTodas();
    }

    //Get - categoria por id
    public Reserva getReservabyId(Long id){
        return reservasRepository.obtenerPorId(id);
    }

    //POST - crear categoria
    public Reserva createReserva(Reserva reserva){
        return reservasRepository.guardar(reserva);
    }

    //PUT - actualizar categoria
    public Reserva updateReserva(Reserva reserva){
        return reservasRepository.actualizar(reserva);
    }

    //DELETE
    public void deleteReserva(Long id){
        reservasRepository.eliminar(id);
    }

}
