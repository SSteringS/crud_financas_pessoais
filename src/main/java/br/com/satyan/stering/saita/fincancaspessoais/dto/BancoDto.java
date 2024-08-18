package br.com.satyan.stering.saita.fincancaspessoais.dto;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link br.com.satyan.stering.saita.fincancaspessoais.entity.BancoEntity}
 */
@Value
public class BancoDto implements Serializable {
    Integer id;
    String nome;
    String tipo;
}