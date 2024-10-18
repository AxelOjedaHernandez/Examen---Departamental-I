package com.Examen1.AGOH.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Examen1.AGOH.Models.Reserva;
import com.Examen1.AGOH.Service.ReservaService;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {
    //inyectar el servicio
    ReservaService reservaService;

    public ReservaController(ReservaService reservaService){
        this.reservaService = reservaService;
    }

    //GET - todas las categorias
    @GetMapping
    public ResponseEntity<List<Reserva>> getReservas() {
        return ResponseEntity.ok(reservaService.getAllReservas());
    }
    

    //GET - solo una categoria
    @GetMapping("/{id}")
    public ResponseEntity<Reserva> getReserva(@PathVariable Long id) {
        return ResponseEntity.ok(reservaService.getReservabyId(id));
    }

    //POST - crear una categoria
    @PostMapping
    public ResponseEntity<Reserva> getMethodName(@RequestBody Reserva reserva) {
        return ResponseEntity.ok(reservaService.createReserva(reserva));
    }
    
    //PUT - actualizar una categoria
    @PutMapping("/{id}")
    public ResponseEntity<Reserva> updateReserva(@RequestBody Reserva reserva, @PathVariable Long id) {
        reserva.setId(id);
        return ResponseEntity.ok(reservaService.updateReserva(reserva));
    }
    

    //DELETE - eliminar una categoria
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReserva(@PathVariable Long id) {
        reservaService.deleteReserva(id);
        return ResponseEntity.noContent().build();
    }
}
