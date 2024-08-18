package br.com.satyan.stering.saita.fincancaspessoais.repository;

import br.com.satyan.stering.saita.fincancaspessoais.entity.BancoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoRepository extends JpaRepository<BancoEntity, Integer> {
}