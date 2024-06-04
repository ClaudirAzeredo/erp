package br.unipar.erp.data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name="usuarios")
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;


    private String nome;

    @Column(name="username")
    public String usuario;

   @Column(name="password")
    private String senha;

    @Column(name= "nascimento")
    private LocalDate dataNascimento;



}
