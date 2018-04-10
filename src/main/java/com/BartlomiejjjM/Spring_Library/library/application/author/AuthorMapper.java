package com.BartlomiejjjM.Spring_Library.library.application.author;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class AuthorMapper {

    public static AuthorEntity toAuthorEntity (AuthorDTO authorDTO) {
        return new AuthorEntity(authorDTO.getId(), authorDTO.getName(), authorDTO.getSurname());
    }

    public static AuthorDTO toAuthorDTO (AuthorEntity authorEntity) {
        return new AuthorDTO(authorEntity.getId(),authorEntity.getName(), authorEntity.getSurname());
    }
    public static List<AuthorDTO> toAuthorDTOList (List<AuthorEntity> authorEntityList) {
        return authorEntityList.stream()
                .map(AuthorMapper::toAuthorDTO)
                .collect(Collectors.toList());
    }

}
