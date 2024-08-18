package br.com.satyan.stering.saita.fincancaspessoais.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb01_banco")
public class BancoEntity {
    @Id
    @Column(name = "id_banco", nullable = false)
    private Integer id;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "tipo", length = 45)
    private String tipo;

}