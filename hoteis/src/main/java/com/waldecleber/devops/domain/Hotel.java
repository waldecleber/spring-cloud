package com.waldecleber.devops.domain;

import java.util.Objects;
import java.util.StringJoiner;

public class Hotel {

    private Integer id;
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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
        return Objects.equals(id, hotel.id) && Objects.equals(nome, hotel.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Hotel.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("nome='" + nome + "'")
                .toString();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private Integer id;

        private String nome;

        private Builder() {
        }

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Hotel build() {
            Hotel hotel = new Hotel();
            hotel.setId(id);
            hotel.setNome(nome);
            return hotel;
        }
    }
}
