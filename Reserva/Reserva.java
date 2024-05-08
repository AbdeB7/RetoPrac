package Reserva;

import java.util.Date;

class Reserva {
    private String IdReserva;
    private String nombreCliente;
    private Date fechaHora;
    private int cantidadPersonas;

    public Reserva(String IdReserva,String nombreCliente, Date fechaHora, int cantidadPersonas) {
        this.IdReserva = IdReserva;
        this.nombreCliente = nombreCliente;
        this.fechaHora = fechaHora;
        this.cantidadPersonas = cantidadPersonas;
    }


    public String getIdReserva() {
        return IdReserva;
    }


    public void setIdReserva(String idReserva) {
        IdReserva = idReserva;
    }


    public String getNombreCliente() {
        return nombreCliente;
    }


    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }


    public Date getFechaHora() {
        return fechaHora;
    }


    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }


    public int getCantidadPersonas() {
        return cantidadPersonas;
    }


    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }


    public String toString() {
        return "Reserva [nombreCliente=" + nombreCliente + ", IdReserva=" + IdReserva + ", fechaHora=" + fechaHora + ", cantidadPersonas=" + cantidadPersonas + "]";
    }
}


