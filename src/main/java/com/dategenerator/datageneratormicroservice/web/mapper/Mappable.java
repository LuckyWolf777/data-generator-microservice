package com.dategenerator.datageneratormicroservice.web.mapper;

public interface Mappable<E, D> {

    E toEntity(D entity);

    D toDto(E entity);

}
