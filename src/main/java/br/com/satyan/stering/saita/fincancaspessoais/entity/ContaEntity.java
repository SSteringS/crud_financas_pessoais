package br.com.satyan.stering.saita.fincancaspessoais.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tb04_conta")
public class ContaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_conta", nullable = false)
    private Integer id;

    @Column(name = "id_titular", length = 45)
    private String idTitular;

    @Column(name = "id_banco", length = 45)
    private String idBanco;

    @Column(name = "numero_conta", length = 45)
    private String numeroConta;

    @Column(name = "numero_agencia", length = 45)
    private String numeroAgencia;

    @Column(name = "saldo", precision = 15, scale = 2)
    private BigDecimal saldo;

    @OneToMany(mappedBy = "idConta")
    private Set<CartaoEntity> tb03Cartaos = new LinkedHashSet<>();

}