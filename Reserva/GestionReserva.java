package Reserva;

import java.util.ArrayList;
import java.util.List;

public class GestionReserva {
    public class GestionReservas {
    private List<Reserva> reservas;

    public GestionReservas() {
        this.reservas = new ArrayList<>();
    }

 public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
        System.out.println("Reserva agregada: " + reserva);
    }
    }
}

