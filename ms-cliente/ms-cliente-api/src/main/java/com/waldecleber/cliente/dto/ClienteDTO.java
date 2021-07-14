package com.waldecleber.cliente.dto;

import java.util.Objects;
import java.util.StringJoiner;

public class ClienteDTO {
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
        ClienteDTO cliente = (ClienteDTO) o;
        return Objects.equals(nome, cliente.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ClienteDTO.class.getSimpleName() + "[", "]")
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

        public ClienteDTO build() {
            ClienteDTO cliente = new ClienteDTO();
            cliente.setNome(nome);
            return cliente;
        }
    }
}
