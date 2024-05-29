package br.unipar.erp.data.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity

@Table
public class Usuario {

    @Id
    private Integer codigo;

    public String usuario;

    private String senha;

    
    private LocalDate dataNascimento;
}
