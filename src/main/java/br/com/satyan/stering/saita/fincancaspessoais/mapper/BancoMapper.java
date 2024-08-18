package br.com.satyan.stering.saita.fincancaspessoais.mapper;

import br.com.satyan.stering.saita.fincancaspessoais.dto.BancoDto;
import br.com.satyan.stering.saita.fincancaspessoais.entity.BancoEntity;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface BancoMapper {
    BancoEntity toEntity(BancoDto bancoDto);

    BancoDto toDto(BancoEntity bancoEntity);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    BancoEntity partialUpdate(BancoDto bancoDto, @MappingTarget BancoEntity bancoEntity);
}