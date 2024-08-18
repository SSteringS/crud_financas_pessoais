package br.com.satyan.stering.saita.fincancaspessoais.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "tb05_movimentacao")
public class MovimentacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimentacao", nullable = false)
    private Integer id;

    @Column(name = "valor", precision = 15, scale = 2)
    private BigDecimal valor;

    @Column(name = "data")
    private Instant data;

    @Column(name = "url_comprovante", length = 250)
    private String urlComprovante;

    @Column(name = "origem", length = 250)
    private String origem;

    @Column(name = "destino", length = 250)
    private String destino;

    @Column(name = "tags", length = 250)
    private String tags;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cartao")
    private CartaoEntity idCartao;

}