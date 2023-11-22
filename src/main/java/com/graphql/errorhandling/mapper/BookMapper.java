package com.graphql.errorhandling.mapper;

import com.graphql.errorhandling.model.SelectBookRequest;
import com.graphql.errorhandling.model.SelectBookResponse;
import com.graphql.errorhandling.repository.dto.SelectBookRepositoryInDto;
import com.graphql.errorhandling.repository.dto.SelectBookRepositoryOutDto;
import com.graphql.errorhandling.service.dto.SelectBookServiceInDto;
import com.graphql.errorhandling.service.dto.SelectBookServiceOutDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    SelectBookServiceInDto toSelectBookServiceInDto(SelectBookRequest selectBookRequest);
    SelectBookRepositoryInDto toSelectBookRepositoryInDto(SelectBookServiceInDto selectBookServiceInDto);

    SelectBookServiceOutDto toSelectBookServiceOutDto(SelectBookRepositoryOutDto selectBookRepositoryOutDto);

    SelectBookResponse toSelectBookResponse(SelectBookServiceOutDto selectBookServiceOutDto);
}
