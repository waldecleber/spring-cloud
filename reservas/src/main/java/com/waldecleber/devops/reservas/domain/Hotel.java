package com.waldecleber.devops.reservas.domain;

import java.util.Objects;
import java.util.StringJoiner;

public class Hotel {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return Objects.equals(nome, hotel.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Hotel.class.getSimpleName() + "[", "]")
                .add("nome='" + nome + "'")
                .toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String nome;

        private Builder() {
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Hotel build() {
            Hotel hotel = new Hotel();
            hotel.setNome(nome);
            return hotel;
        }
    }
}
