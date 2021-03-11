package com.waldecleber.devops.reservas.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Reserva {
    private Cliente cliente;
    private Hotel hotel;
    private LocalDate data;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return Objects.equals(cliente, reserva.cliente) && Objects.equals(hotel, reserva.hotel) && Objects.equals(data, reserva.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente, hotel, data);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private Cliente cliente;
        private Hotel hotel;

        private LocalDate data;

        private Builder() {
        }

        public Builder cliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder hotel(Hotel hotel) {
            this.hotel = hotel;
            return this;
        }

        public Builder data(LocalDate data) {
            this.data = data;
            return this;
        }

        public Reserva build() {
            Reserva reserva = new Reserva();
            reserva.setCliente(cliente);
            reserva.setHotel(hotel);
            reserva.setData(data);
            return reserva;
        }
    }
}
