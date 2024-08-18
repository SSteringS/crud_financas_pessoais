package br.com.satyan.stering.saita.fincancaspessoais.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "tb02_titular")
public class TitularEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_titular", nullable = false)
    private Integer id;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "cpf", length = 11)
    private String cpf;

}