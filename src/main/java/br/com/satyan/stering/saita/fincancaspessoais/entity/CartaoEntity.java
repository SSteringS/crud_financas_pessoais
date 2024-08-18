package br.com.satyan.stering.saita.fincancaspessoais.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tb03_cartao")
public class CartaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cartao", nullable = false)
    private Integer id;

    @Column(name = "numero", length = 100)
    private String numero;

    @Column(name = "vencimento", length = 20)
    private String vencimento;

    @Column(name = "cod_seguranca", length = 5)
    private String codSeguranca;

    @Column(name = "nome", length = 100)
    private String nome;

    @Column(name = "tipo", length = 50)
    private String tipo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_conta")
    private ContaEntity idConta;

    @OneToMany(mappedBy = "idCartao")
    private Set<MovimentacaoEntity> tb05Movimentacaos = new LinkedHashSet<>();

}