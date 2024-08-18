package br.com.satyan.stering.saita.fincancaspessoais.controller;

import br.com.satyan.stering.saita.fincancaspessoais.dto.BancoDto;
import br.com.satyan.stering.saita.fincancaspessoais.mapper.BancoMapper;
import br.com.satyan.stering.saita.fincancaspessoais.repository.BancoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/banco")
public class BancoController {

    private final BancoRepository bancoRepository;
    private final BancoMapper bancoMapper;

    public BancoController(BancoRepository bancoRepository, BancoMapper bancoMapper) {
        this.bancoRepository = bancoRepository;
        this.bancoMapper = bancoMapper;
    }

    @GetMapping
    public List<BancoDto> getBancos() {

        return bancoRepository.findAll()
                .stream()
                .map(bancoMapper::toDto)
                .toList();
    }

    @GetMapping("/{id_banco}")
    public BancoDto getBanco(@PathVariable String id_banco) {

        return bancoMapper.toDto(
                bancoRepository.findById(Integer.parseInt(id_banco))
                        .orElseThrow()
        );
    }
}
