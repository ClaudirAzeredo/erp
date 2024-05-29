package br.unipar.erp.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name="usuario")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    private Integer codigo;


    private String nome;

    @Column(name="username")
    public String usuario;

   @Column(name="password")
    private String senha;

    @Column(name= "nascimento")
    private LocalDate dataNascimento;



}
